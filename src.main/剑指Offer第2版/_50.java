package 剑指Offer第2版;

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

    public char firstUniqChar(String s) {
        int slow = 0;
        int fast = 1;
        int length = s.length();

        while (slow < length) {
            if (fast==slow){
                fast++;
            }
            if (fast>s.length()){
                return s.charAt(slow);
            }
            if (s.charAt(fast)==s.charAt(slow)){
                slow++;
                fast=0;
            }
            fast++;

        }
        return ' ';
    }

    public static void main(String[] args) {
        _50 v = new _50();
        char leetcode = v.firstUniqChar("abbaccddeeff");
        System.out.println(leetcode);
    }
}
