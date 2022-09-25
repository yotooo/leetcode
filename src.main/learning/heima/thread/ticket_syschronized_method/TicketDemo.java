package learning.heima.thread.ticket_syschronized_method;

public class TicketDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();
        Thread thread1 = new Thread(ticket,"´°¿Ú1");
        Thread thread2 = new Thread(ticket2,"´°¿Ú2");
        Thread thread3 = new Thread(ticket3,"´°¿Ú3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
