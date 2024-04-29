package DemoPrograms;

class ClassVariables{
    static String s;
    public void print(){
        System.out.println(s);;
    }
}

public class ClassVariablesDemo {
    public static void main(String[] args) {
        ClassVariables c = new ClassVariables();
        ClassVariables d = new ClassVariables();
        c.s = "Hello";
        d.s = "World";
        c.print();
        d.print();
    }    
}
