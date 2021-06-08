import java.util.ArrayList;
import java.util.List;

public class OperationNotifier {
    private List<Operation> operations = new ArrayList<>();
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void attach(Operation operation) {
        this.operations.add(operation);
    }

    public void setState(int a, int b) {
        notifyAllObservers(a, b);
    }

    private void notifyAllObservers(int a, int b) {
        for (Operation o : operations) {
            System.out.println(o.operation(a, b));
        }
    }
}
