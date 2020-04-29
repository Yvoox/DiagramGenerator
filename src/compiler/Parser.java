
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Apr 17 17:26:42 CEST 2018
//----------------------------------------------------

package compiler;

import UI.DiagramFactory;
import org.eclipse.uml2.uml.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Apr 17 17:26:42 CEST 2018
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\040\000\002\020\002\000\002\002\006\000\002\002" +
    "\004\000\002\003\002\000\002\003\004\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\021\002\000\002\005\011\000\002\006\002\000\002" +
    "\006\006\000\002\007\002\000\002\007\006\000\002\010" +
    "\003\000\002\010\005\000\002\011\003\000\002\011\005" +
    "\000\002\012\003\000\002\013\003\000\002\013\005\000" +
    "\002\014\004\000\002\014\004\000\002\014\004\000\002" +
    "\022\002\000\002\015\011\000\002\015\003\000\002\016" +
    "\002\000\002\016\006\000\002\017\002\000\002\017\006" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\004\004\004\001\002\000\004\023\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\uffff\001\002" +
    "\000\020\002\001\005\001\006\001\011\001\021\001\022" +
    "\001\023\001\001\002\000\020\002\ufffe\005\ufffe\006\ufffe" +
    "\011\ufffe\021\ufffe\022\ufffe\023\ufffe\001\002\000\020\002" +
    "\000\005\013\006\012\011\020\021\021\022\014\023\024" +
    "\001\002\000\004\023\056\001\002\000\004\023\030\001" +
    "\002\000\004\023\027\001\002\000\020\002\ufffd\005\ufffd" +
    "\006\ufffd\011\ufffd\021\ufffd\022\ufffd\023\ufffd\001\002\000" +
    "\020\002\ufff9\005\ufff9\006\ufff9\011\ufff9\021\ufff9\022\ufff9" +
    "\023\ufff9\001\002\000\020\002\ufffa\005\ufffa\006\ufffa\011" +
    "\ufffa\021\ufffa\022\ufffa\023\ufffa\001\002\000\004\023\026" +
    "\001\002\000\004\023\025\001\002\000\020\002\ufffc\005" +
    "\ufffc\006\ufffc\011\ufffc\021\ufffc\022\ufffc\023\ufffc\001\002" +
    "\000\020\002\ufffb\005\ufffb\006\ufffb\011\ufffb\021\ufffb\022" +
    "\ufffb\023\ufffb\001\002\000\020\002\uffee\005\uffee\006\uffee" +
    "\011\uffee\021\uffee\022\uffee\023\uffee\001\002\000\024\002" +
    "\uffea\005\uffea\006\uffea\011\uffea\017\uffea\020\uffea\021\uffea" +
    "\022\uffea\023\uffea\001\002\000\024\002\uffeb\005\uffeb\006" +
    "\uffeb\011\uffeb\017\uffeb\020\uffeb\021\uffeb\022\uffeb\023\uffeb" +
    "\001\002\000\024\002\uffe9\005\uffe9\006\uffe9\011\uffe9\017" +
    "\uffe9\020\uffe9\021\uffe9\022\uffe9\023\uffe9\001\002\000\004" +
    "\014\ufff8\001\002\000\004\014\032\001\002\000\010\007" +
    "\033\010\ufff6\015\ufff6\001\002\000\004\016\047\001\002" +
    "\000\006\010\036\015\ufff4\001\002\000\004\015\046\001" +
    "\002\000\004\016\037\001\002\000\004\023\041\001\002" +
    "\000\006\017\044\020\043\001\002\000\006\017\uffee\020" +
    "\uffee\001\002\000\006\017\ufff0\020\ufff0\001\002\000\004" +
    "\023\041\001\002\000\004\015\ufff3\001\002\000\006\017" +
    "\uffef\020\uffef\001\002\000\020\002\ufff7\005\ufff7\006\ufff7" +
    "\011\ufff7\021\ufff7\022\ufff7\023\ufff7\001\002\000\006\006" +
    "\012\023\052\001\002\000\006\017\054\020\053\001\002" +
    "\000\006\017\ufff2\020\ufff2\001\002\000\006\017\uffe6\020" +
    "\uffe6\001\002\000\006\006\012\023\052\001\002\000\006" +
    "\010\ufff5\015\ufff5\001\002\000\006\017\ufff1\020\ufff1\001" +
    "\002\000\004\014\uffe8\001\002\000\004\014\060\001\002" +
    "\000\010\012\062\013\uffe5\015\uffe5\001\002\000\006\013" +
    "\071\015\uffe3\001\002\000\004\016\063\001\002\000\010" +
    "\011\020\021\021\022\014\001\002\000\006\017\uffed\020" +
    "\uffed\001\002\000\006\017\067\020\066\001\002\000\010" +
    "\011\020\021\021\022\014\001\002\000\006\013\uffe4\015" +
    "\uffe4\001\002\000\006\017\uffec\020\uffec\001\002\000\004" +
    "\016\074\001\002\000\004\015\073\001\002\000\024\002" +
    "\uffe7\005\uffe7\006\uffe7\011\uffe7\017\uffe7\020\uffe7\021\uffe7" +
    "\022\uffe7\023\uffe7\001\002\000\010\011\020\021\021\022" +
    "\014\001\002\000\006\017\076\020\066\001\002\000\004" +
    "\015\uffe2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\074\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\020\007\001\001" +
    "\000\004\003\010\001\001\000\014\004\014\005\021\012" +
    "\015\014\016\015\022\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\021\030\001\001\000\002\001\001\000\004\006\033\001" +
    "\001\000\002\001\001\000\004\007\034\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\011\037\012\041\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\044\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\010\047\015\050\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\054\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\022\056\001\001\000\002\001\001\000\004\016" +
    "\060\001\001\000\004\017\071\001\001\000\002\001\001" +
    "\000\006\013\064\014\063\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\014\067\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\013\074\014\063\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP_actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP_actions();
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP_do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public void report_error(String message, Object info) {
        StringBuffer m = new StringBuffer("Error");
		m.append (info.toString());
        m.append(" : "+message);
        System.err.println(m.toString());
    }
   
    public void report_fatal_error(String message, Object info) {
        report_error(message, info);
        System.exit(1);
    }

	private DiagramFactory factory;
    
	public Model getModel () {
		return factory.getModel();
	}

	private DiagramFactory getFactory () {
		if (factory == null) factory = new DiagramFactory ();
		return factory;
	}



