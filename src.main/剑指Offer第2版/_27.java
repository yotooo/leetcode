package 剑指Offer第2版;

public class _27 {
    /**
     * @Author yoto
     * @Description 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
     * <p>
     * 例如输入：
     * <p>
     * 4
     * /  \
     * 2   7
     * / \  / \
     * 1  3 6  9
     * 镜像输出：
     * <p>
     * 4
     * /  \
     * 7   2
     * / \  / \
     * 9  6 3 1
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：root = [4,2,7,1,3,6,9]
     * 输出：[4,7,2,9,6,3,1]
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @Date 2022/10/31 9:48
     *
     * 方法一：递归
     * 思路与算法
     *
     * 这是一道很经典的二叉树问题。显然，我们从根节点开始，递归地对树进行遍历，并从叶子节点先开始翻转得到镜像。
     * 如果当前遍历到的节点 root 的左右两棵子树都已经翻转得到镜像，那么我们只需要交换两棵子树的位置，
     * 即可得到以 root 为根节点的整棵子树的镜像。
     **/






    public TreeNode mirrorTree(TreeNode root) {
        //递归终止条件，当父节点为空
        if (root == null) {
            return null;
        }
        //先递归到最底层，再开始替换左右节点
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
