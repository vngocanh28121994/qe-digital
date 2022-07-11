package qe.digital.lastlesson;

import jxl.read.biff.BiffException;

import java.io.IOException;

public class main {
    public static void main(String args[]) throws IOException, BiffException {
        Student student = new Student();
        System.out.println(student.getStudentList1());
        for(int i = 0; i < student.getStudentList1().size(); i++)
        {

        }
//        student.showInfo();
//        student.getRow();

    }
}
