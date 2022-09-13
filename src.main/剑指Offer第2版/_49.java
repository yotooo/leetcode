package ½£Ö¸OfferµÚ2°æ;

public class _49 {
    public int nthUglyNumber(int n) {
        int val = 0;
        int myN = 0;
        while(myN!=n){
            if (val==1||val%2==0||val%3==0||val%5==0){
                myN++;
            }
            val++;
        }
        return val;
    }
}