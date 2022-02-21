//    火车买票案例 (两种实现方式) : 共100张票,三个线程一起卖票,
//    不允许出现出现负票和多卖的现象  (描述设置锁的时候要注意的事项:(Thread 和Runnable)

package homework3.method2;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBooking implements Runnable{
    private int places = 100;
    private final ReentrantLock lock = new ReentrantLock();

    public TicketBooking(int places) {
        this.places = places;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }


    @Override
    public void run() {
        int orderQuantity = 1;
        while (true) {
            synchronized (this) {
                notifyAll();
                int remain = getPlaces();

                if (remain >= orderQuantity) {
                    remain -= orderQuantity;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    setPlaces(remain);
                    System.out.printf("%s已成功订票%d张, 余票%d张\n", Thread.currentThread().getName(), orderQuantity, remain);
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.printf("%s:余票不足%d张\n", Thread.currentThread().getName(),orderQuantity);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        TicketBooking tb = new TicketBooking(100);

        Thread t1 = new Thread(tb);
        Thread t2 = new Thread(tb);
        Thread t3 = new Thread(tb);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("开始卖票");
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("最终余票%d张", tb.getPlaces());
    }



}
