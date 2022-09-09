package ��ָOffer��2��;

import java.util.HashSet;
import java.util.Set;

public class _52 {
    /**
     * @Author yoto
     * @Description ��ָ Offer 52. ��������ĵ�һ�������ڵ�
     * �������������ҳ����ǵĵ�һ�������ڵ㡣
     * <p>
     * ���������������
     * <p>
     * <p>
     * <p>
     * �ڽڵ� c1 ��ʼ�ཻ��
     * <p>
     * <p>
     * <p>
     * ʾ�� 1��
     * <p>
     * <p>
     * <p>
     * ���룺intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
     * �����Reference of the node with value = 8
     * ������ͣ��ཻ�ڵ��ֵΪ 8 ��ע�⣬��������б��ཻ����Ϊ 0�����Ӹ��Եı�ͷ��ʼ�������� A Ϊ [4,1,8,4,5]������ B Ϊ [5,0,1,8,4,5]���� A �У��ཻ�ڵ�ǰ�� 2 ���ڵ㣻�� B �У��ཻ�ڵ�ǰ�� 3 ���ڵ㡣
     * @Date 2022/9/9 9:38
     **/

    /**
     * @Author yoto
     * @Description ����һ��˫ָ��-Ч�ʼ���
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
     * @Description ��������HashSet
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
