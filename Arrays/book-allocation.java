class solution{
    public void bookallocation(int[] arry, int m) {
        int l = 0;
        int h = 0;
        int k = 0;
        while(k<arry.length){
            h += arry[k];
            k++;
        }
        int rs = 0;
        while(l<=h){
            int md = (l+h)/2;
            if(psb(arry,m,md)){
                rs = md;
                h = md-1;        
            }
            else l = md+1;
        }
        System.out.println(rs);
    }
    public static boolean psb(int[] arry,int m,int md){
        int i = 0;
        int rd = 0;
        int std =1;
        while(i<arry.length){
            if(rd+arry[i] <= md){
                rd += arry[i];
                i++;
            }
            else{
                std++;
                rd=0;
            }
            if(std > m){
                return false;
            }
        }
        return true;
    }
}