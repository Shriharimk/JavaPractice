package GFG.Medium;

import java.util.ArrayList;

public class SpiralMatrix {
    static ArrayList<Integer> spirallyTraverse(int a[][], int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, right = c - 1, left = 0, bottom = r - 1;

        while (top <= bottom && left <= right) {
            // first row
            for (int i = left; i <= right; i++) {
                list.add(a[left][i]);
            }
            top++;

            // last clmn
            for (int i = top; i <= bottom; i++) {
                list.add(a[i][right]);

            }
            right--;

            // last row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(a[bottom][i]);
                }
                bottom--;
            }

            // left clmn
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(a[i][left]);

                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(spirallyTraverse(a, 04, 04));

    }

}
