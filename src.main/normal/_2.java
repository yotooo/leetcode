package normal;

import javax.management.ListenerNotFoundException;
import java.math.BigInteger;
import java.util.List;

public class _2 {
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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        BigInteger bigInteger1 = new BigInteger(get(l1).toString());
        BigInteger bigInteger2 = new BigInteger(get(l2).toString());
        BigInteger result = bigInteger1.add(bigInteger2);
        ListNode listNode = new ListNode();
        set(listNode,String.valueOf(result));
        return listNode;

    }

    public static ListNode  set(ListNode listNode,String iStr){
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

    public static StringBuffer get(ListNode listNode){
        StringBuffer stringBuffer1 = new StringBuffer();
        if (listNode==null){
            return stringBuffer1;
        }else {
            StringBuffer stringBuffer = get(listNode.next);
            stringBuffer.append(listNode.val);
            return stringBuffer;
        }
    }

    public static void main(String[] args) {


        ListNode listNode = new ListNode();
        ListNode listNode1 = new ListNode();
        set(listNode,"19999999909");
        set(listNode1,"9");
        ListNode listNode2 = addTwoNumbers(listNode, listNode1);


    }
}
