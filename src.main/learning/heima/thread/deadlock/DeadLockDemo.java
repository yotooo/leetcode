package learning.heima.thread.deadlock;

public class DeadLockDemo {
    public static void main(String[] args) {
        String 筷子A = "筷子A";
        String 筷子B = "筷子B";

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (筷子A){
                        System.out.println("小明拿到了筷子A,等待筷子B");
                        synchronized (筷子B){
                            System.out.println("小明拿到了筷子A和筷子B,开吃...");
                        }
                    }
                }
            }
        },"小明").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (筷子B){
                        System.out.println("小红拿到了筷子B,等待筷子A");
                        synchronized (筷子A){
                            System.out.println("小红拿到了筷子A和筷子B,开吃...");
                        }
                    }
                }
            }
        },"小红").start();

    }
}
