package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Basic sort example
public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("abc",12);
        Student s2 = new Student("bcd",20);
        Student s3 = new Student("cde",26);

        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("Before sorting : ");
        System.out.println(list);
    }
}
