package ��ָOffer��2��;

public class _24 {
/**
 * @Author yoto
 * @Description ��ָ Offer 24. ��ת����
 * ����һ������������һ�������ͷ�ڵ㣬��ת�����������ת�������ͷ�ڵ㡣
 *
 *
 *
 * ʾ��:
 *
 * ����: 1->2->3->4->5->NULL
 * ���: 5->4->3->2->1->NULL
 *
 *
 * ���ƣ�
 *
 * 0 <= �ڵ���� <= 5000
 * @Date 2022/9/8 17:27
**/

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
