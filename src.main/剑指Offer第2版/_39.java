package ��ָOffer��2��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(nums[i]);
            if (integer==null){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],integer+1);
                if (map.get(nums[i])> nums.length/2){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}
