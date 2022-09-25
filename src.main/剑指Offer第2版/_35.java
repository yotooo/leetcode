package ��ָOffer��2��;

import java.util.HashMap;
import java.util.Map;

public class _35 {
    /**
     * @Author yoto
     * @Description ������������ + �ڵ���
     * ˼·���㷨
     * <p>
     * ע�⵽����һ��Ҫʹ�ù�ϣ���¼ÿһ���ڵ��Ӧ�½ڵ�Ĵ�������������ǿ���ʹ��һ��С������ʡȥ��ϣ��Ŀռ䡣
     * <p>
     * �������Ƚ���������ÿһ���ڵ���Ϊ���������Ľڵ㣬����������� A \rightarrow B \rightarrow CA��B��C�����ǿ��Խ�����Ϊ A \rightarrow A' \rightarrow B \rightarrow B' \rightarrow C \rightarrow C'A��A
     * ��
     * ��B��B
     * ��
     * ��C��C
     *
     * ��
     * ����������һ��ԭ�ڵ� SS���俽���ڵ� S'S
     * ��
     * ��Ϊ���̽ڵ㡣
     * <p>
     * ���������ǿ���ֱ���ҵ�ÿһ�������ڵ� S'S
     * ��
     * �����ָ��Ӧ��ָ��Ľڵ㣬��Ϊ��ԭ�ڵ� SS �����ָ��ָ��Ľڵ� TT �ĺ�̽ڵ� T'T
     * ��
     * ����Ҫע��ԭ�ڵ�����ָ�����Ϊ�գ�������Ҫ�ر��ж����������
     * <p>
     * ����������˿����ڵ�����ָ��ĸ�ֵ������ֻ��Ҫ�����������ԭ�ڵ��뿽���ڵ��������в�ּ��ɣ�ֻ��Ҫ����һ�Ρ�ͬ����Ҫע�����һ�������ڵ�ĺ�̽ڵ�Ϊ�գ�������Ҫ�ر��ж����������
     * @Date 2022/9/13 13:48
     **/

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
       Node cur = head;
       Map<Node,Node> map = new HashMap<>();
       while (cur!=null){
           map.put(cur,new Node(cur.val));
           cur = cur.next;
       }
       cur = head;

       while (cur!=null){
           map.get(cur).next = map.get(cur.next);
           map.get(cur).random = map.get(cur.random);
           cur = cur.next;
       }
       return map.get(head);
    }

    /**
     * @Author yoto
     * @Description ��������
     * @Date 2022/9/13 14:33
     **/
    public Node copySingleList(Node head) {
        Node result = new Node(head.val);
        Node index = result;
        Node cur = head;
        while (cur.next != null) {
            index.next = new Node(cur.next.val);
            index = index.next;
            cur = cur.next;
        }
        return result;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        _35 v = new _35();
        Node node = v.copySingleList(node1);

    }

}