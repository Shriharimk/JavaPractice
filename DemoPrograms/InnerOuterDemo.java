package DemoPrograms;
class OuterClass{
    class InnerClass{
        public void disp(){
            System.out.println("Form inner class");
        }
    }
    public void disp(){
        {
            System.out.println("Outer class");
        }
    }    
}
public class InnerOuterDemo {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.disp();
        OuterClass.InnerClass obj2 = obj.new InnerClass();
        obj2.disp();
    }
    
}
