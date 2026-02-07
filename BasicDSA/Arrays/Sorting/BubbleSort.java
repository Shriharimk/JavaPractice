package BasicDSA.Arrays.Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j =0;j<a.length-1;j++){
                if(a[j]<a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i: a){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int a[] =new int[]{
                1,4,6,8,3,2
        };
        bubbleSort(a);
    }
}
