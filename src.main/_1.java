import javax.swing.tree.TreeNode;

public class _1 {
//    int maxValue=0;
//    public int numColor (TreeNode root) {
//
//
//        if(node==null){
//            return 0;
//        }
//        int left = Math.max(0,maxPathDown(node.left));
//        int right = Math.max(0,maxPathDown((node.right)));
//        maxValue = Math.max(maxValue,left+right+node.val);
//        return Math.max(left,right)+node.val;
//    }
//
//    public int maxPathDown(TreeNode no(int[]de){
//        // write code here
//        if(root==null){
//            return 0;
//        }
//        maxValue = Integer.MAX_VALUE;
//        maxPathDown(root);
//        return maxValue;
//    }


//
//    public int change (int[] oils, int box) {
//        // write code here
//        for (int i = 0; i < oils.length; i++) {
//
//        }
//
//    }


    public int change(int[] coins, int amount) {
        if (amount < 1) {
            return 0;
        }
        return coinChange(coins, amount, new int[amount]);
    }

    private int coinChange(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }




}
