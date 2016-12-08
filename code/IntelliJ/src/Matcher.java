
/**
 * 
 */
public class Matcher{
    private static final Matcher matcher = new Matcher();
    private Learning learning = Learning.getInstance();
    private InvoiceCreator invoiceCreator = InvoiceCreator.getInstance();

    private Matcher() {
    }
    public static Matcher getInstance(){
        return matcher;
    }


    public Match matchJob(Job job, Requester requester) {
        boolean answer = false;
        Responder availableResponder = new Responder();
        while(!answer){
            availableResponder = learning.getResponder();
            answer = sendQuery(job, availableResponder);
        }
        return createMatch(job, requester, availableResponder);
    }

    private boolean sendQuery(Job job,Responder responder) {
        return responder.answerJob(job);
    }

    private Match createMatch(Job job, Requester requester, Responder responder) {
        // TODO implement here
        return null;
    }
    private void timeToInvoice(){
        //TODO timers
        invoiceCreator.invoiceTrigger();
    }

}