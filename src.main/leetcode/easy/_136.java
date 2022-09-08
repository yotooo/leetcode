package leetcode.easy;

public class _136 {
    //set
//    public static int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean flag = set.add(nums[i]);
//            if (!flag){
//                set.remove(nums[i]);
//            }
//        }
//        return set.iterator().next();
//    }

        public static int singleNumber(int[] nums) {
            int result =0;
            for (int i = 0; i < nums.length; i++) {
                result = result^nums[i];
            }
            return result;
        }

    public static void main(String[] args) {
        int[] ints = {4, 1, 2, 1, 2};
        singleNumber(ints);
    }
}
