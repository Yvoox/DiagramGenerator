package main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import UI.ComponentFactory;
import compiler.Lexer;
import compiler.Parser;
import java_cup.runtime.ComplexSymbolFactory;

public class Main {
	
	private String dir;
	static private boolean compiler = true;
	
	public Main(String dir) {
		super();
		this.dir = dir;
	}

	public Model createExample() {

		Model model = ComponentFactory.createModel("model");
		Interface entree = ComponentFactory.createInterface(model,"entree");
		Interface sortie = ComponentFactory.createInterface(model,"sortie");
		

		Component compo = ComponentFactory.createComponent(model,"compo");
		ComponentFactory.createUsageRelation(model, compo, entree);
		ComponentFactory.createRealizeRelation(null,compo, sortie);
		
		List<String> ports = new ArrayList<>();
		ports.add("port1");
		ports.add("Port2");
		
		ComponentFactory.createComplexComponent(model, "ComplexCompo", Collections.singletonList(compo), ports);
		
		System.out.println("DONE");
		return model;

	}
	
	private void save (Model model, String output) {
		String directory = new File(dir).getAbsolutePath();
		URI uri = URI.createFileURI(directory).appendSegment(output).appendFileExtension(UMLResource.FILE_EXTENSION);
		ResourceSet resourceSet = new ResourceSetImpl();
		UMLResourcesUtil.init(resourceSet);
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(model);
		try {
			resource.save(null);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private Model readSample (String input) {
		Model model = null;
		try {
	    	ComplexSymbolFactory csf = new ComplexSymbolFactory ();
	    	Lexer l = new Lexer(new FileReader(input+".txt"));
	    	l.setSymbolFactory(csf);
	    	Parser p = new Parser(l, csf);
	    	p.parse();
	    	model = p.getModel();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
	


	public static void main(String[] args) throws Exception {

		String dir = null;
		switch (args.length) {
		case 0 : dir = "."; break;
		case 1 : dir = args[0]; break;
		default : break;
		}
		if (dir == null) return;
		
		Main sample = new Main(dir);

		Model model = null;
		if (compiler) model = sample.readSample ("start");
		else model = sample.createExample();
		
		if (model != null) sample.save (model, "sample" );
	}

}



