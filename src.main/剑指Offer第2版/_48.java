package ½£Ö¸OfferµÚ2°æ;

public class _48 {
    public static int lengthOfLongestSubstring(String s) {
        String resultStr = "";
        one:
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            two:
            for (int j = i; j < s.length(); j++) {
                String substring = s.substring(j-1, j);
                if (str.length()>resultStr.length()){
                    resultStr = str;
                }
                if (str.contains(substring)) {
                    break two;
                }else {
                    str += substring;
                }
            }
        }
        return resultStr.length();
    }

    public static void main(String[] args) {
        int abcabcbb = lengthOfLongestSubstring("pwwkew");
        System.out.println(abcabcbb);
    }
}
