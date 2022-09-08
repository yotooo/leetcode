package leetcode.easy;

public class _234 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public boolean isPalindrome(ListNode head) {
        if (head.next==null){
            return true;
        }
        ListNode listNode1 = new ListNode();
        setNew(head, listNode1);
        ListNode reverseListNode = reverse(listNode1);
        return isPalindrome(head,reverseListNode);
    }

    public static ListNode setNew(ListNode head,ListNode result){
        if (head.next != null){
            result.val = head.val;
            result.next = new ListNode(head.next.val);
            return setNew(head.next,result.next);
        }
        result=null;
        return result;

    }

    public boolean isPalindrome(ListNode list1,ListNode list2){
        if (list1 == null){
            return true;
        }
        if (list1.val==list2.val){
            list1 = list1.next;
            list2 = list2.next;
            return isPalindrome(list1,list2);
        }
        return false;
    }



    public ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
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
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        String iStr = "1";
        StringBuffer stringBuffer = new StringBuffer(iStr);
        iStr = stringBuffer.reverse().toString();
        set(listNode, iStr);
        _234 v = new _234();
        System.out.println(v.isPalindrome(listNode));
    }
}
