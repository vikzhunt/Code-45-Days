// ------- TLE -------

// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
//         int n=nums.length;
//         int res=nums[0];
//         for(int i=0;i<n;i++){
//             int s=0;
//             int max=nums[i];
//             for(int j=0;j<n;j++){
//                 if(s<0) s=0;
//                 s+=nums[(i+j)%n];
//                 max=Math.max(max,s);
//             }
//             res=Math.max(res,max);
//         }
//         return res;
//     }
// }

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int cr_max, cr_min, max_s, min_s, s;
        cr_max = cr_min = max_s = min_s = s = nums[0];

        for(int i=1;i<n;i++){
            cr_max = Math.max(cr_max + nums[i], nums[i]);
            max_s = Math.max(max_s, cr_max);
            cr_min = Math.min(cr_min + nums[i], nums[i]);
            min_s = Math.min(min_s, cr_min);
            s+=nums[i];
        }
        return s==min_s ? max_s : Math.max(max_s, s-min_s); 
    }
}
