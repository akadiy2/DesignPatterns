public class Subtract extends Operation{
    public Subtract(OperationNotifier notifier) {
        this.notifier = notifier;
        this.notifier.attach(this);
    }
    @Override
    public String operation(int a, int b) {
        return super.operation(a,b) + "" + (a - b);
    }
}
