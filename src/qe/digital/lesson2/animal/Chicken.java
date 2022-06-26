package qe.digital.lesson2.animal;

public class Chicken extends Animal {
    private String chickenAction;

    public Chicken() {
        super();
    }

    public String getChickenAction() {
        return chickenAction;
    }

    public void setChickenAction(String chickenAction) {
        this.chickenAction = chickenAction;
    }

    @Override
    public void showSounding() {
//        super.showSounding();
        System.out.println("O o o");
    }

    @Override
    public void howToReproduce() {
        System.out.println("De trung");
    }
}
