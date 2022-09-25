package learning.heima.thread.ticket_syschronized_method;


public class Ticket implements Runnable{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (extracted2()) break;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized boolean extracted() {
        if (ticket>0){
            ticket--;
            System.out.println(Thread.currentThread().getName()+"����1��Ʊ,��ʣ"+ticket+"��Ʊ");
        }else {
            return true;
        }
        return false;
    }

    private static synchronized boolean extracted2() {
        if (ticket>0){
            ticket--;
            System.out.println(Thread.currentThread().getName()+"����1��Ʊ,��ʣ"+ticket+"��Ʊ");
        }else {
            return true;
        }
        return false;
    }
}
