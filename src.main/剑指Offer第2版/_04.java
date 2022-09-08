package ��ָOffer��2��;

public class _04 {
    /**
     * @Author yoto
     * @Description ��ָ Offer 04. ��ά�����еĲ���
     * ��һ�� n * m �Ķ�ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳�����������һ����Ч�ĺ�����
     * ����������һ����ά�����һ���������ж��������Ƿ��и�������
     *
     * ?
     *
     * ʾ��:
     *
     * ���о��� matrix ���£�
     *
     * [
     *   [1,   4,  7, 11, 15],
     *   [2,   5,  8, 12, 19],
     *   [3,   6,  9, 16, 22],
     *   [10, 13, 14, 17, 24],
     *   [18, 21, 23, 26, 30]
     * ]
     * ���� target?=?5������?true��
     *
     * ����?target?=?20������?false��
     *
     * ?
     *
     * ���ƣ�
     *
     * 0 <= n <= 1000
     *
     * 0 <= m <= 1000
     * @Date 2022/9/8 10:42
     **/

    /**
     * @Author yoto
     * @Description ����һ���������
     * @Date 2022/9/8 10:54
     **/
//    public boolean findNumberIn2DArray(int[][] matrix, int target) {
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j]==target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }


    /**
     * @Author yoto
     * @Description �����������ֲ���
     * @Date 2022/9/8 11:01
     **/
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length==0){
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            int flag = binarySearch(matrix[i], 0, matrix.length - 1, target);
            if (flag != -1) {
                return true;
            }
        }
        return false;
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        if (start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if (target == arr[mid]){
            return mid;
        }
        if (target>arr[mid]){
            return binarySearch(arr,mid+1,end,target);
        }else {
            return binarySearch(arr,start,mid-1,target);
        }

    }

    public static void main(String[] args) {
        int[] ints = {2, 5, 8, 12, 19};
        int[][] ints1 = new int[0][0];
        int target = 3;
        _04 v = new _04();
        System.out.println(v.findNumberIn2DArray(ints1,1));
    }
}
