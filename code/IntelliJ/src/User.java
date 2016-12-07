
import java.util.*;

public interface User {
    void addInvoice(Invoice invoice);

    Profile getProfile();

    List<Match> getCompletedJobs();


}