package learning.heima.thread.ticket_lock.ticket_syschronized_method;


import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
    private int ticket = 100;
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();//获得锁
            if (ticket > 0) {
                ticket--;
                System.out.println(Thread.currentThread().getName() + "卖了1张票,还剩" + ticket + "张票");
            } else {
                break;
            }


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();//释放锁
            }
        }
    }


}
