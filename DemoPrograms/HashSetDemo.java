package DemoPrograms;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        //Insertion
        set.add("foo");
        set.add("foo");
        set.add("bar");
        set.add("baz");

        //Print set
        System.out.println(set);

        //search
        System.out.println(set.contains("foo"));
        System.out.println(set.contains("bar"));
        System.out.println(set.contains("zzz"));

        //Deletion
        set.remove("foo");
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
