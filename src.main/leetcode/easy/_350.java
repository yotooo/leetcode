package leetcode.easy;

import java.util.Arrays;

/**
 * @Author yoto
 * @Description 方法二：排序 + 双指针
 * 如果两个数组是有序的，则可以使用双指针的方法得到两个数组的交集。
 *
 * 首先对两个数组进行排序，然后使用两个指针遍历两个数组。
 *
 * 初始时，两个指针分别指向两个数组的头部。每次比较两个指针指向的两个数组中的数字，如果两个数字不相等，则将指向较小数字的指针右移一位，如果两个数字相等，将该数字添加到答案，并将两个指针都右移一位。当至少有一个指针超出数组范围时，遍历结束。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode.cn/problems/intersection-of-two-arrays-ii/solution/liang-ge-shu-zu-de-jiao-ji-ii-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @Date 2022/8/30 10:50
**/

public class _350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1=0;
        int index2=0;
        int index = 0;
        int length1 = nums1.length;
        int length2 = nums2.length;
        int length = Math.min(length1,length2);
        int[] resultNums = new int[length];
        while(index1<length1&&index2<length2){
            if (nums1[index1]>nums2[index2]){
                index2++;
            }else if(nums1[index1]<nums2[index2]){
                index1++;
            }else {
                resultNums[index]=nums1[index1];
                index1++;
                index2++;
                index++;
            }
        }
        return Arrays.copyOfRange(resultNums,0,index);
    }
}
