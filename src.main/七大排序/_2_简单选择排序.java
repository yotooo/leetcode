package ∆ﬂ¥Û≈≈–Ú;

public class _2_ºÚµ•—°‘Ò≈≈–Ú {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 1, 5, 8, 3, 7, 4, 6, 2};
//        int[] ints = new int[]{2,1,3,4,5,6,9,8,7};
        System.out.println("ºÚµ•—°‘Ò≈≈–Ú«∞");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println();

        int min = 0;
        for (int i = 0; i < ints.length; i++) {
            min = i;
            for (int j = i; j < ints.length; j++) {
                if (ints[i] > ints[j]) {
                    min = j;
                }
                if (i != min) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                    min = i;
                }
            }
        }

        System.out.println();
        System.out.println("ºÚµ•—°‘Ò≈≈–Ú∫Û");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }
}
