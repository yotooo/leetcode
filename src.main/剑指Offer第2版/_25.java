package 剑指Offer第2版;

public class _25 {
    /**
     * 剑指 Offer 25. 合并两个排序的链表
     * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
     * <p>
     * 示例1：
     * <p>
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     * 限制：
     * <p>
     * 0 <= 链表长度 <= 1000
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
