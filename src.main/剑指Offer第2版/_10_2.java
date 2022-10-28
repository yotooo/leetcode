package ½£Ö¸OfferµÚ2°æ;

import java.util.HashMap;
import java.util.Map;

public class _10_2 {
    private static Map<Integer,Integer> map = new HashMap<>();
    public int numWays(int n) {
        if (map.containsKey(n)){
            return map.get(n);
        }else {
            if (n==0){
                return 1;
            }else if (n==1){
                return 1;
            }else if (n==2){
                return 2;
            }else {
                int value = numWays(n - 1) + numWays(n - 2);
                map.put(n,value%1000000007);
                return value%1000000007;
            }
        }
    }
}
