/**
 * Created by VINNI on 18.11.16.
 */
public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;

    public SpecialStudent ( String firstName, String lastName, int group )
    {
        super.firstName=firstName;
        super.lastName=lastName;
        super.group=group;
    }

    public SpecialStudent ( String lastName, Course[] courseTaken )
    {
        super.lastName=lastName;
        super.courseTaken=courseTaken;
    }

    public SpecialStudent ( long secretKey )
    {
        this.secretKey=secretKey;
    }

    private long getSecretKey() {
        return secretKey;
    }

    private String getEmail() {
        return email;
    }

    private void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    private void setEmail(String email) {
        this.email = email;
    }
}
