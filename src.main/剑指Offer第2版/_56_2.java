package 剑指Offer第2版;

import java.util.HashMap;
import java.util.Map;

public class _56_2 {
    /**
     * 剑指 Offer 56 - II. 数组中数字出现的次数 II
     * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [3,4,3,3]
     * 输出：4
     * 示例 2：
     * <p>
     * 输入：nums = [9,1,7,9,7,9,7]
     * 输出：1
     * <p>
     * <p>
     * 限制：
     * <p>
     * 1 <= nums.length <= 10000
     * 1 <= nums[i] < 2^31
     */

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.getOrDefault(nums[i], 0);
            if (integer.equals(2)){
                map.remove(nums[i]);
            }else {
                map.put(nums[i], integer + 1);
            }
        }
        return map.entrySet().iterator().next().getKey();
    }

    public static void main(String[] args) {
        _56_2 v = new _56_2();
        System.out.println(v.singleNumber(new int[]{3, 4, 3, 3}));
    }
}
