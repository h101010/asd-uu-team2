
import java.util.*;

/**
 *
 */
public class InvoiceCreator {
    private static final InvoiceCreator invoiceCreator = new InvoiceCreator();
    Notify notify = Notify.getInstance();

    /**
     * Default constructor
     */
    private List<Invoice> invoiceList;
    private List<User> userList;

    private InvoiceCreator() {
    }
    public static InvoiceCreator getInstance(){
        return invoiceCreator;
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
        Invoice invoice;
        if (user instanceof Requester) {
            invoice = new Bill(amount, dueDate, (Requester) user);
        } else {
            invoice = new Wage(amount, dueDate, (Responder) user);
        }


        notify.notifyUser(user, invoice);
        return invoice;
    }


}
