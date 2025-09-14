package GFG.Medium;

import java.util.Arrays;

public class MinPlatform {

    public static void findMinPlatforms(int arr[], int dep[]) {
        // frist sort both the arrays
        int platForm = 1, result = 0;
        int i = 1, j = -0; // after the first train has already arrived
        Arrays.sort(arr);
        Arrays.sort(dep);

        while (i < arr.length && j < dep.length) {
            if (arr[i] <= dep[j]) {
                platForm++;
                i++;
            } else if (arr[i] > dep[j]) {
                platForm--;
                j++;
            }
            if (result < platForm) {
                result = platForm;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        findMinPlatforms(arr, dep);
    }

}
