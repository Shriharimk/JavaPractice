package DemoPrograms;
interface Demo1{
   public void disp();    
}
public class abstractDemo implements Demo1 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    };
    enum Values {
        TEN,
        TWENTY,
        THIRTY
    }
    public void disp() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        abstractDemo obj = new abstractDemo();
        obj.disp();
        System.out.println(Values.TEN);
    }
}
