class Solution {
    public int characterReplacement(String s, int k) {
        int[] ct = new int[26];
        int res=0;
        int max=0,start =0;
        for(int i=0;i<s.length();i++){
            ct[s.charAt(i)-'A']++;
            max=Math.max(max,ct[s.charAt(i)-'A']);
            if(i-start-max+1 > k){
                ct[s.charAt(start)-'A']--;
                start++;
            }
            res=Math.max(res,i-start+1);
        }
        return res;
    }
}