package GFG.Medium;

class CompareVersionNumbers {
        public static int compareVersion(String version1, String version2) {
            String[] v1 = version1.split("\\.");
            String[] v2 = version2.split("\\.");

            int len1 = v1.length;
            int len2 = v2.length;
            int maxLen = Math.max(len1,len2);

            for(int i = 0; i<maxLen;i++){
                String s1 = (i<v1.length)?v1[i]:"0";
                String s2 = (i<v2.length)?v2[i]:"0";

                int n1 = Integer.parseInt(s1);
                int n2 = Integer.parseInt(s2);

                if(n1<n2) return -1;
                else if(n1>n2) return 1;
            }
            return 0;
        }

    public static void main(String[] args) {
        System.out.println(compareVersion("1.2","1.10"));
    }
}
