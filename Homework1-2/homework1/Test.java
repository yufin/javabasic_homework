package homework1;

public class Test {

    public static void main(String[] args) {
        System.out.println("revalue by setter:");
        Coder c = new Coder();
        c.setName("Satoshi");
        c.setId(1);
        c.setSalary(100000);
        c.work();
        Manager m = new Manager();
        m.setName("Elon");
        m.setId(0);
        m.setSalary(200000);
        m.setBonus(800000);
        m.work();

        System.out.println("\nrevalue by construction method:");

        Coder c1 = new Coder("Satoshi", 1, 1000000);
        c1.work();
        Manager m1 = new Manager("Elon", 0, 200000, 800000);
        m1.work();
    }
}
