package homework2;

public class OldPhone extends CellPhone{
    public OldPhone() {
        super("OldPhone");
    }

    @Override
    void call() {
        System.out.printf("%s function: call %n", getModeName());
    }

    @Override
    void sms() {
        System.out.printf("%s function: sms %n", getModeName());
    }
}
