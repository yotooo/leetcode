package ½£Ö¸OfferµÚ2°æ;

import java.util.HashMap;
import java.util.Map;

public class _10_2 {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static int numWays(int n) {
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            if (n == 0) {
                return 1;
            } else if (n == 1) {
                return 1;
            } else if (n == 2) {
                return 2;
            } else {
                int value = numWays(n - 1) + numWays(n - 2);
                map.put(n, value % 1000000007);
                return value % 1000000007;
            }
        }
    }


    public static int numWays1(int n) {
        if (n <= 2) {
            return n;
        }
        n = n + 1;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n-1]%1000000007;
    }

    public static void main(String[] args) {
        System.out.println(numWays(100));
        System.out.println(numWays1(100));
    }
}
