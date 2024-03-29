
import java.util.*;

public class Job {
    private final HardConstraints hardConstraints;
    private SoftConstraints softConstraints;
    private float price;


    private String description;

    public Job(date deadline,date preferredTime,float price, String description) {
        this.price = price;
        this.description = description;

        if (checkSkills(description)){
            this.hardConstraints = new HardConstraints();
            this.hardConstraints.setDeadline(deadline);
            this.hardConstraints.addSkills(description);
        }
        if (preferredTime != null){
            this.softConstraints = new SoftConstraints();
            this.softConstraints.setPreferredTime(preferredTime);
        }

    }




    public boolean checkSkills(String description) {
        // TODO implement here
        return false;
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }

    public HardConstraints getHardConstraints() {
        return hardConstraints;
    }

    public SoftConstraints getSoftConstraints() {
        return softConstraints;
    }

    public void setSoftConstraints(SoftConstraints softConstraints) {
        this.softConstraints = softConstraints;
    }
}