package ��ָOffer��2��;

import java.util.LinkedList;

public class _62 {
    /**
     * ��ָ Offer 62. ԲȦ�����ʣ�µ�����
     * 0,1,������,n-1��n�������ų�һ��ԲȦ��������0��ʼ��ÿ�δ����ԲȦ��ɾ����m�����֣�ɾ�������һ�����ֿ�ʼ��������������ԲȦ��ʣ�µ����һ�����֡�
     *
     * ���磬0��1��2��3��4��5���������һ��ԲȦ��������0��ʼÿ��ɾ����3�����֣���ɾ����ǰ4������������2��0��4��1��������ʣ�µ�������3��
     *
     *
     *
     * ʾ�� 1��
     *
     * ����: n = 5, m = 3
     * ���: 3
     * ʾ�� 2��
     *
     * ����: n = 10, m = 17
     * ���: 2
     */
    public int lastRemaining(int n, int m) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        m--;
        while (list.size()!=1){
            index = (m+index)%list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        _62 v = new _62();
        System.out.println(v.lastRemaining(56795, 87778));
    }
}
