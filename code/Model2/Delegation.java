import java.util.*;

public class Delegation implements Skills {

    private boolean valid;

    private String name;

    public Delegation(boolean valid, String name) {
        this.valid = valid;
        this.name = name;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public string getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean validateCertificate() {
        // TODO implement here
        return false;
    }


}