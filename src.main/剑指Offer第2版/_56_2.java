package ��ָOffer��2��;

import java.util.HashMap;
import java.util.Map;

public class _56_2 {
    /**
     * ��ָ Offer 56 - II. ���������ֳ��ֵĴ��� II
     * ��һ������ nums �г�һ������ֻ����һ��֮�⣬�������ֶ����������Ρ����ҳ��Ǹ�ֻ����һ�ε����֡�
     * <p>
     * <p>
     * <p>
     * ʾ�� 1��
     * <p>
     * ���룺nums = [3,4,3,3]
     * �����4
     * ʾ�� 2��
     * <p>
     * ���룺nums = [9,1,7,9,7,9,7]
     * �����1
     * <p>
     * <p>
     * ���ƣ�
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
