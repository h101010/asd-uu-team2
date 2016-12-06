
import java.util.*;

/**
 * Bill - interafce implentation for Requester
 */
public class Bill implements Invoice {

    private float amount;

    private Date createdDate;

    private Requster requster;

    private List<Match> jobsList;

    private Date dueDate;

    public Bill(float amount, Date dueDate, Requster requster) {
        this.amount = amount;
        this.createdDate = new Date();
        this.requster = requster;
        this.jobsList = requster.getCompletedJobs();
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

    public Requster getRequster() {
        return requster;
    }

    public void setRequster(Requster requster) {
        this.requster = requster;
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
        return null;
    }

}