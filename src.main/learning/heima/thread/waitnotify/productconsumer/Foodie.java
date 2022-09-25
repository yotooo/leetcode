package learning.heima.thread.waitnotify.productconsumer;

public class Foodie implements Runnable{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.LOCK){
                if(Desk.count==0){
                    break;
                }else {
                    //消费不够10个
                    if (Desk.flag){
                        //有食物
                        System.err.println("消费者吃掉了汉堡");
                        Desk.flag = false;
                        Desk.LOCK.notifyAll();
                    }else {
                        try {
                            Desk.LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
