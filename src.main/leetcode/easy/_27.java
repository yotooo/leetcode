package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class _27 {
    public  static  int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (val!=nums[i]){
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}
