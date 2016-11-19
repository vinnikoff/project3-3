/**
 * Created by VINNI on 18.11.16.
 */
public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent ( String firstName, String lastName, int group )
    {
        super(firstName, lastName, group);
    }

    public SpecialStudent ( String lastName, Course[] courseTaken )
    {
        super(lastName, courseTaken);
    }

    public SpecialStudent ( long secretKey )
    {
        this.secretKey=secretKey;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
