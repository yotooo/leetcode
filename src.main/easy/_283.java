package easy;

public class _283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length-1;
        for(int i = 0;i<=n;i++){
            if(nums[i]==0){

                for(int k = i;k<n;k++){
                    nums[k] = nums[k+1];
                }
                nums[n] = 0;
                n--;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        _283 v = new _283();
        int[] nums = new int[]{0,0,1};
        v.moveZeroes(nums);
        for (int n = 0; n < nums.length; n++) {
            System.out.println(nums[n]);
        }
    }
}
