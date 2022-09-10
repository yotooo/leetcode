package 剑指Offer第2版;

import java.util.Arrays;

public class _61 {
    /**
     * 剑指 Offer 61. 扑克牌中的顺子
     * 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
     * <p>
     * <p>
     * <p>
     * 示例 1:
     * <p>
     * 输入: [1,2,3,4,5]
     * 输出: True
     * <p>
     * <p>
     * 示例 2:
     * <p>
     * 输入: [0,0,1,2,5]
     * 输出: True
     * <p>
     * <p>
     * 限制：
     * <p>
     * 数组长度为 5
     * <p>
     * 数组的数取值为 [0, 13] .
     */

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        if (num == 0 || num > 9) {
            return false;
        }
        if (num + 4 == nums[4] && num + 3 == nums[3] && num + 2 == nums[2] && num + 1 == nums[1]) {
            return true;
        }
        return false;
    }
}
