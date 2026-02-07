public class ReverseArray {
    public static void main(String[] args) {
        int a[] =new int[]{
                1,2,3,4,5,6,7
        };
        int l=0;
        int r = a.length-1;
        while(l<r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;
            l++;
            r--;
        }
        for(int i:a){
            System.out.println(i);
        }
    }
}
