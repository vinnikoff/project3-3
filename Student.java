/**
 * Created by VINNI on 18.11.16.
 */
public class Student {

    String firstName;
    String lastName;
    int group;
    Course[] courseTaken;
    int age;


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

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private int getGroup() {
        return group;
    }

    private Course[] getCourseTaken() {
        return courseTaken;
    }

    public Course[] getCourseTaken2() {
        this.courseTaken=courseTaken;
        return courseTaken;
    }

    private int getAge() {
        return age;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setGroup(int group) {
        this.group = group;
    }

    private void setCourseTaken(Course[] courseTaken) {
        this.courseTaken = courseTaken;
    }

    private void setAge(int age) {
        this.age = age;
    }
}

