package 剑指Offer第2版;

public class _18 {
    /**
     * @Author yoto
     * @Description 剑指 Offer 18. 删除链表的节点
     * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
     *
     * 返回删除后的链表的头节点。
     *
     * 注意：此题对比原题有改动
     *
     * 示例 1:
     *
     * 输入: head = [4,5,1,9], val = 5
     * 输出: [4,1,9]
     * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
     * 示例 2:
     *
     * 输入: head = [4,5,1,9], val = 1
     * 输出: [4,5,9]
     * 解释: 给定你链表中值为 1 的第三个节点，那么在调用了你的函数之后，该链表应变为 4 -> 5 -> 9.
     *
     *
     * 说明：
     *
     * 题目保证链表中节点的值互不相同
     * 若使用 C 或 C++ 语言，你不需要 free 或 delete 被删除的节点
     * @Date 2022/9/8 16:56
    **/


    /**
     * @Author yoto
     * @Description  方法一：双指针
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
     * @Description  方法二：单指针-网解
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
