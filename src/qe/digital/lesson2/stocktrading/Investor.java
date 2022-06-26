package qe.digital.lesson2.stocktrading;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Investor extends StockCode {
    static Scanner sc = new Scanner(System.in);
    private double initialBalance;
    private double currentBalance;
    double sellingMatchPrice;
    double buyMatchedPrice;
    private final static String FILE_URL = "src/resource/stockList.xls";
    private List<String> stockLists = new ArrayList<String>();
    private List<String> ceilPriceList = new ArrayList<String>();
    private List<String> floorPriceList = new ArrayList<String>();
    private List<String> buyMatchedPriceList = new ArrayList<String>();
    private List<String> sellingMatchPriceList = new ArrayList<String>();
    public static final int column_index_stock_code = 0;
    public static final int column_index_ceil_price = 1;
    public static final int column_index_floor_price = 2;

    public Investor() {
        super();

    }

    public Investor(double ceilPrice, double floorPrice) {
        super(ceilPrice, floorPrice);
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void buyStock() {
        StringBuilder stockList = new StringBuilder();
        for (int i = 0; i < stockLists.size(); i++) {
            if (i != stockLists.size() - 1) {
                stockList.append(stockLists.get(i)).append(", ");
            } else stockList.append(stockLists.get(i));
            System.out.println("Nhap gia mua " + stockLists.get(i) + ": ");
            buyMatchedPrice = sc.nextDouble();
            System.out.println("Gia khop ma: " + stockLists.get(i) + " la " + buyMatchedPrice);
            buyMatchedPriceList.add(String.valueOf(buyMatchedPrice));
        }
        System.out.println("Dang thuc hien mua cac ma CP: " + stockList + "...");
        System.out.println("Mua thanh cong!");
    }

    public void sellStock() {
        System.out.println("Thuc hien ban co phieu...");
        for (int i = 0; i < stockLists.size(); i++) {
            System.out.println("Ma CP: " + stockLists.get(i));
            System.out.println("Gia tran: " + ceilPriceList.get(i));
            System.out.println("Gia san: " + floorPriceList.get(i));
            sellingMatchPrice = super.changeMatchingPrice(Double.parseDouble(ceilPriceList.get(i)), Double.parseDouble(floorPriceList.get(i)));
            System.out.println("Gia khop ban: " + sellingMatchPrice);
            sellingMatchPriceList.add(String.valueOf(sellingMatchPrice));
        }
    }

    public void calculateProfit() {
        for(int i = 0; i < stockLists.size(); i++){
            double percentProfit = ((Double.parseDouble(sellingMatchPriceList.get(i)) - Double.parseDouble(buyMatchedPriceList.get(i))) / Double.parseDouble(buyMatchedPriceList.get(i)) * 100);
            double currentBalanceEachStock = Math.round((initialBalance/3) + (initialBalance/3) * percentProfit / 100);
            System.out.println("Dau tu CP "+stockLists.get(i)+" voi so tien "+Math.round(initialBalance/3)+ " dong thu ve duoc: "+currentBalanceEachStock);
            if(percentProfit >= 0) {
                System.out.println("Lai: " + Math.round(percentProfit) + "%");
            }
            else System.out.println("Lo: "+Math.round(percentProfit) + "%");
            currentBalance += currentBalanceEachStock;
        }

        System.out.println("Tong so tien co duoc sau khi dau tu: "+stockLists.size()+" ma CP la: "+currentBalance);
        System.out.println("Tong lai/ lo: "+(currentBalance - initialBalance));
    }

    public double calculateCurrentBalance() {
        return currentBalance;
    }

    public void getStockList() throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook((new File(FILE_URL)));
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        int cols = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Cell cell = sheet.getCell(column_index_stock_code, row);
                // System.out.print(cell.getContents() + "\t");
                stockLists.add(cell.getContents());
            }
        }
//        System.out.println(stockLists);
        workbook.close();
    }

    public void getCeilPriceList() throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook((new File(FILE_URL)));
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        int cols = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Cell cell = sheet.getCell(column_index_ceil_price, row);
                // System.out.print(cell.getContents() + "\t");
                ceilPriceList.add(cell.getContents());
            }
        }
//        System.out.println(ceilPriceList);
        workbook.close();
    }

    public void getFloorPriceList() throws IOException, BiffException {
        Workbook workbook = Workbook.getWorkbook((new File(FILE_URL)));
        Sheet sheet = workbook.getSheet(0);
        int rows = sheet.getRows();
        int cols = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Cell cell = sheet.getCell(column_index_floor_price, row);
                // System.out.print(cell.getContents() + "\t");
                floorPriceList.add(cell.getContents());
            }
        }
//        System.out.println(floorPriceList);
        workbook.close();
    }
}
