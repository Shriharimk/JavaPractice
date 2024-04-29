package GFG.DP;

public class EditDistance {

    public static int min(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    //https://www.youtube.com/watch?v=decikM59da4&list=PLeF0b8iqbx4mTBJZ5ukIYj92_B4k2L1-8&index=41&ab_channel=ShashankSagarJha
    public static int ediDistDP(String s1, String s2, int m, int n){
        int dp[][] = new int[m+1][n+1];

        for(int i =0; i<=m; i++){
            for(int j = 0; j<=n; j++){
                if(i==0) 
                    dp[i][j] = j;
                else if(j==0)
                     dp[i][j] = i;
                else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[m][n];
    }

    //https://www.youtube.com/watch?v=ItuoUO5ryzU&list=PLeF0b8iqbx4mTBJZ5ukIYj92_B4k2L1-8&index=39&ab_channel=ShashankSagarJha
    public static int editDist(String s1, String s2, int m, int n){
        if(n==0 || m==0) return Math.max(m,n);

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return editDist(s1,s2,m-1,n-1);
        }

        return 1+ min(editDist(s1, s2, m, n-1), 
                            editDist(s1, s2, m-1, n),
                            editDist(s1, s2, m-1, n-1));

    }
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gesek";
        System.out.println(editDist(s1,s2,s1.length(), s2.length()));
        System.out.println(ediDistDP(s1,s2,s1.length(), s2.length()));
    }
    
}
