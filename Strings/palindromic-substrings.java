class Solution {
    public int countSubstrings(String s) {
        return pallindromic(s);
    }
    public static int pallindromic(String s) {
        int n = s.length();
        int odd = 0;
        for(int i=0;i<n;i++){
            for(int j=0;i-j>=0 && i+j<n;j++){
                if(s.charAt(i-j) != s.charAt(i+j)) break;
                odd++;
            }
        }
        int eve = 0;
        for(double i=0.5;i<n;i++){
            for(double j=0.5;i-j>=0 && i+j<n;j++){
                if(s.charAt((int)(i-j)) != s.charAt((int)(i+j))) break;
                eve++;
            }
        }
        return odd + eve;
    }
}