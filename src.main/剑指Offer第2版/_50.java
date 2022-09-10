package ��ָOffer��2��;

import java.util.LinkedHashMap;
import java.util.Map;

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

    /**
     * ����һ:˫ָ��
     * @param s
     * @return
     */
//    public char firstUniqChar(String s) {
//        int slow = 0;
//        int fast = 0;
//        int length = s.length();
//
//        while (slow != length) {
//            if (fast==s.length()){
//                return s.charAt(slow);
//            }
//            if (fast==slow){
//                fast++;
//                continue;
//            }
//            if (s.charAt(slow) == s.charAt(fast)){
//                slow++;
//                fast=0;
//                continue;
//            }
//
//            fast++;
//        }
//        return ' ';
//    }

    /**
     * ������:LinkedHashMap(LinkedHashMap�������)
     * @param s
     * @return
     */
    public char firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer total = map.get(s.charAt(i));
            if (total==null){
                map.put(s.charAt(i),1);
            }else {
                map.put(s.charAt(i),total+1);
            }
        }
        for(Map.Entry entry: map.entrySet()){
            if (entry.getValue().equals(1)){
                return (Character) entry.getKey();
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        _50 v = new _50();
        char leetcode = v.firstUniqChar("asdfadsfb");
        System.out.println(leetcode);
    }
}
