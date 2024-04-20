package DemoPrograms;
public class ExceptionHandleingDemo {
    public static void main(String[] args) {
        try{
            int a[]={1,2,3};
            System.out.println(a[10]);
        }catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Code control here as normal");

        try{
            int age = 17;
            if(age<18){
                throw new ArithmeticException("Too young");
            }
        }catch(Exception e){
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
