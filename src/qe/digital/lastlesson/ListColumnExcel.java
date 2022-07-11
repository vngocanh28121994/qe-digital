package qe.digital.lastlesson;

import com.poiji.annotation.ExcelCellName;
import com.poiji.annotation.ExcelRow;
import com.poiji.bind.Poiji;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListColumnExcel {
    static List<String> rA_column = new ArrayList<String> ();
    static List<String> rB_column = new ArrayList<String> ();
    static List<String> rC_column = new ArrayList<String> ();
    @ExcelRow
    private int rowIndex;

    @ExcelCellName("Mã")
    private String studentId;

    @ExcelCellName("Họ")
    private String firstName;

    @ExcelCellName("Tên")
    private String lastName;

    @ExcelCellName("Sinh nhật")
    private String birthday;

    @ExcelCellName("Khóa")
    private String grade;

    @ExcelCellName("Xếp loại")
    private String rating;

    @ExcelCellName("Khoa")
    private String major;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return studentId + ", " + firstName + ", " + lastName
                + ", " + birthday + ", " + grade + ", " + rating + ", " + major + "\n" + "";
    }

    public static Object[] sortList(){
        File file = new File("C:/Users/anhvn8/IdeaProjects/Training With Digital/src/resource/ListStudents.xls");
        List<ListColumnExcel> dataTable = Poiji.fromExcel(file, ListColumnExcel.class);
        return dataTable.toArray();
    }

}
