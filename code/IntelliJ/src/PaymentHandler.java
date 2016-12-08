
import java.util.*;

public class PaymentHandler{
    private static final PaymentHandler paymenthandler = new PaymentHandler();

    private PaymentHandler() {
    }

    public static PaymentHandler getPaymenthandler() {
        return paymenthandler;
    }
    public void pay(Invoice invoice) {
        invoice.pay();
    }


}