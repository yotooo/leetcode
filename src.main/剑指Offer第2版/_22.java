package ��ָOffer��2��;

public class _22 {

    /**
     * ��ָ Offer 22. �����е�����k���ڵ�
     * ����һ����������������е�����k���ڵ㡣Ϊ�˷��ϴ�����˵�ϰ�ߣ������1��ʼ�������������β�ڵ��ǵ�����1���ڵ㡣
     * <p>
     * ���磬һ�������� 6 ���ڵ㣬��ͷ�ڵ㿪ʼ�����ǵ�ֵ������ 1��2��3��4��5��6���������ĵ����� 3 ���ڵ���ֵΪ 4 �Ľڵ㡣
     * <p>
     * <p>
     * <p>
     * ʾ����
     * <p>
     * ����һ������: 1->2->3->4->5, �� k = 2.
     * <p>
     * �������� 4->5.
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        for (int i = 0; i < size - k; i++) {
            head = head.next;
        }
        return head;
    }
}
