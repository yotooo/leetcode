package normal;

import java.util.*;

public class _15 {
    /**
     * ����һ������ n ������������?nums���ж�?nums?���Ƿ��������Ԫ�� a��b��c ��ʹ��?a + b + c = 0 �������ҳ����к�Ϊ 0 �Ҳ��ظ�����Ԫ�顣
     * <p>
     * ע�⣺���в����԰����ظ�����Ԫ�顣
     *
     * @param args
     */
    public static void main(String[] args) {
        _15 v = new _15();
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        System.out.println(v.threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        one:for (int i = 0; i < nums.length; i++) {
            two:for (int j = i + 1; j < nums.length; j++) {
                three:for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list1 = new ArrayList<>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        Collections.sort(list1);
                        list.add(list1);
                    }
                }
            }
        }
        Set set = new HashSet();
        set.addAll(list);
        List<List<Integer>> listList = new ArrayList<>();
        listList.addAll(set);
        return listList;
    }
}
