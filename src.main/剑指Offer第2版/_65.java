package ��ָOffer��2��;

import java.math.BigInteger;

public class _65 {
    /**
     * @Author yoto
     * @Description ��ָ Offer 65. ���üӼ��˳����ӷ�
     * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ�� ��+������-������*������/�� ����������š�
     *
     *
     *
     * ʾ��:
     *
     * ����: a = 1, b = 1
     * ���: 2
     *
     *
     * ��ʾ��
     *
     * a, b �������Ǹ����� 0
     * ���������� 32 λ����
     * @Date 2022/9/9 10:03
    **/


    public int add(int a, int b) {
        BigInteger integerA = new BigInteger(String.valueOf(a));
        BigInteger integerB = new BigInteger(String.valueOf(b));
        BigInteger add = integerA.add(integerB);
        String s = add.toString();
        return Integer.parseInt(s);
    }
}
