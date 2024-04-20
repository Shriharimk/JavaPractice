package GFG.Easy;

public class RearrangeArray { // rearrange array so all negative on one side all positive on one side

    // can directly sort the arrays but tat will take O(N^2) or O(N logN) time this
    // approach takes O(N)

    public static void reArrange(int a[]) {
        System.out.println("recied array" + a.length);
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int a[] = { -3, 2, 3, -5, -4, 9 };
        reArrange(a);
    }
}
