package learning.heima.thread.waitnotify;

public class Test1 {
    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("�߳̿�ʼִ��...");
                    try {
                        System.out.println("�߳̽������޵ȴ�...");
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�߳�ִ�����...");
                }
            }
        }).start();
    }
}
