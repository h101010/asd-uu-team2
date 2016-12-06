
import java.util.*;

/**
 * Bill - interafce implentation for Requester
 */
public class Bill implements Invoice {

    private float amount;

    private Date createdDate;

    private Requester requester;

    private List<Match> jobsList;

    private Date dueDate;

    public Bill(float amount, Date dueDate, Requester requester) {
        this.amount = amount;
        this.createdDate = new Date();
        this.requester = requester;
        this.jobsList = requester.getCompletedJobs();
        this.dueDate = dueDate;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    public List<Match> getJobsList() {
        return jobsList;
    }

    public void setJobsList(List<Match> jobsList) {
        this.jobsList = jobsList;
    }
    
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void pay() {
        // TODO implement here
    }

}