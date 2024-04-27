package GFG.Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingInteger {

    // public static void missingElement(int a[]){
    // int sum = 0;
    // // Arrays.sort(a);
    // int N = a[a.length - 1];
    // for(int i = 0; i < a.length; i++){
    // sum = sum + a[i];
    // }
    // int expectedSum = N * (N - 1)/2;
    // System.out.println(sum);
    // System.out.println(expectedSum);
    // System.out.println("Missing element: "+(expectedSum - sum));
    // }

    // IDK HOW TO UPDATE THE VALUE OF THE COUNTER CORRECTLY
    // public static void missingElement(int a[]) {
    // Arrays.sort(a);
    // ArrayList<Integer> missing = new ArrayList<Integer>();
    // int counter = a[0];
    // for (int j = 0; j < a.length; j++) {
    // System.out.print(a[j] + " ");
    // }
    // System.out.println();
    // for (int i = 0; i < a.length; i++) {
    // if (a[i] != counter) {
    // missing.add(counter);
    // counter = a[i]+1;
    // continue;
    // }
    // counter++;
    // }
    // System.out.println("Missing elements:");
    // for (int j = 0; j < missing.size(); j++) {
    // System.out.print(missing.get(j) + " ");
    // }
    // }

    public static void missingElement(int a[]) {
        Arrays.sort(a);
        int n = a.length;
        int counter = a[0];
        for (int i = 0; i <= n; i++) {
            if (a[i] != counter) {
                System.out.println(counter);
                return;
            }
            counter++;
        }
    }

    public static void missingElementHashing(int arr[]) {
        int i;
        int N = arr.length;
        int temp[] = new int[N + 1];
        //setting the hash array values initially to 0 false
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }

        //setting the hash array values to 1 true
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;// when i = 0: temp[0]= 1, i =2: temp[2] = 1,
        }

        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println(ans);
    }

    //missingXOR
        static int missingElementXOR(int a[], int n)
    {
        int x1 = a[0];
        int x2 = 1;

        // For xor of all the elements in array
        for (int i = 1; i < n; i++)
            x1 = x1 ^ a[i];

        // For xor of all the elements from 1 to n+1
        for (int i = 2; i <= n + 1; i++)
            x2 = x2 ^ i;

        System.out.println(x1 ^ x2);
        return x2;
    }

    public static void main(String[] args) {
        int a[] = { 1,2,5,6, 3};
        // missingElement(a);
        // missingElementHashing(a);
        missingElementXOR(a,a.length);
    }

}
