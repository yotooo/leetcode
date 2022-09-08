package leetcode.easy;

public class _125 {
    public boolean isPalindrome(String s) {
//        String regEx="[\n`~!@#$%^&*()+=\\-_|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。， 、？]";
//        String str = "";
//        Pattern p = Pattern.compile(regEx);
//        Matcher m = p.matcher(s);//这里把想要替换的字符串传进来
//        s = m.replaceAll(str).trim().toLowerCase();
//
//
//        StringBuffer stringBuffer = new StringBuffer(s);
//        String s1 = stringBuffer.toString();
//        StringBuffer reverse = stringBuffer.reverse();
//        String s2 = reverse.toString();
//        return s1.equals(s2);


        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (left < right&&!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right&&!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _125 v = new _125();
        boolean palindrome = v.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);

    }
}
