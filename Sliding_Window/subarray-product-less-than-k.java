
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int c=0,l=0,r=0,p=1;
        while(r<nums.length){
            p*=nums[r];
            while(p>=k) p/=nums[l++];
            c+=1+(r-l);
            r++;
        }
        return c;
    }
}