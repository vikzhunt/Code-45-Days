package Strings;

class Solution {
    public String longestPalindrome(String s) {
        if(s.length() <= 1)return s;
        int start = 0, end = 0;
        for(int i=0;i<s.length();i++){
            int l1 = expandCtr(s,i,i+1);
            int l2 = expandCtr(s,i,i);
            int len = Math.max(l1,l2);
            if(len > end-start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start,end+1);
    } 
    public static int expandCtr(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            r++;
            l--;
        }
        return r-l-1;
    }
}