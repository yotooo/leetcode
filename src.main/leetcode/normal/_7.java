package leetcode.normal;

public class _7 {
    /**
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围?[?231,? 231?? 1] ，就返回 0。
     *
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     * @param x
     * @return
     */
    public int reverse(int x) {
        String strX = String.valueOf(x);
        String strXWithOut_Buffer = strX.replace("-", "");
        StringBuffer strXWithOut_ = new StringBuffer(strXWithOut_Buffer);
        strXWithOut_.reverse();
        if (strX.contains("-")){
            if (strXWithOut_.length()==32){
                return 0;
            }else {
                try {
                    return -Integer.parseInt(strXWithOut_.toString());
                } catch (NumberFormatException e) {

                    return 0;
                }
            }
        }
        try {
            return Integer.parseInt(strXWithOut_.toString());
        } catch (NumberFormatException e) {

            return 0;
        }
    }

    public static void main(String[] args) {
        _7 v = new _7();
        System.out.println(v.reverse(1534236469));
    }
}
