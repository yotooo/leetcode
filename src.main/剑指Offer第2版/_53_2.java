package ��ָOffer��2��;

public class _53_2 {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }
    public int find(int[] nums,int start,int end){
      return 0;

    }
}
