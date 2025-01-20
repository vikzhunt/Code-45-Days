class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder res = new StringBuilder();
        int ans=0;
        for(char c:s.toCharArray()){
            int idx=res.indexOf(Character.toString(c));
            if(idx!=-1)res.delete(0,idx+1);
            res.append(c);
            ans=Math.max(ans,res.length());
        }
        return ans;
    }
}