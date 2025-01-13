class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s=0;
        int cr_sum =0;
        int start =0;
        for(int i=0;i<gas.length;i++){
            s+=(gas[i]-cost[i]);
            cr_sum +=(gas[i]-cost[i]);
            if(cr_sum<0){
                start=i+1;
                cr_sum =0;
            }
        }
        if(s<0) return -1;
        return start;
    }
}