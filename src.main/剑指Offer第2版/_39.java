package ��ָOffer��2��;

public class _39 {
    /**
     * ��ָ Offer 39. �����г��ִ�������һ�������
     * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
     *
     * ����Լ��������Ƿǿյģ����Ҹ������������Ǵ��ڶ���Ԫ�ء�
     *
     * ʾ�� 1:
     *
     * ����: [1, 2, 3, 2, 2, 2, 5, 4, 2]
     * ���: 2
     *
     *
     * ���ƣ�
     *
     * 1 <= ���鳤�� <= 50000
     */
    /**
     * @Author yoto
     * @Description ����һ������HashMap��¼���ִ���
     * @Date 2022/9/9 9:06
     **/
//    public int majorityElement(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer integer = map.get(nums[i]);
//            if (integer==null){
//                map.put(nums[i],1);
//            }else {
//                map.put(nums[i],integer+1);
//                if (map.get(nums[i])> nums.length/2){
//                    return nums[i];
//                }
//            }
//        }
//        return 0;
//    }

    /**
     * @Author yoto
     * @Description ��������Ħ��ͶƱ�㷨
     * @Date 2022/9/9 9:07
     **/
    public int majorityElement(int[] nums) {
        int votes = 0;//ͶƱƱ��
        int mode = nums[0];//����
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==mode){
                votes++;
            }else {
                votes--;
            }
            if (votes==0){
                mode = nums[i+1];
            }
        }
        return mode;
    }
}