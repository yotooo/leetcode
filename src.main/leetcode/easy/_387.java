package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class _387 {
//    public int firstUniqChar(String s) {
//        one:for(int i = 0;i <s.length();i++){
//            two:for(int j =0;j<s.length();j++){
//                if (i==j){
//                    j++;
//                    if (j==s.length()){
//                        return s.length()-1;
//                    }
//                }
//                String s1 = s.substring(i, i + 1);
//                String s2 = s.substring(j, j + 1);
//                if(s1.equals(s2)){
//                    continue one;
//                }
//            }
//            return i;
//        }
//        return -1;
//    }


    public int firstUniqChar(String s) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        _387 v = new _387();
        int i = v.firstUniqChar(s);
        System.out.println(i);


    }
}