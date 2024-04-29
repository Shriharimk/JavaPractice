package DemoPrograms;

class SingleTon {
    public String s;

    private SingleTon(String str){
        System.out.println("called singleTonConstructor with s="+s);
        s = str;
    }

    private static SingleTon single_instance;
    public static SingleTon getInstance(){
        if(single_instance == null){
            single_instance = new SingleTon("Hello world");
        } 
        return single_instance;
    }
    
}

public class SingleTon_Demo{
    public static void main(String[] args) {
        SingleTon x = SingleTon.getInstance();
        SingleTon y = SingleTon.getInstance();
        System.out.println(x.s+" created at instance: "+x);
        System.out.println(y.s+" created at instance: "+y);
    }
}
