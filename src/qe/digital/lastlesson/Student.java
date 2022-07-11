package qe.digital.lastlesson;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.*;

public class Student extends Human {
    private int studentId;
    private int grade;
    private String major;
    private String rating;
    private static String urlFile = "src/resource/ListStudents.xls";
    private List<String> listStudent = new ArrayList<String>();
    private List<String> getListStudentAfterSort = new ArrayList<String>();
    public Student() {
        super();
    }

    public Student(String firstName, String lastName, String sex, String birthday, int studentId, int grade, String major, String rating) {
        super(firstName, lastName, sex, birthday);
        this.studentId = studentId;
        this.grade = grade;
        this.major = major;
        this.rating = rating;
    }

    public void editStudentInfo() {

    }

    public void getStudentList() throws IOException, BiffException {
        WorkbookSettings ws = new WorkbookSettings();
        ws.setEncoding("Cp1252");
        Workbook workbook = Workbook.getWorkbook(new File(urlFile), ws);
        Sheet sheet = workbook.getSheet(0);
        int totalNoOfRows = sheet.getRows();
        int totalNoOfCols = sheet.getColumns();
        Object[][] dataTable = new String[totalNoOfRows][];
//        String[][] SheetArray = new String[cols][rows];
        // change the first number to the number of columns you want,
        // or pick up the number same as you did with rows
        Cell cell;
        // GETS DATA FROM SHEET AND RUNS THROUGH WHOLE LOOP BELOW FOR EACH REFERENCE
        for (int col = 0; col < totalNoOfCols; col++) {
            for (int row = 0; row < totalNoOfRows; row++) // cycles through rows and loads into 2d array
            { // start 6
//                cell = sheet.getCell(col, row); //<- your column number here
//                String cellcont = cell.getContents();
//                SheetArray[i][j] = cellcont;
                System.out.println(sheet.getCell(col, row).getContents() + "\t");
            }
            System.out.println();
        }
    }

    public List<String> getStudentList1() throws IOException, BiffException {
        WorkbookSettings ws = new WorkbookSettings();
        ws.setEncoding("Cp1252");
        Workbook workbook = Workbook.getWorkbook(new File(urlFile), ws);
        Sheet sheet = workbook.getSheet(0);
        int totalNoOfRows = sheet.getRows();
        int totalNoOfCols = sheet.getColumns();
        Object[][] dataTable = new String[totalNoOfRows][];
//        String[][] SheetArray = new String[cols][rows];
        // change the first number to the number of columns you want,
        // or pick up the number same as you did with rows
        Cell cell;
        // GETS DATA FROM SHEET AND RUNS THROUGH WHOLE LOOP BELOW FOR EACH REFERENCE
        String infoStudent = "";
        int row = 1;
        int col = 0;
        Integer index = 0;
        for (row = 1; row < totalNoOfRows; row++) {
            for (col = 0; col < totalNoOfCols; col++)// cycles through rows and loads into 2d array
            { //
                infoStudent = sheet.getCell(col, row).getContents();
                listStudent.add(infoStudent);
            }
            listStudent.add(index.toString());
            index++;
        }
        return listStudent;

    }

    public void showInfo() {
        System.out.println(listStudent);
    }

    public void getRow() throws IOException, BiffException {
        WorkbookSettings ws = new WorkbookSettings();
        ws.setEncoding("Cp1252");
        Workbook workbook = Workbook.getWorkbook(new File(urlFile), ws);
        Sheet sheet = workbook.getSheet(0);
        int columns = sheet.getColumns();
        int rows = sheet.getRows();
        String a[][] = new String[rows][columns];
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                a[row][col] = sheet.getCell(col, row).getContents();
            }
        }
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(a[row][col]+ " ");
            }
            System.out.println();
        }

    }



}
