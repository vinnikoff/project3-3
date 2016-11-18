/**
 * Created by VINNI on 18.11.16.
 */
import java.util.*;
import java.util.Date;

public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;

    public Course (){}

    public Course ( Date startDate, String name )
    {
        this.startDate=startDate;
        this.name=name;
        System.out.println(startDate);
        System.out.println(name);
    }

    public Course ( int hoursDuration , String name, String teacherName )
    {
        this.hoursDuration=hoursDuration;
        this.name=name;
        this.teacherName=teacherName;
    }

    private Date getStartDate() {
        return startDate;
    }

    private String getName() {
        return name;
    }

    private int getHoursDuration() {
        return hoursDuration;
    }

    private String getTeacherName() {
        return teacherName;
    }

    private void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    private void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


}
