package trialPackage;
public class trial {
    public void out(){
        System.out.println("Hello form trial class");
    }
    public static void main(String args[]){
        System.out.println("hellow world");
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<5);
        // i = 0;
        // while(i<5){
        //     System.out.println(i);
        //     i++;
        // }
        int a[] = {10,20,30,40};
        for(int j: a){
            System.out.println(j);
        }   
        int b[][] = new int[2][2];
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                b[i][j] = i*j+1;
            }
        }
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    
}
