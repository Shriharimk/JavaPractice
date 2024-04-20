package DemoPrograms;
import java.util.ArrayList;

public class arraListDemo {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        for(int i = 0;i<10;i++) {
            double rand =Math.random()*100;
            list.add(rand);
        }
        for(int i = 0;i<10;i++) {
            System.out.println(list.get(i));
        }
    }
}