/** Cup generated class to encapsulate user supplied action code.*/
class CUP_actions {

  /** Constructor */

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP_do_action(
    int                        CUP_act_num,
    java_cup.runtime.lr_parser CUP_parser,
    java.util.Stack            CUP_stack,
    int                        CUP_top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP_result;

      /* select the action based on the action number */
      switch (CUP_act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // RealizeLinks ::= REALIZE OPEN_BRACKET Interfaces CLOSE_BRACKET 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("RealizeLinks",13, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // RealizeLinks ::= 
            {
              Object RESULT =null;
		 RESULT = null; 
              CUP_result = getSymbolFactory().newSymbol("RealizeLinks",13, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // UseLinks ::= USE OPEN_BRACKET Interfaces CLOSE_BRACKET 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("UseLinks",12, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // UseLinks ::= 
            {
              Object RESULT =null;
		 RESULT = null; 
              CUP_result = getSymbolFactory().newSymbol("UseLinks",12, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // Component ::= NAME 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		 getFactory().addComponentInto(name); 
              CUP_result = getSymbolFactory().newSymbol("Component",11, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // Component ::= COMPONENT NAME NT$2 OPEN_CURLY UseLinks RealizeLinks CLOSE_CURLY 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-4)).value;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-5)).value;
		 getFactory().pop (); 
              CUP_result = getSymbolFactory().newSymbol("Component",11, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // NT$2 ::= 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
 getFactory().pushComponent(name); 
              CUP_result = getSymbolFactory().newSymbol("NT$2",16, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Interface ::= REALIZE_INTERFACE NAME 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		getFactory().addRealizeLink(name); 
              CUP_result = getSymbolFactory().newSymbol("Interface",10, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Interface ::= USE_INTERFACE NAME 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		getFactory().addUseLink(name); 
              CUP_result = getSymbolFactory().newSymbol("Interface",10, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Interface ::= INTERFACE NAME 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		getFactory().addInterface(name); 
              CUP_result = getSymbolFactory().newSymbol("Interface",10, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Interfaces ::= Interfaces COMA Interface 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Interfaces",9, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Interfaces ::= Interface 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Interfaces",9, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Port ::= NAME 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
		getFactory().addPort(name); 
              CUP_result = getSymbolFactory().newSymbol("Port",8, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Ports ::= Ports COMA Port 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Ports",7, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Ports ::= Port 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Ports",7, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Components ::= Components COMA Component 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Components",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Components ::= Component 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Components",6, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // OptionalPorts ::= O_PORT OPEN_BRACKET Ports CLOSE_BRACKET 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("OptionalPorts",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // OptionalPorts ::= 
            {
              Object RESULT =null;
		 RESULT = null; 
              CUP_result = getSymbolFactory().newSymbol("OptionalPorts",5, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // OptionalContains ::= CONTAINS OPEN_BRACKET Components CLOSE_BRACKET 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("OptionalContains",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // OptionalContains ::= 
            {
              Object RESULT =null;
		 RESULT = null; 
              CUP_result = getSymbolFactory().newSymbol("OptionalContains",4, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ComplexComponent ::= COMPLEXCOMPONENT NAME NT$1 OPEN_CURLY OptionalContains OptionalPorts CLOSE_CURLY 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-4)).value;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-5)).value;
		 getFactory().pop (); 
              CUP_result = getSymbolFactory().newSymbol("ComplexComponent",3, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$1 ::= 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
 getFactory().pushComponent(name); 
              CUP_result = getSymbolFactory().newSymbol("NT$1",15, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Declaration ::= Port 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Declaration",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Declaration ::= Interface 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Declaration",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Declaration ::= Component 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Declaration",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Declaration ::= ComplexComponent 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Declaration",2, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Declarations ::= Declarations Declaration 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Declarations",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Declarations ::= 
            {
              Object RESULT =null;

              CUP_result = getSymbolFactory().newSymbol("Declarations",1, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= Model EOF 
            {
              Object RESULT =null;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		RESULT = start_val;
              CUP_result = getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP_parser.done_parsing();
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Model ::= T_MODEL NAME NT$0 Declarations 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-1)).value;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.elementAt(CUP_top-2)).value;
		 getFactory().pop (); 
              CUP_result = getSymbolFactory().newSymbol("Model",0, RESULT);
            }
          return CUP_result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
		String name = (String)((java_cup.runtime.Symbol) CUP_stack.peek()).value;
 getFactory().pushModel (name); 
              CUP_result = getSymbolFactory().newSymbol("NT$0",14, RESULT);
            }
          return CUP_result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

}
