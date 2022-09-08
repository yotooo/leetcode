package leetcode.easy;

public class _141 {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //Set ����
//    public static boolean hasCycle(ListNode head) {
//        Set<ListNode> set = new HashSet<>();
//        while (head != null) {
//            boolean flag = set.add(head);
//            if (!flag) {
//                return true;
//            }
//            head = head.next;
//        }
//        return false;
//    }



    //����ָ�루�ڹ�--���ӣ�
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        //�ڹ������û�غ�
        while (slow != fast) {
            //�������ܳ�Ȧ��
            if (fast == null || fast.next == null) {
                return false;
            }
            //�ڹ���һ��
            slow = slow.next;
            //����������
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        boolean b = hasCycle(listNode1);
        System.out.println(b);
    }
}
