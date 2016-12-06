
import java.util.*;

/**
 * 
 */
public interface Invoice {

    /**
     * 
     */
    private float Amount;

    /**
     * 
     */
    private DateTime Date;

    /**
     * 
     */
    private User User;

    /**
     * 
     */
    private List<Match> Jobs;

    /**
     * @param Invoice 
     * @return
     */
    public void Pay(void Invoice);

}