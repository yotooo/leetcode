package normal;

public class _98 {

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

    public boolean isValidBST(TreeNode root) {

        return true;
    }
    public boolean isValidBST1(TreeNode root){
        int val = root.val;
        if (root.left.val>val||root.right.val<val){
            return false;
        }
        if (root.left!=null&&root.left.val<val){
            root = root.left;
            return isValidBST1(root);
        }

        if (root.right!=null&&root.right.val<val){
            root = root.right;
            return isValidBST1(root);
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(6, treeNode3, treeNode4);
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode = new TreeNode(5, treeNode1, treeNode2);
        _98 v = new _98();
        System.out.println(v.isValidBST(treeNode));
    }

}