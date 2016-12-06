
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
    /**
     * @param reciver 
     * @param object 
     * @return
     */
    public void notifyUser(User reciever, Invoice invoice) {
        reciever.addInvoice(invoice);
    }

}