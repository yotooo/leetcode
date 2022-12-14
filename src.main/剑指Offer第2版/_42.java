package 剑指Offer第2版;

import java.util.Arrays;

public class _42 {
    /**
     * @Author yoto
     * @Description 剑指 Offer 42. 连续子数组的最大和
     * 简单
     * 619
     * 相关企业
     * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
     *
     * 要求时间复杂度为O(n)。
     *
     *
     *
     * 示例1:
     *
     * 输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     *
     *
     * 提示：
     *
     * 1 <= arr.length <= 10^5
     * -100 <= arr[i] <= 100
     * 注意：本题与主站 53 题相同：https://leetcode-cn.com/problems/maximum-subarray/
     * @Date 2022/11/3 17:05
    **/

    /*
    该方法超时
     */
    public static int maxSubArray(int[] nums) {
        int size = calSize(nums.length);
        int[] dp = new int[size];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length-i+1; j++) {
                int value = calValue(nums, i, j);
                if (value>max){
                    max = value;
                }
            }
        }
        return max;
    }
    public static int calSize(int n){
        if (n == 1){
            return 1;
        }
        return n + calSize(n-1);
    }
    public static int calValue(int[] nums,int start,int size){
        if (size == 0){
            return 0;
        }
        return nums[start] + calValue(nums,start+1,size-1);
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray1(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }


    public static int maxSubArray1(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < dp.length; i++) {
            if (dp[i-1]>0){
                dp[i] = nums[i]+dp[i-1];
            }else {
                dp[i] = nums[i];
            }
        }
        Arrays.sort(dp);
        return dp[dp.length-1];
    }




}
