public class Multiplication extends Operation {
    public Multiplication(OperationNotifier notifier) {
        this.notifier = notifier;
        this.notifier.attach(this);
    }
    @Override
    public String operation(int a, int b) {
        return super.operation(a,b) + "" + (a * b);
    }
}
