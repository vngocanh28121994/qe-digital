package qe.digital.lesson1;

import java.util.Scanner;

public class Buoi_2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
//        Bai1();
//        Bai2();
//        Bai3();
//        Bai4();
//        Bai5();
        BaiBonus1();
//        BaiBonus2();
    }

    public static void Bai1()
    {
        System.out.println("Chon '1' neu muon in so chan, chon '2' neu muon in so le");
        System.out.println("Nhap lua chon: ");
        int option = sc.nextInt();
        switch (option)
        {
            case 1:
                System.out.print("Nhap so: ");
                int number1 = sc.nextInt();
                for(int i = 0; i <= number1; i++)
                {
                    if(i%2 == 0)
                    {
                        if(i == 0)
                            System.out.print(i);
                        else System.out.print(", "+i);
                    }
                }
                break;

            case 2:
                System.out.print("Nhap so: ");
                int number2 = sc.nextInt();
                for(int i = 0; i <= number2; i++)
                {
                    if(i%2 != 0)
                    {
                        if(i <= 1)
                            System.out.print(i);
                        else System.out.print(", "+i);
                    }
                }
                break;
        }

    }

    public static void Bai2(){
        System.out.println("Nhap 2 so a va b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a <= b) {
            for (int i = a; i <= b; i++)
                System.out.println(i);
        }else
            for (int i = b; i <= a; i++)
            System.out.println(i);
    }

    public static void Bai3(){
        int i = 3;
        System.out.println("Nhap so: ");
        int a = sc.nextInt();
        if(a <= 0 || a >= 100)
            System.out.println("So khong hop le");
        else while(i <= a)
        {
            if(i%3 == 0 && i%5 != 0)
                System.out.print(+i+ " ");
                i=i+3;
        }
    }

    public static void Bai4(){
        int a;
        do{
            System.out.print("Nhap so: ");
            a = sc.nextInt();
        } while(a != 0);
            System.out.println("Chuong trinh ket thuc");
    }

    public static void Bai5(){
        int sum = 0;
        long giaithua = 1;
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        if(n < 0)
            System.out.println("Invalid number");
        else{
            //Tinh tong
            for (int i = 0; i <= n; i++)
            {
                sum += i;
            }
            System.out.println("Tong tu 0 -> n = "+sum);
            //Tinh giai thua
            for(int j = 1; j <= n; j++)
            {
                giaithua *= j;
            }
            System.out.println("Giai thua cua n = "+giaithua);
        }
    }

    public static void BaiBonus1(){
        int initialAmount = 600;
        double rate = 0.005; //
        double purchaseAmount = 0;
        double monthlyProfit;
        System.out.print("Nhap so nam muon tra gop: ");
        int year = sc.nextInt();
        int period = 12 * year;
        for(int i = 1; i <= period ; i++)
        {
            monthlyProfit = initialAmount * rate; //Tinh so lai phai tra voi so tien goc ban dau
            initialAmount = initialAmount - 10; //Moi vong lap tuong ung voi moi thang, so tien goc se giam di 10tr
            purchaseAmount += monthlyProfit + 10; //Cong don so tien lai va 10tr goc qua moi vong lap
        }
        System.out.println("Tong so tien phai tra la: "+purchaseAmount+"tr");
    }

    public static void BaiBonus2(){
            System.out.print("Nhap so: ");
            int n = sc.nextInt();
            int a = 1, b = 1, c = 2;
            if(n == 1 || n == 2){
                System.out.format("Phan tu thu %d trong day Fibonacci la: %d", n, n);
            }
            else{
                for(int i = 2; i < n ; i++)
                {
                    c = a + b;
                    a = b;
                    b = c;
//                  System.out.print( " "+c);
                }
                System.out.printf("Phan tu thu %d trong day Fibonacci la: %d", n, c);
            }
    }

}
