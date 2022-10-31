package ��ָOffer��2��;

public class _27 {
    /**
     * @Author yoto
     * @Description �����һ������������һ�����������ú���������ľ���
     * <p>
     * �������룺
     * <p>
     * 4
     * /  \
     * 2   7
     * / \  / \
     * 1  3 6  9
     * ���������
     * <p>
     * 4
     * /  \
     * 7   2
     * / \  / \
     * 9  6 3 1
     * <p>
     * <p>
     * <p>
     * ʾ�� 1��
     * <p>
     * ���룺root = [4,2,7,1,3,6,9]
     * �����[4,7,2,9,6,3,1]
     * <p>
     * ��Դ�����ۣ�LeetCode��
     * ���ӣ�https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof
     * ����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
     * @Date 2022/10/31 9:48
     *
     * ����һ���ݹ�
     * ˼·���㷨
     *
     * ����һ���ܾ���Ķ��������⡣��Ȼ�����ǴӸ��ڵ㿪ʼ���ݹ�ض������б���������Ҷ�ӽڵ��ȿ�ʼ��ת�õ�����
     * �����ǰ�������Ľڵ� root �����������������Ѿ���ת�õ�������ô����ֻ��Ҫ��������������λ�ã�
     * ���ɵõ��� root Ϊ���ڵ�����������ľ���
     **/






    public TreeNode mirrorTree(TreeNode root) {
        //�ݹ���ֹ�����������ڵ�Ϊ��
        if (root == null) {
            return null;
        }
        //�ȵݹ鵽��ײ㣬�ٿ�ʼ�滻���ҽڵ�
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
