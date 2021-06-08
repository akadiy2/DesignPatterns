public class Main {
    public static void main (String [] args) {
        OperationNotifier notifier = new OperationNotifier();
        Operation add = new Add(notifier);
        Operation subtract = new Subtract(notifier);
        Operation multiplication = new Multiplication(notifier);

        notifier.setState(20, 5);
    }
}
