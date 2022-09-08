package 剑指Offer第2版;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _39 {
    /**
     * 剑指 Offer 39. 数组中出现次数超过一半的数字
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     * 示例 1:
     *
     * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
     * 输出: 2
     *
     *
     * 限制：
     *
     * 1 <= 数组长度 <= 50000
     */
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(nums[i]);
            if (integer==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],integer+1);
                if (map.get(nums[i])> nums.length/2){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
