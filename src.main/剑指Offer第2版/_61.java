package ��ָOffer��2��;

import java.util.Arrays;

public class _61 {
    /**
     * ��ָ Offer 61. �˿����е�˳��
     * �����ɸ��˿���������� 5 ���ƣ��ж��ǲ���һ��˳�ӣ�����5�����ǲ��������ġ�2��10Ϊ���ֱ���AΪ1��JΪ11��QΪ12��KΪ13������С��Ϊ 0 �����Կ����������֡�A ������Ϊ 14��
     * <p>
     * <p>
     * <p>
     * ʾ�� 1:
     * <p>
     * ����: [1,2,3,4,5]
     * ���: True
     * <p>
     * <p>
     * ʾ�� 2:
     * <p>
     * ����: [0,0,1,2,5]
     * ���: True
     * <p>
     * <p>
     * ���ƣ�
     * <p>
     * ���鳤��Ϊ 5
     * <p>
     * �������ȡֵΪ [0, 13] .
     */

    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int num = nums[0];
        if (num == 0 || num > 9) {
            return false;
        }
        if (num + 4 == nums[4] && num + 3 == nums[3] && num + 2 == nums[2] && num + 1 == nums[1]) {
            return true;
        }
        return false;
    }
}
