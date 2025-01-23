import java.util.*;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> li = new ArrayList<>();
        lexCount(n,0,li);
        return li;
    }
    public static void lexCount(int n,int ans,List<Integer> li ){
        int i = 0;
        if(ans>n) return;
        else if(ans==0) i=1;
        else li.add(ans);
        for(;i<=9;i++){
            lexCount(n,ans*10+i,li);
        }
    }
}