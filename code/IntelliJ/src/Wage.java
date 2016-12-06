
import java.util.*;

public class Wage implements Invoice {

	private float amount;
	private Date dueDate, createdDate;
    private Responder responder;
	private List<Match> jobsList;

    public Wage(float amount, Date dueDate, Responder responder) {
        this.amount = amount;
        this.dueDate = dueDate;
        this.createdDate = new Date();
        this.responder = responder;
        this.jobsList = responder.getCompletedJobs();
    }

    public void pay() {
    	//Do payment stuff
    }
    
    public void setAmount(float amount) {
    	this.amount = amount;
    }
    
    public float getAmount() {
    	return this.amount;
    }
    
    public void setDueDate(Date dueDate) {
    	this.dueDate = dueDate;
    }
    
    public Date getDueDate() {
    	return this.dueDate;
    }
    
    public void setCreatedDate(Date createdDate) {
    	this.createdDate = createdDate;
    }
    
    public Date getCreatedDate() {
    	return this.createdDate;
    }
    
    public void setResponder(Responder responder) {
    	this.responder = responder;
    }
    
    public Responder getResponder() {
    	return this.responder;
    }
}