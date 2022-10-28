package ½£Ö¸OfferµÚ2°æ;

public class _17 {
    public int[] printNumbers(int n) {
        String numStr = "1";
        for (int i = 0; i < n; i++) {
            numStr+="0";
        }
        int nInt = Integer.valueOf(numStr)-1;
        int[] ints = new int[nInt];
        for (int i = 0; i < nInt; i++) {
            ints[i] = i+1;
        }
        return ints;
    }
}
