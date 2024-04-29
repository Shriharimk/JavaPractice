package DemoPrograms;

class CopyConst{
    int x; String s;
    CopyConst(CopyConst c){
        x = c.x;
        s = c.s;
    }

    CopyConst(int x, String s){
        this.x = x;
        this.s = s;
    }
}

public class CopyConstDemo {
    public static void main(String[] args) {
        CopyConst c = new CopyConst(2,"copy");
        CopyConst c2 = new CopyConst(c);
        System.out.println(c2.x);
        System.out.println(c2.s);
    }
}
