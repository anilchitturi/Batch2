package polymorphism;

public class TestMethod {


	     public static void main (String args []) {
	        // BaseClass reference and object
	        BaseClass obj1 = new BaseClass(); 
	        // BaseClass reference but DerivedClass object
	        BaseClass obj2 = new DerivedClass(); 
	        // Calls the method from BaseClass class
	        obj1.methodToOverride(); 
	        //Calls the method from DerivedClass class
	        obj2.methodToOverride(); 
	     }
	}
