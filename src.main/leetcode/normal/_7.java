package leetcode.normal;

public class _7 {
    /**
     * ����һ�� 32 λ���з������� x �����ؽ� x �е����ֲ��ַ�ת��Ľ����
     *
     * �����ת���������� 32 λ���з��������ķ�Χ?[?231,? 231?? 1] ���ͷ��� 0��
     *
     * ���軷��������洢 64 λ�������з��Ż��޷��ţ���
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
