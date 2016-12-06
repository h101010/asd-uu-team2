
import java.util.*;

/**
 * Bill - interafce implentation for Requester
 */
public class Bill implements Invoice {

    private float amount;

    private Date date;

    private Requster requster;

    private List<Match> jobsList;

    public Bill(float amount, Requster requster, List<Match> jobsList) {
        this.amount = amount;
        this.date = new Date();
        this.requster = requster;
        this.jobsList = jobsList;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public void pay() {
        // TODO implement here
        return null;
    }

}