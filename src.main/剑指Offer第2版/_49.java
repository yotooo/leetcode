package ��ָOffer��2��;

public class _49 {
    /**
     * @Author yoto 
     * @Description
     * ��ָ Offer 49. ����
     * �е�
     * 394
     * �����ҵ
     * ���ǰ�ֻ���������� 2��3 �� 5 ��������������Ugly Number�����󰴴�С�����˳��ĵ� n ��������
     *
     * ʾ��:
     *
     * ����: n = 10
     * ���: 12
     * ����: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 ��ǰ 10 ��������
     * ˵��:
     *
     * 1 �ǳ�����
     * n ������1690��
     * ע�⣺��������վ 264 ����ͬ��https://leetcode-cn.com/problems/ugly-number-ii/
     *
     * @Date 2022/11/8 11:42 
    **/
    public int nthUglyNumber(int n) {
        if (n==1){
            return n;
        }
        int i = 1;
        while (n!=1){
            if (!(i%2!=0&&i%3!=0&&i%5!=0)){
                //˵����Ϊ����
                n--;
            }
            i++;
        }
        return i;
    }
}