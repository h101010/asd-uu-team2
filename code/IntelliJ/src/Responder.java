
import java.util.*;


public class Responder implements User {

    private List<Match> OngoingJobs;
    private List<Match> CompletedJobs;
    private List<Invoice> Invoices;
    private final Profile profile;
	
    public Responder() {
        profile = new Profile();
    }
    
    public Profile getProfile() {
        return profile;
    }

    public boolean answerJob(Job job) {
        // TODO implement here
        return false;
    }

    public void addMatch(Match match) {
        // TODO implement here
    }

    public void giveFeedback(Match match) {

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
}