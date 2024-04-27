package GFG.Medium;

import java.util.Scanner;

public class MaxSumRowin2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = in.nextInt();
            }
        }
        findMaxSumRow(a, n, m);
        in.close(); 
    }

    public static void findMaxSumRow(int[][] a, int n, int m) {
        int maxSum = 0;
        int row = 0;
        for(int i =0; i<n; i++){
            int sum = 0;
            for(int j =0; j<m; j++){
                sum = sum + a[i][j];
                if(sum > maxSum){
                    maxSum = sum;
                    row = i;
                }
            }
        }
        System.out.println(row);
    }
    
}
