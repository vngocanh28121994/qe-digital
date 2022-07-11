package qe.digital.lastlesson;

import com.poiji.bind.Poiji;

import java.io.File;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExcelDataToJavaListTest {
    public static void main(String[] args) {

        File file = new File("C:/Users/anhvn8/IdeaProjects/Training With Digital/src/resource/ListStudents.xls");
        List<ListColumnExcel> dataTable = Poiji.fromExcel(file, ListColumnExcel.class);
        System.out.println(ListColumnExcel.sortList());

    }
}
