package 剑指Offer第2版;

public class _38 {
    /**
     * 输入一个字符串，打印出该字符串中字符的所有排列。
     *
     * ?
     *
     * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
     *
     * ?
     *
     * 示例:
     *
     * 输入：s = "abc"
     * 输出：["abc","acb","bac","bca","cab","cba"]
     * ?
     *
     * 限制：
     *
     * 1 <= s 的长度 <= 8
     */
    public String[] permutation(String s) {
        int size = numsSize(s.length());
        String[] nums = new String[size];
        for (int i = 0; i < s.length(); i++) {

        }
        return null;
    }
    public int numsSize(int length){
        if (length==1){
            return 1;
        }
        return length*numsSize(length-1);
    }

    public static void main(String[] args) {
        _38 v = new _38();

    }
}
