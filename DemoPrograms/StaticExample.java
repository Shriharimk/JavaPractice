package DemoPrograms;

public class StaticExample {
    private static int staticVariable = 10;  // Static variable
    
    private int nonStaticVariable = 20;       // Non-static variable
    
    public static void staticMethod() {
        // We can access static variables directly in a static method
        System.out.println("Static variable: " + staticVariable);
        
        // We cannot access non-static variables directly in a static method
        // System.out.println("Non-static variable: " + nonStaticVariable);  // Error
    }
    
    public void nonStaticMethod() {
        // Both static and non-static variables can be accessed directly in a non-static method
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Non-static variable: " + nonStaticVariable);
    }
    
    public static void main(String[] args) {
        // We can call a static method without creating an instance of the class
        staticMethod();
        
        // To call a non-static method, we need to create an instance of the class
        StaticExample obj = new StaticExample();
        obj.nonStaticMethod();
    }  
    
}
// class StaticMethod { 
// 	public static void printMe() 
// 	{ 
// 		System.out.println("Static Method access directly by class name!"); 
// 	} 
// } 
// class StaticExample { 
// 	public static void main(String args[]) 
// 	{ 
// 		StaticMethod.printMe(); 
// 	} 
// } 
