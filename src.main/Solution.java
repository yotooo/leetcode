class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0 ;
        count = getNodeCount(head,count);

        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;

        for (int i = 0; i < count - n; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public int getNodeCount(ListNode node,int count){
        if (node!=null){
            System.out.println(count);

            count++;
            count = getNodeCount(node.next,count);
        }
        return count;
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