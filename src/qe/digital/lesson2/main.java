package qe.digital.lesson2;

import jxl.read.biff.BiffException;
import qe.digital.lesson2.animal.Animal;
import qe.digital.lesson2.animal.Cat;
import qe.digital.lesson2.animal.Chicken;
import qe.digital.lesson2.geometry.Circle;
import qe.digital.lesson2.payment.Account;
import qe.digital.lesson2.stocktrading.Investor;

import java.io.IOException;

public class main {
    public static void main(String args[]) throws IOException, BiffException {
//        Human connguoi1 = new Human("Vuong Ngoc Anh", 28);
//        connguoi1.showInfo();
//
//        Pupil pupil = new Pupil("Vuong Ngoc Anh", 28, "Vinh Tuy");
//        pupil.showPupilInfo();
//        pupil.showName();
//        pupil.showAge();
////
//        Human hocsinh1 = new Human();
//        Human hocsinh2 = new Human();
//        Human hocsinh3 = new Human();
//        hocsinh1.setAge(12);
//        hocsinh2.setAge(15);
//        hocsinh3.setAge(20);
//        hocsinh1.showAgePlus1(1);
//        hocsinh2.showAgePlus2(1, 2);
//        hocsinh3.showAgePlus3(1, 2, 3);

//        Animal animal = new Animal();
//        animal.showSounding();
//        animal.howToReproduce();
//        Cat cat = new Cat();
//        cat.showSounding();
//        cat.howToReproduce();
//        Chicken chicken = new Chicken();
//        chicken.showSounding();
//        chicken.howToReproduce();

//        Circle cir = new Circle();
//        cir.setColor("tim lim");
//        cir.setRadius(3);
//        System.out.println(cir.getArea());
//        System.out.println(cir.toString());

//        Investor investor = new Investor();
//        investor.getStockList();
//        investor.buyStock();
//        investor.setInitialBalance(1000000);
//        investor.getCeilPriceList();
//        investor.getFloorPriceList();
//        investor.sellStock();
//        investor.calculateProfit();

        Account A = new Account(1, "TCBS", 5000);
        Account B = new Account(2, "VA", 1000);
        A.chooseOptionWithAmount(B);

        A.tranferTo(B,200);
    }
}


