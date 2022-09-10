package ½£Ö¸OfferµÚ2°æ;

public class _53_1 {
    public int search(int[] nums, int target) {
        int result = 0;
        for (Integer num : nums) {
            if (num == target){
                result++;
            }else if (num>target){
                break;
            }
        }
        return result;
    }
}
