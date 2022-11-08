package 剑指Offer第2版;

public class _49 {
    /**
     * @Author yoto 
     * @Description
     * 剑指 Offer 49. 丑数
     * 中等
     * 394
     * 相关企业
     * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
     *
     * 示例:
     *
     * 输入: n = 10
     * 输出: 12
     * 解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。
     * 说明:
     *
     * 1 是丑数。
     * n 不超过1690。
     * 注意：本题与主站 264 题相同：https://leetcode-cn.com/problems/ugly-number-ii/
     *
     * @Date 2022/11/8 11:42 
    **/
    public int nthUglyNumber(int n) {
        if (n==1){
            return n;
        }
        int i = 1;
        while (n!=1){
            if (!(i%2!=0&&i%3!=0&&i%5!=0)){
                //说明不为丑数
                n--;
            }
            i++;
        }
        return i;
    }
}