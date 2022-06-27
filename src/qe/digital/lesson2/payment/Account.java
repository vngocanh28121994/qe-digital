package qe.digital.lesson2.payment;

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
        this.amount = amount;

    }

    public void credit(int amount) {
        if (this.amount <= 0)
            System.out.println("So tien nap vao phai > 0");
        else {
            balance = balance + this.amount;
            System.out.println("So tien trong tai khoan sau khi nap: " + balance);
        }
    }

    public void debit(int amount) {
        if (amount > balance)
            System.out.println("So du khong du de thanh toan");
        else {
            balance = balance - amount;
            System.out.println("So tien trong tai khoan sau khi rut: " + balance);
        }
    }

    public void tranferTo(Account account, int amount) {
        if (this.balance < amount) {
            System.out.println("So du khong du de chuyen tien!");
        } else {
            this.balance = this.balance - amount;
            account.balance = account.balance + amount;
            System.out.println("Tai khoan cua " + this.name + " sau khi chuyen tien: " + this.balance);
            System.out.println("Tai khoan cua " + account.name + " sau khi nhan tien: " + account.balance);
        }
    }

    public void chooseOptionWithAmount(Account account) {


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
                case 1:
                    System.out.print("Nhap so tien muon chuyen: ");
                    amount = sc.nextInt();
                    tranferTo(account, amount);
                    break;

                case 2:
                    System.out.print("Nhap so tien muon nap: ");
                    amount = sc.nextInt();
                    credit(amount);
                    break;

                case 3:
                    System.out.print("Nhap so tien muon rut: ");
                    amount = sc.nextInt();
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
