package learning.heima.thread.waitnotify.productconsumer;

public class Desk {
    //����������
    public static int count = 10;
    //��ʾ�����ϵ�ʳ��״̬
    public static boolean flag = false;
    //LOCK��ʾΨһ��������
    public static final Object LOCK = new Object();

}