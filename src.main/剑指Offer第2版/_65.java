package 剑指Offer第2版;

import java.math.BigInteger;

public class _65 {
    /**
     * @Author yoto
     * @Description 剑指 Offer 65. 不用加减乘除做加法
     * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
     *
     *
     *
     * 示例:
     *
     * 输入: a = 1, b = 1
     * 输出: 2
     *
     *
     * 提示：
     *
     * a, b 均可能是负数或 0
     * 结果不会溢出 32 位整数
     * @Date 2022/9/9 10:03
    **/


    public int add(int a, int b) {
        BigInteger integerA = new BigInteger(String.valueOf(a));
        BigInteger integerB = new BigInteger(String.valueOf(b));
        BigInteger add = integerA.add(integerB);
        String s = add.toString();
        return Integer.parseInt(s);
    }
}
