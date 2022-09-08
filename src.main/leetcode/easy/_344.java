package leetcode.easy;

public class _344 {
    public void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }


    public static void main(String[] args) {
        _344 v = new _344();
        char[] chars = new char[]{"h".charAt(0),"e".charAt(0),"l".charAt(0),"l".charAt(0),"o".charAt(0)};
        v.reverseString(chars);
    }
}