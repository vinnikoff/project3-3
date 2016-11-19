/**
 * Created by VINNI on 18.11.16.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private Course[] courseTaken;
    private int age;


    public Student(){}

    public Student ( String firstName, String lastName, int group )
    {
      this.firstName=firstName;
        this.lastName=lastName;
        this.group=group;
    }

    public Student ( String lastName, Course[] courseTaken )
    {
        this.lastName=lastName;
        this.courseTaken=courseTaken;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public Course[] getCourseTaken() {
        return courseTaken;
    }

    public Course[] getCourseTaken2() {
        this.courseTaken=courseTaken;
        return courseTaken;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCourseTaken(Course[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

