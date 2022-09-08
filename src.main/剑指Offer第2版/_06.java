package 剑指Offer第2版;

import java.util.Stack;

public class _06 {
    /**
     * @Author yoto
     * @Description 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     *
     *
     *
     * 示例 1：
     *
     * 输入：head = [1,3,2]
     * 输出：[2,3,1]
     * @Date 2022/9/8 15:13
    **/
    
    
    /**
     * @Author yoto 
     * @Description  方法一：1.获取长度
     *                      2.根据长度创建数组
     *                      3.遍历链表，插入数值
     * @Date 2022/9/8 16:16 
    **/
//    public int[] reversePrint(ListNode head) {
//        int index = 0;
//        index = getLength(head, index);
//        int[] nums = new int[index];
//        if (index==0){
//            return nums;
//        }
//        return get(head, nums,index-1);
//    }
//
//
//    public int[] get(ListNode head, int[] list,int index){
//        if (head!=null){
//            list[index] = head.val;
//            head = head.next;
//            get(head,list,--index);
//        }
//        return list;
//    }
//    public int getLength (ListNode listNode,int index){
//        if (listNode==null){
//            return index;
//        }
//        index++;
//        return getLength(listNode.next,index);
//    }
    
    
    /**
     * @Author yoto 
     * @Description 栈
     * @Date 2022/9/8 16:16 
    **/
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        int[] nums = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            nums[i] = stack.pop().val;
        }
        return nums;
    }

   public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

}
