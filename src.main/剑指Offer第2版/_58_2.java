package ��ָOffer��2��;

public class _58_2 {
    public String reverseLeftWords(String s, int n) {
        int headSize = n%s.length();
        return s.substring(headSize)+s.substring(0,headSize);
    }
}
