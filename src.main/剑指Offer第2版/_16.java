package 剑指Offer第2版;

public class _16 {
    /**
     * 剑指 Offer 16. 数值的整数次方
     * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：x = 2.00000, n = 10
     * 输出：1024.00000
     * 示例 2：
     * <p>
     * 输入：x = 2.10000, n = 3
     * 输出：9.26100
     * 示例 3：
     * <p>
     * 输入：x = 2.00000, n = -2
     * 输出：0.25000
     * 解释：2-2 = 1/22 = 1/4 = 0.25
     */

    public double myPow1(double x, int n) {
        if (n<0){
            x = 1/x;
            n = -n;
        }
        if(n == 0){
            return 1;
        }else if (n %2 == 1){
            return x*myPow1(x,n-1);
        }else {
            double temp = myPow1(x,n/2);
            return temp * temp;
        }
    }

//    public double myPow(double x, int n) {
//        if (x==1){
//            return 1;
//        }
//        if (x==-1){
//            int i = n % 2;
//            if (i==0){
//                return 1;
//            }else {
//                return -1;
//            }
//        }
//        if (n==0){
//            return 1;
//        }
//        double result = 1;
//        if (n > 0) {
//            if (n==Integer.MAX_VALUE){
//                return 0;
//            }
//            for (int i = 0; i < n; i++) {
//                result = result * x;
//            }
//            return result;
//        }else {
//            if (n==Integer.MIN_VALUE){
//                return 0;
//            }
//            for (int i = n; i < 0; i++) {
//                result = result * x;
//            }
//            return 1.00/result;
//        }
//
//    }


    /**
     * @Author yoto
     * @Description 递归快速幂
     * @Date 2022/9/13 10:00
     **/
    public double myPow(double x, int n) {
        long nL = n;
        if (nL<0){
            nL = -nL;
            x = 1/x;
        }
        if (nL == 0)
            return 1;
        else if (nL % 2 == 1)//幂为奇数
            return myPow(x, Math.toIntExact(nL - 1)) * x;
        else {//幂为偶数
            double temp = myPow(x, Math.toIntExact(nL / 2));//幂除以2递归
            return temp * temp;
        }
    }


    public static void main(String[] args) {
        _16 v = new _16();
        double v1 = v.myPow(2, -2);
        double v2 = v.myPow1(2, -2);
        //7^10=(7^5)^2=(7^2 * 7^2 * 7)^2
        System.out.println(v1);
        System.out.println(v2);
    }
}