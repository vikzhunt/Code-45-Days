class solution{
    public static long no_of_ways(int[] arr, int n){
        long sum = 0;
        for(int i=0;i<n;i++) sum+=arr[i];
        if(sum%3!=0) return 0;
        long tg = sum/3;
        long pfx_sum = 0;
        long ct = 0;
        long ways = 0;
        for(int i=0;i<n-1;i++){
            pfx_sum += arr[i];
            if(pfx_sum==2*tg && i<n-1 ){
                ways += ct;
            }
            if(pfx_sum == tg){
                ct++;
            }
        }
        return ways;
    }
}