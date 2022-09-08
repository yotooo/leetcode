package leetcode.easy;

public class _21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        ListNode listNode1 = new ListNode();
        set(listNode,"421");
        set(listNode1,"431");
        ListNode listNode2 = mergeTwoLists(listNode, listNode1);

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode set(ListNode listNode, String iStr) {
        if (iStr.length() == 0) {
            return listNode;
        } else {

            listNode.val = Integer.parseInt(iStr.substring(iStr.length() - 1));
            iStr = iStr.substring(0, iStr.length() - 1);
            if (iStr.length() == 0) {
                return listNode;
            }
            ListNode listNode1 = new ListNode();
            listNode.next = listNode1;
            return set(listNode1, iStr);
        }
    }
}