package ½£Ö¸OfferµÚ2°æ;

public class _15 {
    public int hammingWeight(int n) {
        String s =Integer.toBinaryString(n);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i,i+1).equals("1")){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _15 v = new _15();
        System.out.println(v.hammingWeight(11));
    }
}
