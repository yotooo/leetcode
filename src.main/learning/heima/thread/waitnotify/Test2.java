package learning.heima.thread.waitnotify;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("A线程开始执行...");
                    try {
                        System.out.println("A线程进入无限等待...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A线程执行完毕...");
                }
            }
        },"A").start();


        Thread.sleep(3000);

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("B线程开始执行...");
                    try {
                        System.out.println("B线程唤醒A线程...");
                        lock.notifyAll();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("B线程执行完毕...");
                }
            }
        },"B").start();
    }
}
