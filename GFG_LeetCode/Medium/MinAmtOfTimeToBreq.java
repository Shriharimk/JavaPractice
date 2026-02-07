package GFG.Medium;


class MinAmtOfTimeToBreq{
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] acc = new long[n + 1];
        for (int i = 0; i < n; i++) {
            acc[i + 1] = acc[i] + skill[i];
        }
        long t = 0, t2 = 0;
        for (int j = 1; j < m; j++) {
            t2 = 0;
            for (int i = 0; i < n; i++) {
                t2 = Math.max(t2, t + i);
            }
            t = t2;
        }
        return t + mana[m - 1] * acc[n];
    }

    public static void main(String[] args) {
        System.out.println(new MinAmtOfTimeToBreq().minTime(new int[]{1,5,2,4},new int[]{5,1,4,2}));
    }
}
