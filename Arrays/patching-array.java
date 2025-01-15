class Solution {
    public int minPatches(int[] nums, int n) {
        int res =0;
        int i=0;
        long np=1;
        while(np<=n){
            if(i<nums.length && nums[i]<=np){
                np+=nums[i];
                i++;
            }else{
                np+=np;
                res++;
            }
        }
        return res;
    }
}