package qe.digital.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Buoi_4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
//        Bai1();
        Bai2();
    }

    public static void Bai1() {
        String s1 = sc.next();
        String s2 = sc.next();
        String concatenatedString = s1.concat(s2);
        System.out.println("Chuoi sau khi noi: " + concatenatedString);
        //Replace các kí tự là số thành null bằng regex
        String concatenatedStringAfterFilter = concatenatedString.replaceAll("[\\d]", "");
        System.out.println("Chuoi sau khi loai bo ki tu so: " + concatenatedStringAfterFilter);

        String s1Reverse = "";
        //Tương tự với mảng, duyệt ngược lại để đảo ngược xâu
        for (int i = s1.length() - 1; i >= 0; i--) {
            s1Reverse = s1Reverse + s1.charAt(i);
        }

        if (s1Reverse.equals(s2)) {
            System.out.println("Hai chuoi la dao nguoc cua nhau");
        } else
            System.out.println("Hai chuoi khong phai dao nguoc cua nhau");
    }

    public static void Bai2() {
        String s = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.";
        //convert về lowercase để so sánh
        String s1 = s.toLowerCase();
        ArrayList<Character> list = new ArrayList<Character>();
        //Đẩy tất cả kí tự trong chuỗi vào 1 List
        for (int i = 0; i < s1.length(); i++) {
            char currentCharacter = s1.charAt(i);
            list.add(currentCharacter);
        }
        //Mỗi kí tự sau khi duyệt lần lượt so sánh nếu là nguyên âm, biến count +1
        int count = 0;
        for (Character a : list) {
            if (a.equals('u') || a.equals('e') || a.equals('o') || a.equals('a') || a.equals('i')) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cac nguyen am la: " + count);

        ArrayList<Character> list2 = new ArrayList<Character>();
        for (int i = 0; i < list.size(); i++) {
            //Tạo 1 list tạm, duyệt từng phần tử và đẩy vào list tạm
            //Xét nếu các phần tử sau đã tồn tại trong list thì không add vào nữa, ngoại trừ khoảng trắng
            if ((!list2.contains(list.get(i))) || (list.get(i).equals(' '))) {
                list2.add(list.get(i));
            }
        }
        String stringAfterRemoveDuplicate = "";
        //Join các phần từ trong List đã remove duplicate lại để convert thành chuỗi
        for (Character a : list2) {
            stringAfterRemoveDuplicate = stringAfterRemoveDuplicate + a;
        }
        System.out.println("Chuoi sau khi loai bo tat ca cac ki tu trung lap: " + stringAfterRemoveDuplicate);
    }

}
