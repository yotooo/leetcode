package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _271 {
    //双for
//    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    //list
//    public boolean containsDuplicate(int[] nums) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (list.contains(nums[i])){
//                return true;
//            }else {
//                list.add(nums[i]);
//            }
//        }
//        return false;
//    }
    //set
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            boolean flag = set.add(nums[i]);
            if (!flag) {
                return true;
            }
        }
        return false;
    }
}
