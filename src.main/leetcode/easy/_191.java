package leetcode.easy;

public class _191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        String s = Integer.toBinaryString(n);
        for (int i = 0; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            if (substring.equals("1")){
                result+=1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int s = 00000000000000000000000000001011;
        _191 v = new _191();
        int i = v.hammingWeight(s);
        System.out.println(i);
    }
}
