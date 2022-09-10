package 剑指Offer第2版;

import java.util.LinkedHashMap;
import java.util.Map;

public class _50 {
    /**
     * @Author yoto
     * @Description 剑指 Offer 50. 第一个只出现一次的字符
     * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
     * <p>
     * 示例 1:
     * <p>
     * 输入：s = "abaccdeff"
     * 输出：'b'
     * 示例 2:
     * <p>
     * 输入：s = ""
     * 输出：' '
     * <p>
     * <p>
     * 限制：
     * <p>
     * 0 <= s 的长度 <= 50000
     * @Date 2022/9/9 11:18
     **/

    /**
     * 方法一:双指针
     * @param s
     * @return
     */
//    public char firstUniqChar(String s) {
//        int slow = 0;
//        int fast = 0;
//        int length = s.length();
//
//        while (slow != length) {
//            if (fast==s.length()){
//                return s.charAt(slow);
//            }
//            if (fast==slow){
//                fast++;
//                continue;
//            }
//            if (s.charAt(slow) == s.charAt(fast)){
//                slow++;
//                fast=0;
//                continue;
//            }
//
//            fast++;
//        }
//        return ' ';
//    }

    /**
     * 方法二:LinkedHashMap(LinkedHashMap是有序的)
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer total = map.get(s.charAt(i));
            if (total==null){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),total+1);
            }
        }
        for(Map.Entry entry: map.entrySet()){
            if (entry.getValue().equals(1)){
                return (Character) entry.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        _50 v = new _50();
        char leetcode = v.firstUniqChar("asdfadsfb");
        System.out.println(leetcode);
    }
}
