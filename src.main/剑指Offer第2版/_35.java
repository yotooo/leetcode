package ½£Ö¸OfferµÚ2°æ;

import com.sun.org.apache.xpath.internal.axes.NodeSequence;

import java.util.PriorityQueue;
import java.util.Queue;

public class _35 {
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
        return null;
    }

    public Node newNode(Node oldNode, Node newNode) {
        Queue<Integer> nodeQueue = new PriorityQueue<>();
        Node node = new Node(0);
        node = oldNode;
        while (node != null) {
            nodeQueue.add(node.val);
            node = node.next;
        }
        Node result = new Node(0);
        newNode = result;
        while (!nodeQueue.isEmpty()){
            result.val = nodeQueue.element();
            nodeQueue.remove();

        }
        return newNode;

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        _35 v = new _35();
        Node node = v.newNode(node1, new Node(0));

    }
}
