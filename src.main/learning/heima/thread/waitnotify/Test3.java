package learning.heima.thread.waitnotify;

public class Test3 {
    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (lock) {
                    System.out.println("�߳̿�ʼִ��...");
                    try {
                        System.out.println("�߳̽����ʱ�ȴ�...");
                        lock.wait(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("�߳�ִ�����...");
                }
            }
        }).start();
    }
}
