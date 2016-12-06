
import java.util.*;

/**
 * 
 */
public class Notify {
    private static final Notify notify = new Notify();
    /**
     * Default constructor
     */
    private Notify() {
    }
    public static Notify getInstance() {
        return notify;
    }

    public void notifyUser(User receiver, Invoice invoice) {
        receiver.addInvoice(invoice);
    }

}