package ��ָOffer��2��;

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
    public String[] permutation(String s) {
        int size = numsSize(s.length());
        String[] nums = new String[size];
        for (int i = 0; i < s.length(); i++) {

        }
        return null;
    }
    public int numsSize(int length){
        if (length==1){
            return 1;
        }
        return length*numsSize(length-1);
    }

    public static void main(String[] args) {
        _38 v = new _38();

    }
}
