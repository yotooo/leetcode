package learning.heima.thread.deadlock;

public class DeadLockDemo {
    public static void main(String[] args) {
        String ����A = "����A";
        String ����B = "����B";

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (����A){
                        System.out.println("С���õ��˿���A,�ȴ�����B");
                        synchronized (����B){
                            System.out.println("С���õ��˿���A�Ϳ���B,����...");
                        }
                    }
                }
            }
        },"С��").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (����B){
                        System.out.println("С���õ��˿���B,�ȴ�����A");
                        synchronized (����A){
                            System.out.println("С���õ��˿���A�Ϳ���B,����...");
                        }
                    }
                }
            }
        },"С��").start();

    }
}
