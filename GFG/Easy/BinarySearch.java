package GFG.Easy;

public class BinarySearch {

    public static void binarySearch(int a[], int x){
        int l = 0, h = a.length - 1;
        while(l<=h){
            int mid = (l + h)/2;
            if(a[mid] == x){
                System.out.println("Found at position: "+mid);
                return;
            }else if(a[mid] <x){
                h = mid;
            }else{
                l = mid + 1;
            }
        }
        System.out.println("Element not found");
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        binarySearch(a,5);
    }
    
}
