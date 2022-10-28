package ½£Ö¸OfferµÚ2°æ;

import java.util.HashMap;
import java.util.Map;

public class _10_1 {
    private static Map<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            if (n==0){
                return 0;
            }else if (n==1){
                return 1;
            }else {
                int value = fib(n - 1) + fib(n - 2);
                map.put(n,value%1000000007);
                return value%1000000007;
            }
        }

    }

    public static void main(String[] args) {
        _10_1 v = new _10_1();
        System.out.println(v.fib(48));
    }
}
