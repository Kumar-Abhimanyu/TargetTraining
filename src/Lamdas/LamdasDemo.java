package Lamdas;

public class LamdasDemo {
    public static void main(String[] args) {
        SayableImpl sayable = new SayableImpl();
        sayable.say();

        Sayable s1 = ()->{
            System.out.println("Say something");
        };
        s1.say();
    }
}
