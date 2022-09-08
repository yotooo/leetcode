package ��ָOffer��2��;

public class _25 {
    /**
     * ��ָ Offer 25. �ϲ��������������
     * ����������������������ϲ�����������ʹ�������еĽڵ���Ȼ�ǵ�������ġ�
     * <p>
     * ʾ��1��
     * <p>
     * ���룺1->2->4, 1->3->4
     * �����1->1->2->3->4->4
     * ���ƣ�
     * <p>
     * 0 <= ������ <= 1000
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }


}
