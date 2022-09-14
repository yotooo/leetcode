package 剑指Offer第2版;

import java.util.HashMap;
import java.util.Map;

public class _43_1 {
    /**
     * 剑指 Offer 43. 1～n 整数中 1 出现的次数
     * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
     *
     * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
     *
     *
     *
     * 示例 1：
     *
     * 输入：n = 12
     * 输出：5
     * 示例 2：
     *
     * 输入：n = 13
     * 输出：6
     *
     *
     * 限制：
     *
     * 1 <= n < 2^31
     */
    public int countDigitOne(int n) {
        String str = "";
        int result = 0;
        for (int i = 1; i <= n; i++) {
            str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(j,j+1).equals("1")){
                    result++;
                }
            }
        }
        return result;
    }
}

