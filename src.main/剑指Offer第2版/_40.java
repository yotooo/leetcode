package ��ָOffer��2��;

import java.util.Arrays;

public class _40 {
    /**
     * ��ָ Offer 40. ��С��k����
     * ������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
     * <p>
     * <p>
     * <p>
     * ʾ�� 1��
     * <p>
     * ���룺arr = [3,2,1], k = 2
     * �����[1,2] ���� [2,1]
     * ʾ�� 2��
     * <p>
     * ���룺arr = [0,1,2,1], k = 1
     * �����[0]
     * <p>
     * <p>
     * ���ƣ�
     * <p>
     * 0 <= k <= arr.length <= 10000
     * 0 <= arr[i] <= 10000
     */

    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        return Arrays.copyOf(arr, k);
    }
}
