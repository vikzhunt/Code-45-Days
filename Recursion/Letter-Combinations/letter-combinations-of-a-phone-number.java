import java.util.*;

class Solution {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> li = new ArrayList<>();
        if(digits.length()==0){
            return li;
        }
        keypad(digits,"",li);
        return li;
    }
    public static void keypad(String digits,String ans,List<String> li){
        if(digits.length()==0){
            li.add(ans);
            return;
        }
        char ch = digits.charAt(0);
        String press = map[ch-'0'];
        for (int i = 0; i < press.length(); i++) {
            keypad(digits.substring(1),ans+press.charAt(i),li);
        }
    }
}