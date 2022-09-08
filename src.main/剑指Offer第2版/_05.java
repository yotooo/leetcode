package 剑指Offer第2版;

public class _05 {
    /**
     * @Author yoto 
     * @Description 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     *
     * ?
     *
     * 示例 1：
     *
     * 输入：s = "We are happy."
     * 输出："We%20are%20happy."
     * @Date 2022/9/8 15:11 
    **/

    /**
     * @Author yoto
     * @Description  方法一：for+StringBuffer
     * @Date 2022/9/8 15:12
    **/
//    public String replaceSpace(String s) {
//        StringBuffer result = new StringBuffer();
//        for (int i = 0; i < s.length(); i++) {
//            String substring = s.substring(i, i + 1);
//            if (substring.equals(" ")){
//                result.append("%20");
//            }else {
//                result.append(substring);
//            }
//        }
//        return result.toString();
//    }

    /**
     * @Author yoto
     * @Description  方法二：String.replace()
     * @Date 2022/9/8 15:12
    **/
    public String replaceSpace(String s) {
        s = s.replace(" ", "%20");
        return s;
    }



    public static void main(String[] args) {
        _05 v = new _05();
        String s = v.replaceSpace(" 1 23 456");
        System.out.println(s);
    }
}
