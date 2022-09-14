package ½£Ö¸OfferµÚ2°æ;

import java.util.Stack;

public class _09 {
    class CQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        public CQueue() {
        }

        public void appendTail(int value) {
            stack1.add(0,value);
        }

        public int deleteHead() {
            Integer remove = -1;
            try {
                remove = stack1.remove(stack1.size()-1);
            } catch (Exception e) {
            }
            return remove;
        }
    }

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
}
