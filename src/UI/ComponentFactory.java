package UI;

import java.util.List;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.Usage;

public class ComponentFactory {
	
	public ComponentFactory() {
		
	}
	
	public static Model createModel(String name) {
		Model model = UMLFactory.eINSTANCE.createModel();
		model.setName(name);
		return model;
	}
	
	public static Package createPackage(Package _parent, String name) {
		Package _package = _parent.createNestedPackage(name);
		return _package;
	}
	
	
	public static Component createComplexComponent(Package pack, String name, List<Component> components, List<String> ports) {
		Component compo = UMLFactory.eINSTANCE.createComponent();
		compo.setName(name);
		
		compo = (Component) pack.createOwnedType(name, compo.eClass());
		for(Component curr : components) {
			compo.createPackagedElement(curr.getName(), compo.eClass());
		}
		for(String curr : ports) {
			createPort(compo,curr);
		}
		
		return compo;
	}
	

	
	public static Interface createInterface(Package pack, String name) {
		Interface inter = pack.createOwnedInterface(name);
		return inter;
	}
	
	public static Component createComponent(Package pack, String name) {
		Component compo = UMLFactory.eINSTANCE.createComponent();
		compo.setName(name);
		
		compo = (Component) pack.createOwnedType(name, compo.eClass());
		
		return compo;
	}
	
	public static Port createPort(Component complexCompo, String name) {
		Port port = UMLFactory.eINSTANCE.createPort();
		port = complexCompo.createOwnedPort(name, port.getType());
		return port;
	}
	

	
	public static Usage createUsageRelation(Package pack, Component compo, Interface required) {
		Usage use = UMLFactory.eINSTANCE.createUsage();
		pack.getPackagedElement(compo.getName()).createUsage(required);		
		return use;
	}
	
	public static InterfaceRealization createRealizeRelation(String name, Component compo, Interface provided) {
		InterfaceRealization real = compo.createInterfaceRealization(name, provided);
		return real;
	}
	
	public static Component createHierarchy(Component simple, Component complex) {
		complex.createPackagedElement(simple.getName(), complex.eClass());
		return complex;
	}
	
	public static Component createComponentHierarchy(Package pack, String name) {
		Component compo = UMLFactory.eINSTANCE.createComponent();
		compo.setName(name);
		
		return compo;
	}
	

}
