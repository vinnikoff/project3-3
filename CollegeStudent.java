/**
 * Created by VINNI on 18.11.16.
 */
public class CollegeStudent extends Student {

    String collegeName;
    int rating;
    long id;

    public CollegeStudent(){}

    public CollegeStudent ( String firstName, String lastName, int group )
    {
        super(firstName, lastName, group);
    }

    public CollegeStudent ( String lastName, Course[] courseTaken )
    {
        super (lastName, courseTaken);

    }

    public CollegeStudent ( String collegeName, int rating, long id )
    {
        this.collegeName=collegeName;
        this.rating=rating;
        this.id=id;
    }

    private String getCollegeName() {
        return collegeName;
    }

    private int getRating() {
        return rating;
    }

    private long getId() {
        return id;
    }

    private void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    private void setRating(int rating) {
        this.rating = rating;
    }

    private void setId(long id) {
        this.id = id;
    }
}
