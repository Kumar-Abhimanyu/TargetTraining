package Lamdas;

import java.awt.print.Printable;
import java.util.function.Predicate;

public class LamdasDemo {
    public static void main(String[] args) {
        SayableImpl sayable = new SayableImpl();
        sayable.say();

        Sayable s1 = ()->{
            System.out.println("Say something");
        };
        s1.say();

//        Printable pr1 = (pmsg)-> {
//            System.out.println("The message is "+pmsg);
//        };
//        pr1.printMsg()

        //Predefined SAMs
        Predicate<Integer> pr = (tInt)->(tInt>18);
        System.out.println(pr.test(19));
    }
}
