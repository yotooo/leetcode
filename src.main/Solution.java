class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ;
        count = getNodeCount(head,count);

        ListNode node = new ListNode(0,head);
        ListNode node1 = node;
        for (int i = 0; i < count-n; i++) {
            node1 = node1.next;
        }
        node1.next = node1.next.next;
        ListNode result  = node.next;

        return result;
    }

    public int getNodeCount(ListNode node,int count){
        if (node!=null){
            count++;
            count = getNodeCount(node.next,count);
        }
        return count;
    }

    public void sout(ListNode node){
        if (node!=null){
            System.out.print(node.val+"--");
            sout(node.next);
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        set(listNode,"54321");
        Solution solution = new Solution();
        solution.removeNthFromEnd(listNode,2);
    }

    public static ListNode set(ListNode listNode, String iStr){
        if (iStr.length()==0){
            return listNode;
        }else {
            listNode.val = Integer.parseInt(iStr.substring(iStr.length()-1));
            iStr = iStr.substring(0,iStr.length()-1);
            if (iStr.length()==0){
                return listNode;
            }
            ListNode listNode1 = new ListNode();
            listNode.next = listNode1;
            return set(listNode1,iStr);
        }
    }
}