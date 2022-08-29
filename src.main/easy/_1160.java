package easy;

public class _1160 {
        public int countCharacters(String[] words, String chars) {
            int result=0;
            one:for (int i = 0; i < words.length; i++) {
                String chars1 =chars;
                String word = words[i];
                two:for (int j = 0; j < word.length(); j++) {
                    String substring = word.substring(j, j + 1);
                    boolean contains = chars1.contains(substring);
                    if (!contains){
                        continue one;
                    }
                    chars1 = chars1.replaceFirst(substring, "");

                }
                result+=word.length();
            }
            return result;
        }

    public static void main(String[] args) {

        _1160 v = new _1160();
        String[] strings = new String[]{
                "dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
                "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb",
                "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
                "boygirdlggnh",
                "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
                "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
                "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
                "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr",
                "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo",
                "oxgaskztzroxuntiwlfyufddl",
                "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
                "qnagrpfzlyrouolqquytwnwnsqnmuzphne",
                "eeilfdaookieawrrbvtnqfzcricvhpiv",
                "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz",
                "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
                "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv",
                "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo",
                "teyygdmmyadppuopvqdodaczob",
                "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs",
                "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"
        };
        System.out.println(v.countCharacters(strings, "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
    }
}
