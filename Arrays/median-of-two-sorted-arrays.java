class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n+m];
        int i=0, j=0, k=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]) res[k++] = nums1[i++];
            else res[k++] = nums2[j++];
        }
        while(i<n) res[k++] = nums1[i++];
        while(j<m) res[k++] = nums2[j++];
        int ln = n+m;
        return (ln%2==0) ? (res[ln/2] + res[(ln/2)-1])/2.0 : res[ln/2];
    }
} 