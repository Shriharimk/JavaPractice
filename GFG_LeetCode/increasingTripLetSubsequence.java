package GFG;

class increasingTripLetSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x <= first) {
                first = x;              // smallest so far
            } else if (x <= second) {
                second = x;             // next bigger after first
            } else {
                return true;            // found x > second -> first < second < x
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new increasingTripLetSubsequence().increasingTriplet(new int[]{1,2,1,3}));
    }
}
