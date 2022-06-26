package qe.digital.lesson2.stocktrading;

public class StockCode {
    private double ceilPrice;
    private double floorPrice;
    private double matchingPrice;

    public StockCode() {

    }

    public double getCeilPrice() {
        return ceilPrice;
    }

    public StockCode(double ceilPrice, double floorPrice) {
        this.ceilPrice = ceilPrice;
        this.floorPrice = floorPrice;
    }

    public void setCeilPrice(double ceilPrice) {
        this.ceilPrice = ceilPrice;
    }

    public double getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(double floorPrice) {
        this.floorPrice = floorPrice;
    }

    public double getMatchingPrice() {
        return matchingPrice;
    }

    public void setMatchingPrice(double matchingPrice) {
        this.matchingPrice = matchingPrice;
    }

    public double changeMatchingPrice(double ceilPrice, double floorPrice) {
        return Math.round((Math.random() * (ceilPrice - floorPrice) + floorPrice)*10.0)/10.0;
    }
}
