package qe.digital.lesson2.animal;

public class Animal {
    private int weight;
    private String originPlace;
    private String sound;


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }


    public void showSounding(){
        System.out.println("Keu hu hu");
    }

    public void howToReproduce(){
        System.out.println("De binh thuong");
    }
}
