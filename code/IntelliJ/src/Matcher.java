
/**
 * 
 */
public class Matcher{
    private static final Matcher matcher = new Matcher();
    public Matcher() {
    }
    public static Matcher getInstance(){
        return matcher;
    }


    public Match MatchJob(Job job) {
        // TODO implement here
        return null;
    }

    private boolean sendQuery(Job job,Responder responder) {
        // TODO implement here
        return false;
    }

    private Match createMatch(Job job, Requester requester, Responder responder) {
        // TODO implement here
        return null;
    }


}