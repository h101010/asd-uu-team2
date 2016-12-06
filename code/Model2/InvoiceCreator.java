
import java.util.*;

/**
 * 
 */
public class InvoiceCreator {

    /**
     * Default constructor
     */
    private List<Invoice> invoiceList;
    private List<User> userList;

    public InvoiceCreator() {
    }


    public void invoiceTrigger(){
        for (User user : userList ){
            invoiceList.add(createInvoice(user));
        }
    }
    private Invoice createInvoice(void user) {
        Invoice invoice = new Invoice(user);
        return invoice;
    }


    public void Notify.notify(void User, void Invoice) {
        // TODO implement here
        return null;
    }

}