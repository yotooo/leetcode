package ��ָOffer��2��;

public class _21 {
    /**
     * ��ָ Offer 21. ��������˳��ʹ����λ��ż��ǰ��
     * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����������������ǰ�벿�֣�����ż��������ĺ�벿�֡�
     * <p>
     * <p>
     * <p>
     * ʾ����
     * <p>
     * ���룺nums = [1,2,3,4]
     * �����[1,3,2,4]
     * ע��[3,1,2,4] Ҳ����ȷ�Ĵ�֮һ��
     * <p>
     * <p>
     * ��ʾ��
     * <p>
     * 0 <= nums.length <= 50000
     * 0 <= nums[i] <= 10000
     */
    public int[] exchange(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp = 0;
        while (start < end) {
            if (nums[start] % 2 == 0) {
                if (nums[end] % 2 == 0) {
                    end--;
                    continue;
                } else {
                    temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
            } else {
                start++;
            }
        }

        return nums;
    }
}
