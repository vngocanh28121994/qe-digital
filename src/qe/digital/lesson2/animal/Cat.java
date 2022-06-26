package qe.digital.lesson2.animal;

public class Cat extends Animal{
    private String catAction;
    public Cat(){
        super();
    }

    @Override
    public void showSounding(){
        //super.showSounding();
        System.out.println("Meo meo");
    }

    @Override
    public void howToReproduce(){
        System.out.println("De con");
    }
}
