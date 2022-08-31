package easy;

public class _387 {
    public int firstUniqChar(String s) {
        one:for(int i = 0;i <s.length();i++){
            two:for(int j =0;j<s.length()-i;j++){
                if (i==j){
                    j++;
                }
                String s1 = s.substring(i, i + 1);
                String s2 = s.substring(j, j + 1);
                if(s1.equals(s2)){
                    continue one;
                }
            }
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        _387 v = new _387();
        int i = v.firstUniqChar(s);
        System.out.println(i);
    }
}