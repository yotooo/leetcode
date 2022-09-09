package ��ָOffer��2��;

public class _50 {
    /**
     * @Author yoto
     * @Description ��ָ Offer 50. ��һ��ֻ����һ�ε��ַ�
     * ���ַ��� s ���ҳ���һ��ֻ����һ�ε��ַ������û�У�����һ�����ո� s ֻ����Сд��ĸ��
     * <p>
     * ʾ�� 1:
     * <p>
     * ���룺s = "abaccdeff"
     * �����'b'
     * ʾ�� 2:
     * <p>
     * ���룺s = ""
     * �����' '
     * <p>
     * <p>
     * ���ƣ�
     * <p>
     * 0 <= s �ĳ��� <= 50000
     * @Date 2022/9/9 11:18
     **/

    public char firstUniqChar(String s) {
        int slow = 0;
        int fast = 1;
        int length = s.length();

        while (slow < length) {
            if (fast==slow){
                fast++;
            }
            if (fast>s.length()){
                return s.charAt(slow);
            }
            if (s.charAt(fast)==s.charAt(slow)){
                slow++;
                fast=0;
            }
            fast++;

        }
        return ' ';
    }

    public static void main(String[] args) {
        _50 v = new _50();
        char leetcode = v.firstUniqChar("abbaccddeeff");
        System.out.println(leetcode);
    }
}
