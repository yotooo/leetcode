package ��ָOffer��2��;

import java.util.HashMap;
import java.util.Map;

public class _43_1 {
    /**
     * ��ָ Offer 43. 1��n ������ 1 ���ֵĴ���
     * ����һ������ n ����1��n��n��������ʮ���Ʊ�ʾ��1���ֵĴ�����
     *
     * ���磬����12��1��12��Щ�����а���1 ��������1��10��11��12��1һ��������5�Ρ�
     *
     *
     *
     * ʾ�� 1��
     *
     * ���룺n = 12
     * �����5
     * ʾ�� 2��
     *
     * ���룺n = 13
     * �����6
     *
     *
     * ���ƣ�
     *
     * 1 <= n < 2^31
     */
    public int countDigitOne(int n) {
        String str = "";
        int result = 0;
        for (int i = 1; i <= n; i++) {
            str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(j,j+1).equals("1")){
                    result++;
                }
            }
        }
        return result;
    }
}

