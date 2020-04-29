package UI;



import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Model;

import UI.Context;
import UI.ComponentFactory;

public class DiagramFactory {


	private Model model;
	private Context context = new Context();



	public Model getModel() {
		return model;
	}

	public void pushModel (String name) {
		Model m = ComponentFactory.createModel(name);
		model = m;
		context.push(m);
	}

	public void pop () {
		context.pop();
	}

	public void pushComponent(String name) {
		Model model = (Model) context.top();
		Component c = ComponentFactory.createComponent(model, name);		
		context.push(c);
	}
	
	public void pushComplexComponent(String name) {
		Model model = (Model) context.top();
		Component c = ComponentFactory.createComponent(model, name);		
		context.push(c);
	}

	public void addInterface(String name) {
		Model model = (Model) context.top();
		ComponentFactory.createInterface(model, name);
	}
	
	public void addPort(String name) {
		Component c = (Component) context.top();
		ComponentFactory.createPort(c, name);
	}

	public void addUseLink(String name) {

		Component c = (Component) context.top();
		
		if(model.getOwnedType(name) != null) {
			Interface inter = (Interface) model.getOwnedType(name);
			ComponentFactory.createUsageRelation(model, c, inter);
		}
		else {
			ComponentFactory.createUsageRelation(model, c, ComponentFactory.createInterface(model, name));
		}
	}

	public void addRealizeLink(String name) {
		Component c = (Component) context.top();
		if(model.getOwnedType(name) != null) {
			Interface inter = (Interface) model.getOwnedType(name);
			ComponentFactory.createRealizeRelation(null,c,inter);
		}
		else {
			ComponentFactory.createRealizeRelation(null, c, ComponentFactory.createInterface(model, name));
		}

	}
	
	public void addComponentInto(String name) {
		Component c = (Component) context.top();
		
		if(model.getOwnedType(name) != null) {
			System.out.println("Component "+name+" already exist");
			Component simple = (Component) model.getOwnedType(name);
			
			
			ComponentFactory.createHierarchy(simple,c);
			
			if(!simple.allRealizedInterfaces().isEmpty()) {
				System.out.println("There's Interface Realization");
				System.out.println(simple.allRealizedInterfaces().toString());
				for(Interface curr : simple.allRealizedInterfaces()) {
					System.out.println("Let's copy them");
					InterfaceRealization inter= ComponentFactory.createRealizeRelation(curr.getName(), simple,curr);
					System.out.println(inter.toString());
				}
			}
			
			simple.destroy();
		}
		else {
			ComponentFactory.createHierarchy(ComponentFactory.createComponentHierarchy(model, name),c);
		}
	}

}
