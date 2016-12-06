
import java.util.*;

/**
 * 
 */
public class Responder implements User {

    /**
     * Default constructor
     */
    public Responder() {
        profile = new Profile();
    }


    /**
     * 
     */
    private List<Match> OngoingJobs;

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

    /**
     * 
     */
    private List<Match> CompletedJobs;

    /**
     * 
     */
    private List<Invoice> Invoices;

    private final Profile profile;



    /**
     * @param Job 
     * @return
     */
    private boolean answerJob(Job job) {
        // TODO implement here
        return false;
    }

    /**
     * @param Match 
     * @return
     */
    public void addMatch(Match match) {
        // TODO implement here
    }

    /**
     * @param Match
     */
    public void giveFeedback(Match match) {

    }

    /**
     * @param Invoice 
     * @return
     */
    public void addInvoice(Invoice invoice) {
        // TODO implement here
    }

}