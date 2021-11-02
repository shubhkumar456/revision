package hashmap;

import hashset.Hashset_with_Model;
import models.Students;

import java.util.HashMap;

public class Hashmap_with_Model {

    public void demo(){

        HashMap<Integer, Students> studentid = new HashMap<>();

        Students student1 = new Students("Shubendra",24,5148362,45999.0,"A");
        Students student2 = new Students("Gulshan",25,5148363,55999.0,"B");
        Students student3 = new Students("Subodh",24,5148364,65999.0,"C");
        Students student4 = new Students("Arun",24,5148365,75999.0,"D");

        studentid.put(1,student1);
        studentid.put(2,student2);
        studentid.put(3,student3);
        studentid.put(4,student4);

        Students student = studentid.get(1);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollno());
        System.out.println(student.getFees());
        System.out.println(student.getSection());

        student = studentid.get(2);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollno());
        System.out.println(student.getFees());
        System.out.println(student.getSection());

        student = studentid.get(3);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollno());
        System.out.println(student.getFees());
        System.out.println(student.getSection());

        student = studentid.get(4);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollno());
        System.out.println(student.getFees());
        System.out.println(student.getSection());

    }

    public static void main(String[] args) {
        Hashmap_with_Model obj = new Hashmap_with_Model();
        obj.demo();
    }
}
