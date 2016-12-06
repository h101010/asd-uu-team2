
import java.util.*;

/**
 * 
 */
public class Profile {

    private final PersonalDetails personalDetails;
    private final Address address;
    private final Certificates certificates;

    private Skills skills;
    private Feedback feedback;
    private SubscriptionModel subscriptionModel;
    /**
     * Default constructor
     */
    public Profile() {
    }


    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public Address getAddress() {
        return address;
    }

    public Certificates getCertificates() {
        return certificates;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public SubscriptionModel getSubscriptionModel() {
        return subscriptionModel;
    }

    public void setSubscriptionModel(SubscriptionModel subscriptionModel) {
        this.subscriptionModel = subscriptionModel;
    }
}