package 剑指Offer第2版;


/**
 * @Author yoto
 * @Description 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 示例 1：
 *
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 * 示例 2:
 *
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 * 提示：
 *
 * 2 <= n <= 58
 * @Date 2022/11/4 9:51
**/

/**
 * @Author yoto
 * @Description 方法一：动态规划
 * 这道题给定一个大于 1 的正整数 n，要求将 n 拆分成至少两个正整数的和，并使这些正整数的乘积最大化，返回最大乘积。
 *
 * 令 x 是拆分出的第一个正整数，则剩下的部分是 n?x，n?x 可以不继续拆分，或者继续拆分成至少两个正整数的和。由于每个正整数对应的最大乘积取决于比它小的正整数对应的最大乘积，因此可以使用动态规划求解。
 *
 * 创建数组 dp，其中 dp[i] 表示将正整数 i 拆分成至少两个正整数的和之后，这些正整数的最大乘积。特别地，0 不是正整数，1 是最小的正整数，0 和 1 都不能拆分，因此 dp[0]=dp[1]=0。
 *
 * 当 i≥2时，假设对正整数 i 拆分出的第一个正整数是 j（1≤j<i），则有以下两种方案：
 *
 * 将 i 拆分成 j 和 i?j 的和，且 i?j不再拆分成多个正整数，此时的乘积是 j×(i?j)；
 *
 * 将 i 拆分成 j 和 i?j 的和，且 i?j继续拆分成多个正整数，此时的乘积是 j×dp[i?j]。
 *
 * 因此，当 j 固定时，有 dp[i]=max?(j×(i?j),j×dp[i?j])\textit{dp}[i]=\max(j \times (i-j), j \times \textit{dp}[i-j])dp[i]=max(j×(i?j),j×dp[i?j])。由于 jjj 的取值范围是 111 到 i?1i-1i?1，需要遍历所有的 jjj 得到 dp[i]\textit{dp}[i]dp[i] 的最大值，因此可以得到状态转移方程如下：
 *
 * dp[i]=max?1≤j<i{max?(j×(i?j),j×dp[i?j])} \textit{dp}[i]=\mathop{\max}\limits_{1 \le j < i}\{\max(j \times (i-j), j \times \textit{dp}[i-j])\}
 * dp[i]=
 * 1≤j<i
 * max
 * ?
 *  {max(j×(i?j),j×dp[i?j])}
 * 最终得到 dp[n]\textit{dp}[n]dp[n] 的值即为将正整数 nnn 拆分成至少两个正整数的和之后，这些正整数的最大乘积。
 *
 * 作者：力扣官方题解
 * 链接：https://leetcode.cn/problems/jian-sheng-zi-lcof/solutions/1794015/jian-sheng-zi-by-leetcode-solution-xku9/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date 2022/11/4 9:52
**/




public class _14_1 {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            int curMax = 0;
            for (int j = 1; j < i; j++) {
                int a = j * (i - j);
                int b = j * dp[i - j];
                int max = Math.max(a, b);
                curMax = Math.max(curMax, max);
            }
            dp[i] = curMax;
        }
        return dp[n];
    }
}
