package easy;

import normal._2;

public class _26 {
    //双指针解决
    public int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                left++;
                nums[left] = nums[right];
            }

        }
        return ++left;
    }

    public static void main(String[] args) {
        _26 v = new _26();
        int[] ints = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(v.removeDuplicates(ints));
    }
}
