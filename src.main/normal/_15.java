package normal;

import java.util.*;

public class _15 {
    /**
     * 给你一个包含 n 个整数的数组?nums，判断?nums?中是否存在三个元素 a，b，c ，使得?a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
     * <p>
     * 注意：答案中不可以包含重复的三元组。
     *
     * @param args
     */
    public static void main(String[] args) {
        _15 v = new _15();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(v.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        one:for (int i = 0; i < nums.length; i++) {
            two:for (int j = i + 1; j < nums.length; j++) {
                three:for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        list.add(list1);
                    }
                }
            }
        }
        Set set = new HashSet();
        set.addAll(list);
        List<List<Integer>> listList = new ArrayList<>();
        listList.addAll(set);
        return listList;
    }
}
