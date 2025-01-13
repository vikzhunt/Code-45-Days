class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lt = new int[n];
        int[] rt = new int[n];
        lt[0]=1;
        rt[n-1]=1;
        for(int i=1;i<n;i++){
            lt[i]=lt[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rt[i]=rt[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            lt[i]=rt[i]*lt[i];
        }
        return lt;
    }
}