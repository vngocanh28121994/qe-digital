package qe.digital.test;


import java.util.Scanner;

public class BT9 {
    public static void main(String[] args) {
        System.out.print("Số tiền cần trả là:" + payment());
    }
    public static int payment()
    {
        int payment=0;
        System.out.print("Nhập số tiền muốn vay: ");
        Scanner scanner = new Scanner(System.in);
        int amount= scanner.nextInt();

        for (int i=amount; i>0;i=i-10000000)
        {
            payment= payment+ (int) (i*0.005+10000000);

        }
        return payment  ;
    }
    }

