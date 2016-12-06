
import java.util.*;

/**
 * feedback for a job
 */
public class Feedback {

    private Date date;

    private int rating;

    private String comment;

    private Profile creator;


    public Feedback(Profile creator, int rating, String comment) {
        this.date = new Date();
        this.rating = rating;
        this.comment = comment;
        this.creator = creator;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Profile getCreator() {
        return creator;
    }

    public void setCreator(Profile creator) {
        this.creator = creator;
    }

}