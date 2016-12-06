
import java.util.*;

public class Wage implements Invoice {

	private float amount;
	private Date date;
    private Responder responder;
	private List<Match> jobs;

    public Wage(float amount, Date date, Responder responder, List<Match> jobs) {
    	this.amount = amount;
    	this.date = date;
    	this.responder = responder;
    	this.jobs = jobs;
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
    
    public void setDate(Date date) {
    	this.date = date;
    }
    
    public Date getDate() {
    	return this.date;
    }
    
    public void setResponder(Responder responder) {
    	this.responder = responder;
    }
    
    public Responder getResponder() {
    	return this.responder;
    }
}