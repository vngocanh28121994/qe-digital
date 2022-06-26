package qe.digital.lesson2.geometry;

public class Circle {
    private double radius;
    private String color;
    private final static double pi = 3.14;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * pi;
    }

    public String toString(){
        return "Ban kinh: "+radius+", mau sac: "+color;
    }
}
