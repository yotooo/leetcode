package 剑指Offer第2版;

import java.util.Arrays;
import java.util.LinkedList;

public class _30 {
    /**
     * 剑指 Offer 30. 包含min函数的栈
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
     *
     *
     *
     * 示例:
     *
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.min();   --> 返回 -3.
     * minStack.pop();
     * minStack.top();      --> 返回 0.
     * minStack.min();   --> 返回 -2.
     *
     *
     * 提示：
     *
     * 各函数的调用总次数不超过 20000 次
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

