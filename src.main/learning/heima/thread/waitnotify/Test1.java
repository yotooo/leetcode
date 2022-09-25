package learning.heima.thread.waitnotify;

public class Test1 {
    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("线程开始执行...");
                    try {
                        System.out.println("线程进入无限等待...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程执行完毕...");
                }
            }
        }).start();
    }
}
