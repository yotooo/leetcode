package ��ָOffer��2��;

public class _03 {
    /**
     * @Author yoto 
     * @Description �ҳ��������ظ������֡�
     *
     * ��һ������Ϊ n ������ nums ����������ֶ��� 0��n-1 �ķ�Χ�ڡ�������ĳЩ�������ظ��ģ�����֪���м��������ظ��ˣ�
     * Ҳ��֪��ÿ�������ظ��˼��Ρ����ҳ�����������һ���ظ������֡�
     *
     * ʾ�� 1��
     * ���룺
     * [2, 3, 1, 0, 2, 5, 3]
     * �����2 �� 3 
     * ���ƣ�
     * 2 <= n <= 100000
     * @Date 2022/9/8 10:11 
    **/

//    public int findRepeatNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            boolean flag = set.add(nums[i]);
//            if (!flag){
//                return nums[i];
//            }
//        }
//        return 0;
//    }


    public int findRepeatNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length - i; j++) {
                if (nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] ints = {3,4,2,1,1,0};
        _03 v = new _03();
        v.findRepeatNumber(ints);
    }
}
