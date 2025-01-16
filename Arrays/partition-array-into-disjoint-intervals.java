class Solution {
    public int partitionDisjoint(int[] nums) {
        int cr = nums[0];
        int mx = nums[0];
        int left = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<cr){
                left = i+1;
                cr = mx;
            }
            else mx = Math.max(mx,nums[i]);
        }
        return left;
    }
}