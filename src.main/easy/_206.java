package easy;

public class _206 {

    /**
     * @Author yoto
     * @Description  解法详解：http://c.biancheng.net/view/8105.html
     * @Date 2022/9/6 17:02
    **/

    //迭代---三指针
    public ListNode reverseList(ListNode head) {
        //前指针
        ListNode prev = null;
        //当前指针
        ListNode curr = head;
        while (curr != null) {
            //后指针
            ListNode next = curr.next;
            //反链<---
            curr.next = prev;
            //移动前指针--->
            prev = curr;
            //移动当前指针--->
            curr = next;
        }
        return prev;
    }
    //递归
    public ListNode reverseList1(ListNode head) {

        // 寻找递归终止条件
        // 1、head 指向的结点为 null
        // 2、head 指向的结点的下一个结点为 null
        // 在这两种情况下，反转之后的结果还是它自己本身
        if(head == null || head.next == null) return head;

        // 不断的通过递归调用，直到无法递归下去，递归的最小粒度是在最后一个节点
        // 因为到最后一个节点的时候，由于当前节点 head 的 next 节点是空，所以会直接返回 head
        ListNode cur = reverseList(head.next);

        // 比如原链表为 1 --> 2 --> 3 --> 4 --> 5 --> null
        // 5 -- > 4
        // 第一次执行下面代码的时候，head 为 4，那么 head.next = 5
        // 那么 head.next.next 就是 5.next ，意思就是去设置 5 的下一个节点
        // 等号右侧为 head，意思就是设置 5 的下一个节点是 4
        head.next.next = head;


        // head 原来的下一节点指向自己，所以 head 自己本身就不能再指向原来的下一节点了
        // 否则会发生无限循环
        head.next = null;

        // 我们把每次反转后的结果传递给上一层
        return cur;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        String iStr = "12345";
        StringBuffer stringBuffer = new StringBuffer(iStr);
        iStr = stringBuffer.reverse().toString();
        set(listNode, iStr);
        _206 v = new _206();
        ListNode son = v.reverseList(listNode);
        sout(son);
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

    public static void sout(ListNode node) {
        if (node != null) {
            System.out.print(node.val + "--");
            sout(node.next);
        }
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
}
