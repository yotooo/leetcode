package ��ָOffer��2��;

public class _11 {
    /**
     * @Author yoto 
     * @Description ��ָ Offer 11. ��ת�������С����
     * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
     *
     * ����һ�����ܴ��� �ظ� Ԫ��ֵ������ numbers ����ԭ����һ���������е����飬�����������ν�����һ����ת���뷵����ת�������СԪ�ء����磬���� [3,4,5,1,2] Ϊ [1,2,3,4,5] ��һ����ת�����������СֵΪ 1��
     *
     * ע�⣬���� [a[0], a[1], a[2], ..., a[n-1]] ��תһ�� �Ľ��Ϊ���� [a[n-1], a[0], a[1], a[2], ..., a[n-2]] ��
     *
     *
     *
     * ʾ�� 1��
     *
     * ���룺numbers = [3,4,5,1,2]
     * �����1
     * ʾ�� 2��
     *
     * ���룺numbers = [2,2,2,0,1]
     * �����0
     *
     *
     * ��ʾ��
     *
     * n == numbers.length
     * 1 <= n <= 5000
     * -5000 <= numbers[i] <= 5000
     * numbers ԭ����һ��������������飬�������� 1 �� n ����ת
     * @Date 2022/9/8 16:41 
    **/

    /**
     * @Author yoto
     * @Description  ����һ��for�������
     * @Date 2022/9/8 16:42
    **/
    public int minArray(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            min=Math.min(min,numbers[i]);
        }
        return min;
    }

}
