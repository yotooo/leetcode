package learning.heima.thread.waitnotify.productconsumer;

public class Cooker implements Runnable {

    @Override
    public void run() {
        while (true) {//一直生产汉堡包
            synchronized (Desk.LOCK) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //生产的数量不够10
                    //判断桌子上是否有汉堡包
                    if (Desk.flag) {
                        //桌子上有汉堡包
                        try {
                            Desk.LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //桌子上没有汉堡包
                        System.out.println("厨师生产了一个汉堡包...");
                        Desk.count--;
                        Desk.flag = true;//桌子上有汉堡包了
                        Desk.LOCK.notifyAll();//唤醒消费者
                    }
                }
            }
        }
    }
}
