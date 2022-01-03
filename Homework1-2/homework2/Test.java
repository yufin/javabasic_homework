package homework2;

public class Test {
    public static void main(String[] args) {
        OldPhone p1 = new OldPhone();
        NewPhone p2 = new NewPhone();
        p1.call();
        p1.sms();
        p2.call();
        p2.sms();
        p2.playGame();

    }
}
