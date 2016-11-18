/**
 * Created by VINNI on 18.11.16.
 */
import java.util.Date;
import java.text.SimpleDateFormat;

public class Solution {

    public static void main(String[] args)
    {
        Course course1 = new Course();
        Course course2 = new Course();
        Course course3 = new Course();
        Course[] courseTaken = {course1, course2, course3};

        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");

        Course object1 = new Course(d, "java");
        Course object2 = new Course(2, "java", "Максим");
        Course object3 = new Course();
        Course object4 = new Course();

        Student object6 = new Student ( "Слава", "Винников", 1 );
        Student object7 = new Student ( "Винников", courseTaken );

        CollegeStudent object8 = new CollegeStudent ( "Слава", "Винников", 1 );
        CollegeStudent object9 = new CollegeStudent ( "Винников", courseTaken );
        CollegeStudent object10 = new CollegeStudent ( "GoIt", 10, 100 );

        SpecialStudent object11 = new SpecialStudent ( "Слава", "Винников", 1 );
        SpecialStudent object12 = new SpecialStudent ( "Винников", courseTaken );
        SpecialStudent object13 = new SpecialStudent ( 11 );

    }
}
