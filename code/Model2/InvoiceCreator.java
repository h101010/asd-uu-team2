
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

    private Invoice createInvoice(User user) {
        SubscriptionModel subModel =  user.getProfile().getSubscriptionModel();
        Date dueDate = subModel.getDueDate();
        float amount = subModel.calculateAmount(user.getCompletedJobs());
        Invoice invoice = new Invoice(amount, dueDate, user);
        Notify notify = Notify.getInstance();
        notify.notifyUser(user, invoice);
        return invoice;
    }


}
