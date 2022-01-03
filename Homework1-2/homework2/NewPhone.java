package homework2;

public class NewPhone extends CellPhone implements IPlayGame {
    public NewPhone() {
        super("NewPhone");
    }

    @Override
    void call() {
        System.out.printf("%s function: call %n", getModeName());
    }

    @Override
    void sms() {
        System.out.printf("%s function: sms %n", getModeName());
    }

    @Override
    public void playGame() {
        System.out.printf("%s function: PlayGame %n", getModeName());
    }
}
