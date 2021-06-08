public abstract class Operation {
    protected OperationNotifier notifier;
    public String operation(int a, int b) {
        return "Performing " + this.getClass() + " on these two inputs " + a + " " + b + " results in: ";
    }
}
