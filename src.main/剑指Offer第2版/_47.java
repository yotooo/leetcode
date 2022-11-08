package ��ָOffer��2��;

public class _47 {
    /**
     * @Author yoto
     * @Description ��һ�� m*n �����̵�ÿһ�񶼷���һ�����ÿ�����ﶼ��һ���ļ�ֵ����ֵ���� 0��������Դ����̵����Ͻǿ�ʼ�ø���������
     * ��ÿ�����һ��������ƶ�һ��ֱ���������̵����½ǡ�����һ�����̼������������ļ�ֵ���������������õ����ټ�ֵ�����
     * <p>
     * ʾ�� 1:
     * <p>
     * ����:
     * [
     * [1,3,1],
     * [1,5,1],
     * [4,2,1]
     * ]
     * ���: 12
     * ����: ·�� 1��3��5��2��1 �����õ�����ֵ������
     * @Date 2022/11/8 10:53
     **/
    public static void main(String[] args) {
        int[][] ints = new int[][]{{1,2,5},{3,2,1}};
        maxValue(ints);
    }
    public static int maxValue(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < grid.length; i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for (int i = 1; i < grid[0].length; i++) {
            dp[0][i] = grid[0][i] + dp[0][i-1];
        }

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                dp[i][j] = grid[i][j] + Math.max(dp[i-1][j],dp[i][j-1]);
                System.out.println(dp[i][j]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
