package qe.digital.lastlesson;

import com.poiji.bind.Poiji;

import java.io.File;
import java.util.List;

public class DataExcel implements Comparable<DataExcel>{
    private String studentId;
    private String firstName;
    private String lastName;
    private String birthday;
    private String grade;
    private String rating;
    private String major;

    public DataExcel(String studentId, String firstName, String lastName, String birthday, String grade, String rating, String major) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.grade = grade;
        this.rating = rating;
        this.major = major;
    }

    @Override
    public int compareTo(DataExcel o) {
        return toString().compareTo(o.toString());
    }

    public String toString() {
        return ("(" + studentId + ", " + firstName + ", " + lastName + ", " + birthday + ", " +grade + " ," +
                rating + ", " +major + ", " +")");
    }



}
