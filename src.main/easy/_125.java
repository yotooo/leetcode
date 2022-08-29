package easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _125 {
    public boolean isPalindrome(String s) {
        String regEx="[\n`~!@#$%^&*()+=\\-_|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
        String str = "";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(s);//这里把想要替换的字符串传进来
        s = m.replaceAll(str).trim().toLowerCase();


        StringBuffer stringBuffer = new StringBuffer(s);
        String s1 = stringBuffer.toString();
        StringBuffer reverse = stringBuffer.reverse();
        String s2 = reverse.toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        _125 v = new _125();
        boolean palindrome = v.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);

    }
}
