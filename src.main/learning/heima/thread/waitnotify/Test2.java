package learning.heima.thread.waitnotify;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("A�߳̿�ʼִ��...");
                    try {
                        System.out.println("A�߳̽������޵ȴ�...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A�߳�ִ�����...");
                }
            }
        },"A").start();


        Thread.sleep(3000);

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("B�߳̿�ʼִ��...");
                    try {
                        System.out.println("B�̻߳���A�߳�...");
                        lock.notifyAll();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("B�߳�ִ�����...");
                }
            }
        },"B").start();
    }
}
