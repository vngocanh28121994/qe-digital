package qe.digital.lesson1;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Buoi_3 {
    static Scanner sc = new Scanner(System.in);
    static String[] fullName = {"Cù Huy Thắng", "Lê Phương Thảo", "Phùng Khắc Toàn", "Lê Đình Sơn", "Trần Tuấn Anh", "Lý Đình Dũng", "Vương Ngọc Anh", "Nguyễn Thị Mai", "Nguyễn Thị Luyến", "Nhâm Thị Trang", "Phạm Thị Khánh Linh", "Võ Tá Bảo", "Nguyễn Bá Thành", "Nguyễn Hoàng Hiển", "Đào Huy Hoàng", "Lê Ngọc Trình", "Lê Huỳnh Đức", "Trần Phú Quốc", "Nguyễn Thị Thêu", "Lê Đình Dũng", "Nguyễn Thị Kim Oanh", "Trương Thị Lý", "Nguyễn Thế Hải", "Đỗ Công Tuấn Anh", "Lê Hoàng Phan", "Phạm Văn Tuyên", "Trần Trung Phong"};

    public static void main(String args[]) {
        Bai1();
//        Bai2();
//        Bai3();
//            Bai4();
//        Ham_Random_String();
    }

    private static void Bai1() {
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu co index = " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Cac gia tri cua mang vua nhap la: ");
        for (int number : arr) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.print("Cac gia tri dao nguoc cua mang vua nhap la: ");
        //Duyệt ngược lại khi đặt i là phần tử cuối cùng của mảng, chạy vòng lặp cho index giảm dần về 0 để đảo ngược
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("Cac gia tri la so chan cua mang vua nhap la: ");
        for (int number : arr) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }

        System.out.println();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri lon nhat cua mang = " + max);
        System.out.println("Gia tri nho nhat cua mang = " + min);

        int secondLargestNumber = min;
        for (int i = 0; i < n; i++) {
            //Loại giá trị max ra khỏi danh sách xét điều kiện, số nào còn lại lớn nhất thì là lớn thứ 2 mảng
            if (secondLargestNumber != max && arr[i] != max) {
                secondLargestNumber = secondLargestNumber > arr[i] ? secondLargestNumber : arr[i];
            }
        }
        System.out.println("Gia tri lon thu 2 trong mang = " + secondLargestNumber);
    }

    public static void Bai2() {
        Arrays.sort(fullName);
        System.out.println("Danh sach thanh vien team Digital:");
        for (String name : fullName) {
            System.out.println(name);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Day la ten cua nhung nguoi co do dai 4 chu cai:");
        for (String name : fullName) {
            //Replace tất cả những kí tự không phải khoảng trắng thành null
            String nameAfterReplaced = name.replaceAll("[^ ]", "");
            //Những chuỗi có 3 khoảng trắng sẽ là chuỗi có 4 chữ cái
            if (nameAfterReplaced.length() == 3) {
                System.out.println(name);
            }
        }
    }

    public static void Bai3() {
        List<Integer> list = new ArrayList<Integer>();
        System.out.print("Nhap so phan tu cua List: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu so " + i + ": ");
            list.add(sc.nextInt());
        }
        System.out.print("Gia tri cua List vua nhap: ");
        for (int number : list) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.print("Cac gia tri dao nguoc cua List vua nhap la: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.print("Cac gia tri la so chan cua List vua nhap la: ");
        for (int number : list) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }

        System.out.println();
        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < n; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }

            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Gia tri lon nhat cua mang = " + max);
        System.out.println("Gia tri nho nhat cua mang = " + min);

        int secondLargestNumber = list.get(0);
        for (int i = 0; i < n; i++) {
            if (secondLargestNumber != max) {
                secondLargestNumber = secondLargestNumber > list.get(i) ? secondLargestNumber : list.get(i);
            }
        }
        System.out.println("Gia tri lon thu 2 trong mang = " + secondLargestNumber);
    }

    public static void Bai4() {
        ArrayList<String> listName = new ArrayList<String>(Arrays.asList(fullName));
        Collections.sort(listName);
        System.out.println("Danh sach thanh vien team Digital:");
        for (String name : listName) {
            System.out.println(name);
        }

        System.out.println("Danh sach thanh vien team Digital sau khi da thay doi:");
        for (String name : listName) {
            String nameAfter = Ham_Random_String() + " " + name;
            System.out.println("Ban dang sua ten cho " + name + ": ");
            System.out.println("Ten sau khi sua: " + nameAfter);
        }
    }

    public static String Ham_Random_String() {
        //Khai báo chuỗi gồm các kí tự in hoa và thường thuộc bảng chữ cái
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString = "";
        System.out.println("Nhap so ki tu random ban muon: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            //Công thức để lấy số random trong khoảng từ min --> max, min ở đây là 0, max là độ dài của chuỗi alphabet
            double randomNumber = Math.random() * (alphabet.length() - 0) + 1;
            //Parse sang kiểu int để lấy số nguyên, dùng để truyền vào làm index random
            int randomIndex = (int) (randomNumber);
            char randomChar = alphabet.charAt(randomIndex);
            //Chạy vòng lặp n lần, mỗi lần lấy 1 kí tự random từ chuỗi alphabet và nối lại với nhau
            randomString = randomString + randomChar;
        }
        return randomString;

    }
}
