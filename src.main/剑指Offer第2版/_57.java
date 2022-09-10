package ��ָOffer��2��;

public class _57 {
    /**
     * ��ָ Offer 57. ��Ϊs����������
     * ����һ����������������һ������s���������в�����������ʹ�����ǵĺ�������s������ж�����ֵĺ͵���s�����������һ�Լ��ɡ�
     * <p>
     * <p>
     * <p>
     * ʾ�� 1��
     * <p>
     * ���룺nums = [2,7,11,15], target = 9
     * �����[2,7] ���� [7,2]
     * ʾ�� 2��
     * <p>
     * ���룺nums = [10,26,30,31,47,60], target = 40
     * �����[10,30] ���� [30,10]
     * <p>
     * <p>
     * ���ƣ�
     * <p>
     * 1 <= nums.length <= 10^5
     * 1 <= nums[i] <= 10^6
     */

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];
        while (left < nums.length) {
            int sum = nums[right] + nums[left];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                result[0] = nums[left];
                result[1] = nums[right];
                break;
            }
        }
        return result;
    }
}
