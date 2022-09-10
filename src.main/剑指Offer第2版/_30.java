package ��ָOffer��2��;

import java.util.Arrays;
import java.util.LinkedList;

public class _30 {
    /**
     * ��ָ Offer 30. ����min������ջ
     * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص� min �����ڸ�ջ�У����� min��push �� pop ��ʱ�临�Ӷȶ��� O(1)��
     *
     *
     *
     * ʾ��:
     *
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.min();   --> ���� -3.
     * minStack.pop();
     * minStack.top();      --> ���� 0.
     * minStack.min();   --> ���� -2.
     *
     *
     * ��ʾ��
     *
     * �������ĵ����ܴ��������� 20000 ��
     */

    /**
     * initialize your data structure here.
     */
    LinkedList<Integer> list;

    public _30() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.push(x);
        min1();
    }

    public void pop() {
        list.pop();
        min1();
    }

    public int top() {
        return list.get(0);

    }
    public int min() {

        return min;
    }
    Integer min = Integer.MAX_VALUE;
    public int min1() {
        for (int i = 0; i < list.size(); i++) {
            if (min>list.get(i)) {
                min = list.get(i);
            }
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

