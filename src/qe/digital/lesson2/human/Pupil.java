package qe.digital.lesson2.human;

public class Pupil extends Human {
    String schoolName;

    public Pupil(String name) {
        super(name);
    }

    public Pupil(String name, int age, String schoolName) {
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void showPupilInfo() {
        System.out.println("Ten hoc sinh: " + name + " " + age + " tuoi hoc truong " + schoolName);
    }

    @Override
    public void showName() {
        System.out.println(name + " " + schoolName);
    }

//    @Override
//    public void showAge() {
//        System.out.println(age);
//    }
}
