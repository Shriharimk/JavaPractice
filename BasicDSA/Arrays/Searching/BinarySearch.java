package BasicDSA.Arrays.Searching;

public class BinarySearch
{
    public static void binarySearch(int[] a, int target) {
        int l = 0;
        int h = a.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]>target){
                h = mid-1;
            }
            else if(a[mid]<target){
                l= mid +1;
            }
            else{
                if(a[mid]==target){ System.out.println("found at pos : "+ mid);return;}
            }
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {

        int a[] = new int[]{
                1,2,3,4,5,6
        };
        binarySearch(a,3);
    }
}
