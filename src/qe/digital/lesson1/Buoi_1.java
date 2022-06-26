package qe.digital.lesson1;

import java.util.Scanner;

public class Buoi_1 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
//        Bai2();
//        Bai3();
//        Bai4();
//        Bai5();
//        Bai6();
//        Bai7();
//        Bai8();
          BaiBonus();
    }

    public static void Bai2() {
        System.out.println("Nhap lan luot gia tri a, b va c de tim so lon nhat: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //Nếu a lớn hơn cả b và c thì a là số lớn nhất
        if (a >= b && a >= c)
            System.out.println(+a + " la so lon nhat");
            //Tương tự nếu b lớn hơn cả a và c thì b là số lớn nhất
        else if (b >= a && b >= c)
            System.out.println(+b + " la so lon nhat");
            //Nếu 2 trường hợp trên đều không đúng thì số còn lại là số lớn nhất
        else
            System.out.println(+c + " la so lon nhat");
    }

    public static void Bai3() {
        System.out.print("Nhap gia tri i = ");
        int i = sc.nextInt();
        //Số chia hết cho 2 là số chẵn ngược lại là số lẻ
        if (i % 2 == 0)
            System.out.println(+i + " la so chan");
        else
            System.out.println((+i + " la so le"));
    }

    public static void Bai4() {
        System.out.print("Nhap gia tri i = ");
        int i = sc.nextInt();
        if (i > 0)
            System.out.println(+i + " la so duong");
        else if (i == 0)
            System.out.println("i = 0");
        else
            System.out.println((+i + " la so am"));
    }

    public static void Bai5() {
        System.out.print("Nhap gia tri nam muon kiem tra: ");
        int year = sc.nextInt();
        //năm chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100 thì là năm nhuận
        if ((year % 400 == 0 && year > 0) || (year % 4 == 0 && year % 100 != 0 && year > 0))
            System.out.println(+year + " la nam nhuan");
        else
            System.out.println((+year + " khong phai la nam nhuan"));
    }

    public static void Bai6() {
        System.out.println("Nhap a va b de hoan doi vi tri: ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        //Gán giá trị a vào 1 biến trung gian
        int c = a;
        //Gán giá trị của a = b
        a = b;
        //Gán giá trị của b = a (thông qua giá trị của biến trung gian c đã được gán = a từ đầu)
        b = c;

        System.out.println("Sau khi hoan doi thi a = " + a + " va b = " + b);
    }

    public static void Bai7() {
        System.out.println("Nhap a va b de hoan doi vi tri: ");
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        a = a - b;
        //gán b = (a-b)+a là = a
        b = a + b;
        //gán a = (a+b)-a là = b
        a = b - a;
        System.out.println("Sau khi hoan doi thi a = " + a + " va b = " + b);
    }

    public static void Bai8() {
        System.out.println("Nhap 3 tham só a b c cua phuong trinh bac 2: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float delta = b * b - 4 * a * c;
        //Chia làm 2 trường hợp là a = 0 và a != 0 và tính toán như bình thường
        if (a == 0)
            System.out.println("Phuong trinh co 1 nghiem = " + (-c / b));
        else {
            if (delta < 0)
                System.out.println("Phuong trinh vo nghiem!");
            else if (delta == 0)
                System.out.println("Phuong trinh co nghiem kep = " + (-b / (2 * a)));
            else
                System.out.println("Phuong trinh co 2 nghiem phan biet la: " + (-b + Math.sqrt(delta)) / (2 * a) + " va " + (-b - Math.sqrt(delta)) / (2 * a));
        }
    }

    public static void BaiBonus(){
        System.out.println("Nhap so tien muon tinh toan (don vi nghin dong): ");
        long money = sc.nextLong();
        int count = 0;
        if(money < 50)
            System.out.println("So tien khong du");
        else
        for (int amount500 = 0; amount500 <= money/500; amount500++)

            for (int amount200 = 0; amount200 <= money/200; amount200++)

                for (int amount100 = 0; amount100 <= money/100; amount100++)

                    for (int amount50 = 0; amount50 <= money/50; amount50++)
                    {
                        if(500 * amount500 + 200 * amount200 + amount100 * 100 + 50 * amount50 == money) {
                            //System.out.println("Vay can co " + amount500 + " to 500 + " + amount200 + " to 200 + " + amount100 + " to 100 + " + amount50 + " to 50 de tra so tien " + money + "k");
                            count++;
                        }
                    }
        System.out.println("==> Chia duoc "+count+" cach");
    }
}
