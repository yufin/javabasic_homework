//火车买票案例 (两种实现方式) : 共100张票,三个线程一起卖票,不允许出现出现负票和多卖的现象
// (描述设置锁的时候要注意的事项:(Thread 和Runnable)

// Thread implementation
package homework3.method1;

public class BrokerTest {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Dealer d0 = new Dealer(broker);
        Dealer d1 = new Dealer(broker);
        Dealer d2 = new Dealer(broker);
        d0.start();
        d1.start();
        d2.start();
    }
}
