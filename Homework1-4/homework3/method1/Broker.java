package homework3.method1;

public class Broker {
    private int ticketsAvailable = 100;

//    public int getTicketsAvailable() {
//        return ticketsAvailable;
//    }

    public synchronized void booking() {
        notify();
        if (ticketsAvailable > 0) {
            ticketsAvailable--;
            System.out.printf("%s已订票, 余票%d张\n",
                    Thread.currentThread().getName(), ticketsAvailable );
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
