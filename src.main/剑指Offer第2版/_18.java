package ��ָOffer��2��;

public class _18 {
    /**
     * @Author yoto
     * @Description ��ָ Offer 18. ɾ������Ľڵ�
     * �������������ͷָ���һ��Ҫɾ���Ľڵ��ֵ������һ������ɾ���ýڵ㡣
     *
     * ����ɾ����������ͷ�ڵ㡣
     *
     * ע�⣺����Ա�ԭ���иĶ�
     *
     * ʾ�� 1:
     *
     * ����: head = [4,5,1,9], val = 5
     * ���: [4,1,9]
     * ����: ������������ֵΪ 5 �ĵڶ����ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 1 -> 9.
     * ʾ�� 2:
     *
     * ����: head = [4,5,1,9], val = 1
     * ���: [4,5,9]
     * ����: ������������ֵΪ 1 �ĵ������ڵ㣬��ô�ڵ�������ĺ���֮�󣬸�����Ӧ��Ϊ 4 -> 5 -> 9.
     *
     *
     * ˵����
     *
     * ��Ŀ��֤�����нڵ��ֵ������ͬ
     * ��ʹ�� C �� C++ ���ԣ��㲻��Ҫ free �� delete ��ɾ���Ľڵ�
     * @Date 2022/9/8 16:56
    **/


    /**
     * @Author yoto
     * @Description  ����һ��˫ָ��
     * @Date 2022/9/8 17:24
    **/
//    public ListNode deleteNode(ListNode head, int val) {
//        ListNode temp = head;
//        ListNode second = new ListNode(0);
//        second.next=head;
//        while(val!=temp.val){
//            temp = temp.next;
//            second = second.next;
//        }
//        if(temp.next!=null){
//            temp.val = temp.next.val;
//            temp.next = temp.next.next;
//        }else{
//            second.next=null;
//        }
//        return head;
//    }

    /**
     * @Author yoto
     * @Description  ����������ָ��-����
     * @Date 2022/9/8 17:24
    **/
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val)
            cur = cur.next;
        if (cur.next != null)
            cur.next = cur.next.next;
        return head;
    }

    public static void main(String[] args) {
        _18 v = new _18();
        ListNode listNode1 = new ListNode(-3);
        ListNode listNode2 = new ListNode(5);listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(-99);listNode2.next=listNode3;
        v.deleteNode(listNode1,-99);
    }
   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

}
