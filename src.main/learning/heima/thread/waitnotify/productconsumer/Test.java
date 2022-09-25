package learning.heima.thread.waitnotify.productconsumer;

public class Test {
    public static void main(String[] args) {
        new Thread(new Cooker()).start();
        new Thread(new Foodie()).start();
    }
}
