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
//        if (l1 == null) {
//            return l2;
//        } else {
//            if (l1.val >= l2.val) {
//                ListNode listNode = new ListNode(l1.val);
//                listNode.next = l2.next;
//                l2.next = listNode;
//                l1 = l1.next;
//            }else {
//
//            }
//        }
//        return mergeTwoLists(l1,l2.next);
        ListNode result = new ListNode(0);
        ListNode cur = result;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cur.next = l2;
                l2 = l2.next;
            } else {
                cur.next = l1.next;
                l1 = l1.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return result.next;
    }


}
