package ��ָOffer��2��;

public class _64 {
    /**
     * @Author yoto
     * @Description ��ָ Offer 64. ��1+2+��+n
     * �� 1+2+...+n ��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
     *
     *
     *
     * ʾ�� 1��
     *
     * ����: n = 3
     * ���: 6
     * ʾ�� 2��
     *
     * ����: n = 9
     * ���: 45
     *
     *
     * ���ƣ�
     *
     * 1 <= n <= 10000
     * @Date 2022/9/9 9:56
    **/
    public int sumNums(int n) {
        if (n!=0){
            return n + sumNums(n-1);
        }
        return 0;
    }
}
