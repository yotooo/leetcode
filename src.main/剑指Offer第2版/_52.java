package 剑指Offer第2版;

import java.util.HashSet;
import java.util.Set;

public class _52 {
    /**
     * @Author yoto
     * @Description 剑指 Offer 52. 两个链表的第一个公共节点
     * 输入两个链表，找出它们的第一个公共节点。
     * <p>
     * 如下面的两个链表：
     * <p>
     * <p>
     * <p>
     * 在节点 c1 开始相交。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * <p>
     * <p>
     * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
     * 输出：Reference of the node with value = 8
     * 输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。
     * @Date 2022/9/9 9:38
     **/

    /**
     * @Author yoto
     * @Description 方法一：双指针-效率极低
     * @Date 2022/9/9 9:45
     **/
//    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode tempA = headA;
//        ListNode tempB = headB;
//        while (tempA != null) {
//            while (tempB != null) {
//                if (tempA == tempB) {
//                    return tempB;
//                }
//                tempB = tempB.next;
//            }
//            tempA = tempA.next;
//            tempB = headB;
//        }
//        return null;
//    }
//


    /**
     * @Author yoto
     * @Description 方法二：HashSet
     * @Date 2022/9/9 9:50
     **/

    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            boolean flag = set.add(headB);
            if (!flag) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
