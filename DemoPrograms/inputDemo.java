package DemoPrograms;
import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class inputDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader bfIn = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(bfIn);
        int y = Integer.parseInt(bf.readLine());
        Scanner in = new Scanner(System.in);
        String x = in.next();
        System.out.println(x);
        System.out.println(y);
        System.out.println(LocalDateTime.now());
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(LocalDate.now().format(myFormatObj));
    }
    
}
