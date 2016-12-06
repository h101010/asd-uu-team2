
import java.util.*;

public class Match {

    private Requester requester;

    private Responder responder;
    private Feedback[] feedback = new Feedback[2];
    private Job job;

    public Match(Job job, Requester requester, Responder responder ) {
        this.job = job;
        this.requester = requester;
        this.responder = responder;
    }


    public void CreateFeedback(User user, int rating, String comment) {
        if (this.feedback[0] == null){
            this.feedback[0] = new Feedback(user.getProfile(),rating,comment);
        } else if (this.feedback[1] == null){
            this.feedback[1] = new Feedback(user.getProfile(),rating,comment);
        }

    }

    public Requester getRequester() {
        return requester;
    }

    public void setRequester(Requester requester) {
        this.requester = requester;
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