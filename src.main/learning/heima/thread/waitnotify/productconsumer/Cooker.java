package learning.heima.thread.waitnotify.productconsumer;

public class Cooker implements Runnable {

    @Override
    public void run() {
        while (true) {//һֱ����������
            synchronized (Desk.LOCK) {
                if (Desk.count == 0) {
                    break;
                } else {
                    //��������������10
                    //�ж��������Ƿ��к�����
                    if (Desk.flag) {
                        //�������к�����
                        try {
                            Desk.LOCK.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //������û�к�����
                        System.out.println("��ʦ������һ��������...");
                        Desk.count--;
                        Desk.flag = true;//�������к�������
                        Desk.LOCK.notifyAll();//����������
                    }
                }
            }
        }
    }
}
