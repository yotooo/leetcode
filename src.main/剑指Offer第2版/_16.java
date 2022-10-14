package ��ָOffer��2��;

public class _16 {
    /**
     * ��ָ Offer 16. ��ֵ�������η�
     * ʵ�� pow(x, n) �������� x �� n ���ݺ���������xn��������ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣
     * <p>
     * <p>
     * <p>
     * ʾ�� 1��
     * <p>
     * ���룺x = 2.00000, n = 10
     * �����1024.00000
     * ʾ�� 2��
     * <p>
     * ���룺x = 2.10000, n = 3
     * �����9.26100
     * ʾ�� 3��
     * <p>
     * ���룺x = 2.00000, n = -2
     * �����0.25000
     * ���ͣ�2-2 = 1/22 = 1/4 = 0.25
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
     * @Description �ݹ������
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
        else if (nL % 2 == 1)//��Ϊ����
            return myPow(x, Math.toIntExact(nL - 1)) * x;
        else {//��Ϊż��
            double temp = myPow(x, Math.toIntExact(nL / 2));//�ݳ���2�ݹ�
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