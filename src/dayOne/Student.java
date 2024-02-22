package dayOne;

public class Student {
    String name;
    int age;
    boolean isEligible;

    //Parametrized Constructor
    Student(String name, int age, boolean isEligible){
        this.name = name;
        this.age = age;
        this.isEligible = isEligible;
    }

    public void display(){
        System.out.println(name+" "+age+" "+isEligible);
    }
}
