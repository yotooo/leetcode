package learning.heima.thread.waitnotify.productconsumer;

public class Desk {
    //汉堡包数量
    public static int count = 10;
    //表示桌子上的食物状态
    public static boolean flag = false;
    //LOCK表示唯一的锁对象
    public static final Object LOCK = new Object();

}