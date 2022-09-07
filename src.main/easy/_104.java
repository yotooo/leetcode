package easy;

public class _104 {


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);//1
        int rightHeight = maxDepth(root.right);//2
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(7);
        TreeNode treeNode3 = new TreeNode(15);
        TreeNode treeNode2 = new TreeNode(20, treeNode3, treeNode4);

        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode = new TreeNode(3, treeNode1, treeNode2);

        _104 v = new _104();
        System.out.println(v.maxDepth(treeNode));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
