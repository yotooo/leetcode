package 七大排序;


/**
 * @Author yoto
 * @Description
 *
 * 将一个记录插入到已排好序的序列中，从而得到一个新的有序序列
 * （将序列的第一个数据看成是一个有序的子序列，然后从第二个记录逐个向该有序的子序列进行有序的插入，直至整个序列有序）
 * 重点：使用哨兵，用于临时存储和判断数组边界。
 * @Date 2022/10/31 16:00
**/
public class _3_直接插入排序 {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] ints = new int[]{2,1,3,4,5,6,9,8,7};
        soutSortPre(ints);

        int temp;
        for (int i=1;i<ints.length;i++){
            //待排元素小于有序序列的最后一个元素时，向前插入
            if (ints[i]<ints[i-1]){
                temp = ints[i];
                for (int j=i;j>=0;j--){
                    if (j>0 && ints[j-1]>temp) {
                        ints[j]=ints[j-1];
                    }else {
                        ints[j]=temp;
                        break;
                    }
                }
            }
        }

        soutSortOver(ints);
    }

    private static void soutSortPre(int[] ints) {
        System.out.println("简单选择排序前");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    private static void soutSortOver(int[] ints) {
        System.out.println();
        System.out.println("简单选择排序后");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
