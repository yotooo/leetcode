package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class _804 {
        public static void main(String[] args) {
            _804 v = new _804();
            String[] strings = new String[]{"gin", "zen", "gig", "msg"};
            System.out.println(v.uniqueMorseRepresentations(strings));
        }
        public int uniqueMorseRepresentations(String[] words) {
            Set hashSet = new HashSet();

            for (int i = 0; i < words.length; i++) {
                String replace = replace(words[i]);
                System.out.println(replace);
                hashSet.add(replace);
            }
            return hashSet.size();
        }

        public String replace(String s) {
            s = s.replace("a", ".-");
            s = s.replace("b", "-...");
            s = s.replace("c", "-.-.");
            s = s.replace("d", "-..");
            s = s.replace("e", ".");
            s = s.replace("f", "..-.");
            s = s.replace("g", "--.");
            s = s.replace("h", "....");
            s = s.replace("i", "..");
            s = s.replace("j", ".---");
            s = s.replace("k", "-.-");
            s = s.replace("l", ".-..");
            s = s.replace("m", "--");
            s = s.replace("n", "-.");
            s = s.replace("o", "---");
            s = s.replace("p", ".--.");
            s = s.replace("q", "--.-");
            s = s.replace("r", ".-.");
            s = s.replace("s", "...");
            s = s.replace("t", "-");
            s = s.replace("u", "..-");
            s = s.replace("v", "...-");
            s = s.replace("w", ".--");
            s = s.replace("x", "-..-");
            s = s.replace("y", "-.--");
            s = s.replace("z", "--..");
            return s;
        }
}
