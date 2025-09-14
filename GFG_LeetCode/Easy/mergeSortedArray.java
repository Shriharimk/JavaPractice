package LeetCode.Easy;

public class mergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m + n];
        int i = 0, j = 0, count = 0;
        while (i < m && j < n) {
            if(nums1[i]==0){
                temp[count] = nums2[j];
                j++;
            }
            else if(nums1[j]==0){
                temp[count] = nums1[i];
                i++;
            }
            else if (nums1[i] < nums2[j]) {
                temp[count] = nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                temp[count] = nums2[j];
                j++;
            } else if (nums1[i] == nums2[j]) {
                temp[count] = nums1[i];
                i++;
            }
            count++;
        }
        for(int k = 0; k < nums1.length; k++)
            nums1[k] = temp[k];
        
        return nums1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 0, 0, 0 };
        int b[] = { 2, 5, 6 };
        int anse[] = merge(a, a.length, b, b.length);
        for (int i = 0; i < anse.length; i++) {
            System.out.print(anse[i] + " ");
        }

    }

}
