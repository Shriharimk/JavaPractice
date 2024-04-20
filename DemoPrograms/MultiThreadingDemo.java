package DemoPrograms;
import java.util.*;
class MultiDemoRunnable implements Runnable{

    int thNumber = 0;
    public MultiDemoRunnable(int thNumber) {
        this.thNumber = thNumber;
    }
    public void run() {
        System.out.println("through runnable");
        for(int i = 0;i<5;i++){
            System.out.println(i+" "+"From ThreadNumber: "+thNumber);
        }
    }
}
public class MultiThreadingDemo extends Thread {

    int thNumber = 0;
    public MultiThreadingDemo(int thNumber) {
        this.thNumber = thNumber;
    }
    public void run(){
        for(int i = 0;i<5;i++){
            System.out.println(i+" "+"From ThreadNumber: "+thNumber);
        }
    }

    public static void main(String[] args) {
        MultiThreadingDemo th = new MultiThreadingDemo(1);
        th.start();
        MultiThreadingDemo th2 = new MultiThreadingDemo(2);
        th2.start();
        MultiDemoRunnable thread =  new MultiDemoRunnable(5);
        Thread t = new Thread(thread);
        t.start();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            numbers.add(i);
        }
        numbers.forEach((n)->System.out.println(n));

    }
    
}
