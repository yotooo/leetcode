package ½£Ö¸OfferµÚ2°æ;

public class _58_1 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        String result = "";
        for (int i = strings.length-1; i >=0 ; i--) {
                if (strings[i].equals("")){
                    continue;
                }
            result+=strings[i].trim()+" ";
        }
        result = result.trim();
        return result;
    }

    public static void main(String[] args) {
        _58_1 v = new _58_1();
        System.out.println(v.reverseWords("a good   example"));
    }
}
