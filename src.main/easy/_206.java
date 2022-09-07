package easy;

public class _206 {

    /**
     * @Author yoto
     * @Description  �ⷨ��⣺http://c.biancheng.net/view/8105.html
     * @Date 2022/9/6 17:02
    **/

    //����---��ָ��
    public ListNode reverseList(ListNode head) {
        //ǰָ��
        ListNode prev = null;
        //��ǰָ��
        ListNode curr = head;
        while (curr != null) {
            //��ָ��
            ListNode next = curr.next;
            //����<---
            curr.next = prev;
            //�ƶ�ǰָ��--->
            prev = curr;
            //�ƶ���ǰָ��--->
            curr = next;
        }
        return prev;
    }
    //�ݹ�
    public ListNode reverseList1(ListNode head) {

        // Ѱ�ҵݹ���ֹ����
        // 1��head ָ��Ľ��Ϊ null
        // 2��head ָ��Ľ�����һ�����Ϊ null
        // ������������£���ת֮��Ľ���������Լ�����
        if(head == null || head.next == null) return head;

        // ���ϵ�ͨ���ݹ���ã�ֱ���޷��ݹ���ȥ���ݹ����С�����������һ���ڵ�
        // ��Ϊ�����һ���ڵ��ʱ�����ڵ�ǰ�ڵ� head �� next �ڵ��ǿգ����Ի�ֱ�ӷ��� head
        ListNode cur = reverseList(head.next);

        // ����ԭ����Ϊ 1 --> 2 --> 3 --> 4 --> 5 --> null
        // 5 -- > 4
        // ��һ��ִ����������ʱ��head Ϊ 4����ô head.next = 5
        // ��ô head.next.next ���� 5.next ����˼����ȥ���� 5 ����һ���ڵ�
        // �Ⱥ��Ҳ�Ϊ head����˼�������� 5 ����һ���ڵ��� 4
        head.next.next = head;


        // head ԭ������һ�ڵ�ָ���Լ������� head �Լ�����Ͳ�����ָ��ԭ������һ�ڵ���
        // ����ᷢ������ѭ��
        head.next = null;

        // ���ǰ�ÿ�η�ת��Ľ�����ݸ���һ��
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
