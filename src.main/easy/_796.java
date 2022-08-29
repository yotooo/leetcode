package easy;

public class _796 {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal)) return true;
        for (int i = 1; i < s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            sb.append(s.substring(i));
            sb.append(s.substring(0, i));
            if (sb.toString().equals(goal)) return true;

        }
        return false;
    }

    public static void main(String[] args) {
        String s = "12345";
        System.out.println(s.substring(1, 2));
        _796 v = new _796();
        System.out.println(v.rotateString("abcde", "cdeab"));
    }
}
