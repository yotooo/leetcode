package ½£Ö¸OfferµÚ2°æ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _56_1 {
    public int[] singleNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer integer :nums) {
            if(!set.add(integer)){
                set.remove(integer);
            }
        }
        Integer one = set.iterator().next();
        set.remove(one);
        Integer two = set.iterator().next();
        return new int[]{one,two};
    }

    public static void main(String[] args) {
        _56_1 v = new _56_1();
        v.singleNumbers(new int[]{4,1,4,5});
    }
}
