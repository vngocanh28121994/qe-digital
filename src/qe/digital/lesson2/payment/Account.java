package qe.digital.lesson2.payment;

import com.sun.javafx.webkit.theme.ScrollBarThemeImpl;

import java.util.Scanner;

public class Account {
    private int id;
    private String name;
    private int balance;
    static Scanner sc = new Scanner(System.in);
    private int amount;
    private int option;
    private Account account;
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int credit(int amount){
        if(amount <= 0)
            System.out.println("So tien nap vao phai > 0");
        else balance = balance + amount;
            return balance;
    }

    public int debit(int amount){
        if(amount > balance)
            System.out.println("So du khong du de thanh toan");
        else balance = balance - amount;
        return balance;
    }

    public void tranferTo(Account account, int amount){
        if(amount > balance){
            System.out.println("Khong du so du de chuyen tien!");
        }
        else debit(amount);
    }

    public void chooseOptionWithAmount(int amount){


        do {
            System.out.println("----------------");
            System.out.println("1. Chuyen tien");
            System.out.println("2. Nop tien");
            System.out.println("3. Rut tien");
            System.out.println("4. Exit");
            System.out.println("----------------");
            System.out.print("Chon chuc nang ban muon su dung: ");
            option = sc.nextInt();
            switch (option) {
//                case 1:
//                    tranferTo(name, amount);
//                    break;

                case 2:
                    credit(amount);
                    break;

                case 3:
                    debit(amount);
                    break;

                case 4:
                    System.out.println("Chuong trinh ket thuc!");
                    break;

                default:
                    System.out.println("Xin moi nhap dung lua chon!");
            }
        }
            while (option != 4);

    }
}
