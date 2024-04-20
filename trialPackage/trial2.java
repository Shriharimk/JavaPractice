package trialPackage;


abstract class trial3{
    abstract void func();
}
public class trial2 {
    static int x = 10;
    static void out(){
        System.out.println("SOmeting");
    }
    public static void main(String args[]){
        trial t = new trial();
        t.out();
    }
}
class Main extends trial3{
    void func(){
        System.out.println("Something");
    }
    public static void main(String args[]){
        trial2 t =new trial2();
        System.out.println(t);
    }
}
