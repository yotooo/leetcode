package leetcode.easy;

import java.util.Arrays;

public class _242 {
//    public boolean isAnagram(String s, String t) {
//        Map<String, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            String substring = s.substring(i, i + 1);
//            boolean flag = map.containsKey(substring);
//            if (flag) {
//                map.put(substring, map.get(substring) + 1);
//            } else {
//                map.put(substring, 1);
//            }
//        }
//
//        Map<String, Integer> map1 = new HashMap<>();
//        for (int i = 0; i < t.length(); i++) {
//            String substring = t.substring(i, i + 1);
//            boolean flag = map1.containsKey(substring);
//            if (flag) {
//                map1.put(substring, map1.get(substring) + 1);
//            } else {
//                map1.put(substring, 1);
//            }
//        }
//        if (map.equals(map1)){
//            return true;
//        }else {
//            return false;
//        }
//
//    }


    public boolean isAnagram(String s, String t) {
        char[] charss = s.toCharArray();
        char[] charst = t.toCharArray();
        Arrays.sort(charss);
        Arrays.sort(charst);
        return Arrays.equals(charss,charst);

    }

    public static void main(String[] args) {
        _242 v = new _242();
        v.isAnagram("rat","car");
    }
}
