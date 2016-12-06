
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
        Job job = new Job(deadline, preferredTime, price, description);
        return job;
    }

    public void giveFeedback(Match match) {
        // TODO implement here
    }

    public void addMatch(Match match) {
        // TODO implement here
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
}