class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] lt = new int[n+1];
        int[] rt = new int[n+1];
        lt[0]=arr[0];
        rt[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            lt[i]=Math.max(arr[i],lt[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rt[i]=Math.max(arr[i],rt[i+1]);
        }
        int res = 0;
        for(int i=0;i<n;i++){
            res=res+Math.min(lt[i],rt[i])-arr[i];
        }
        return res;
    }
}