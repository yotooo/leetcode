package learning.heima.thread.waitnotify.productconsumer;

public class Foodie implements Runnable{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.LOCK){
                if(Desk.count==0){
                    break;
                }else {
                    //���Ѳ���10��
                    if (Desk.flag){
                        //��ʳ��
                        System.err.println("�����߳Ե��˺���");
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
