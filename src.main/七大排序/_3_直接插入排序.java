package �ߴ�����;


/**
 * @Author yoto
 * @Description
 *
 * ��һ����¼���뵽���ź���������У��Ӷ��õ�һ���µ���������
 * �������еĵ�һ�����ݿ�����һ������������У�Ȼ��ӵڶ�����¼����������������н�������Ĳ��룬ֱ��������������
 * �ص㣺ʹ���ڱ���������ʱ�洢���ж�����߽硣
 * @Date 2022/10/31 16:00
**/
public class _3_ֱ�Ӳ������� {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] ints = new int[]{2,1,3,4,5,6,9,8,7};
        soutSortPre(ints);

        int temp;
        for (int i=1;i<ints.length;i++){
            //����Ԫ��С���������е����һ��Ԫ��ʱ����ǰ����
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
        System.out.println("��ѡ������ǰ");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();
    }

    private static void soutSortOver(int[] ints) {
        System.out.println();
        System.out.println("��ѡ�������");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
