package qe.digital.lesson2.human;

public class Human {
    String name;
    int age;

    public Human(){

    }
    public Human(String name){
        this.name = name;
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo()
    {
        System.out.println(name+ " - "+age+ " tuoi");
    }
    public void showName(){
        System.out.println(name);
    }
    public void showAge(){
        System.out.println(age);
    }
    public void showAgePlus1(int a){
        this.age = age + a;
        System.out.println(age);
    }
    public void showAgePlus2(int a, int b){
        this.age = age + a + b;
        System.out.println(age);
    }
    public void showAgePlus3(int a, int b, int c){
        this.age = age + a + b + c;
        System.out.println(age);
    }
}
