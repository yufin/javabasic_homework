package homework3.method1;

public class Dealer extends Thread{
    private final Broker broker;

    public Dealer(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        while (true) {
            broker.booking();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
