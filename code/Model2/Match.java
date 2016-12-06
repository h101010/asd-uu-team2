
import java.util.*;

public class Match {

    private Requester requster;

    private Responder responder;
    private Feedback[] feedback = new Feedback[2];
    private Job job;

    public Match(Job job, Requseter requseter, Responder responder ) {
        this.job = job;
        this.requster = requseter;
        this.responder = responder;
    }


    public void CreateFeedback(User user, int rating, string comment) {
        if (this.feedback[0] == null){
            this.feedback[0] = new Feedback(user,rating,comment);
        } else if (this.feedback[1] == null){
            this.feedback[1] = new Feedback(user,rating,comment);
        }

    }

    public Requester getRequster() {
        return requster;
    }

    public void setRequster(Requester requster) {
        this.requster = requster;
    }

    public Responder getResponder() {
        return responder;
    }

    public void setResponder(Responder responder) {
        this.responder = responder;
    }

    public Feedback[] getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback[] feedback) {
        this.feedback = feedback;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}