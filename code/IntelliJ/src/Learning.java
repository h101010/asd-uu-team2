
/**
 * 
 */
public class Learning{

    private Responder responder;
    private Matcher matcher = Matcher.getInstance();

    private static final Learning learning = new Learning();
    /**
     * Default constructor
     */
    private Learning() {
    }
    public static Learning getInstance() {
        return learning;
    }


    public Responder getResponder() {
        return responder;
    }
}