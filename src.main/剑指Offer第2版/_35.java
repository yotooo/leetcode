package 剑指Offer第2版;

import java.util.HashMap;
import java.util.Map;

public class _35 {
    /**
     * @Author yoto
     * @Description 方法二：迭代 + 节点拆分
     * 思路及算法
     * <p>
     * 注意到方法一需要使用哈希表记录每一个节点对应新节点的创建情况，而我们可以使用一个小技巧来省去哈希表的空间。
     * <p>
     * 我们首先将该链表中每一个节点拆分为两个相连的节点，例如对于链表 A \rightarrow B \rightarrow CA→B→C，我们可以将其拆分为 A \rightarrow A' \rightarrow B \rightarrow B' \rightarrow C \rightarrow C'A→A
     * ′
     * →B→B
     * ′
     * →C→C
     *
     * ′
     * 。对于任意一个原节点 SS，其拷贝节点 S'S
     * ′
     * 即为其后继节点。
     * <p>
     * 这样，我们可以直接找到每一个拷贝节点 S'S
     * ′
     * 的随机指针应当指向的节点，即为其原节点 SS 的随机指针指向的节点 TT 的后继节点 T'T
     * ′
     * 。需要注意原节点的随机指针可能为空，我们需要特别判断这种情况。
     * <p>
     * 当我们完成了拷贝节点的随机指针的赋值，我们只需要将这个链表按照原节点与拷贝节点的种类进行拆分即可，只需要遍历一次。同样需要注意最后一个拷贝节点的后继节点为空，我们需要特别判断这种情况。
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
     * @Description 单链表复制
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