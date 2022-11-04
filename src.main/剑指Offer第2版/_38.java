package ��ָOffer��2��;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class _38 {
    /**
     * ����һ���ַ�������ӡ�����ַ������ַ����������С�
     *
     * ?
     *
     * �����������˳�򷵻�����ַ������飬�����治�����ظ�Ԫ�ء�
     *
     * ?
     *
     * ʾ��:
     *
     * ���룺s = "abc"
     * �����["abc","acb","bac","bca","cab","cba"]
     * ?
     *
     * ���ƣ�
     *
     * 1 <= s �ĳ��� <= 8
     */
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }
    void dfs(int x) {
        if(x == c.length - 1) {
            res.add(String.valueOf(c));      // ������з���
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i = x; i < c.length; i++) {
            if(set.contains(c[i])) continue; // �ظ�����˼�֦
            set.add(c[i]);
            swap(i, x);                      // �������� c[i] �̶��ڵ� x λ
            dfs(x + 1);                      // �����̶��� x + 1 λ�ַ�
            swap(i, x);                      // �ָ�����
        }
    }
    void swap(int a, int b) {
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }

    public static void main(String[] args) {
        _38 v = new _38();

    }
}
