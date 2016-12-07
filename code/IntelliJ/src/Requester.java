
import java.util.*;


public class Requester implements User {

    private List<Match> OngoingJobs;
    private List<Match> CompletedJobs;
    private List<Invoice> Invoices;
    private final Profile profile;
    
    public Requester() {
        profile = new Profile();
    }

    private Job createJob(Date deadline, Date preferredTime, float price, String description) {
        // TODO implement here
        return new Job(deadline, preferredTime, price, description, this);
    }

    public void submitJob(Job job) {
        Matcher matcher = Matcher.getInstance();
        addMatch(matcher.matchJob(job, this));
    }

    public void giveFeedback(Match match) {
        // TODO implement here
    }

    private void addMatch(Match match) {
        // TODO implement here
        OngoingJobs.add(match);
    }

    public void addInvoice(Invoice invoice) {
        // TODO implement here
    }

    public List<Match> getOngoingJobs() {
        return OngoingJobs;
    }

    public void setOngoingJobs(List<Match> ongoingJobs) {
        OngoingJobs = ongoingJobs;
    }

    public List<Match> getCompletedJobs() {
        return CompletedJobs;
    }

    public void setCompletedJobs(List<Match> completedJobs) {
        CompletedJobs = completedJobs;
    }

    public List<Invoice> getInvoices() {
        return Invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        Invoices = invoices;
    }

    public Profile getProfile() {
        return profile;
    }

    public void payBill(Invoice invoice){
        PaymentHandler paymentHandler = PaymentHandler.getPaymenthandler();
        paymentHandler.pay(invoice);
    }


}