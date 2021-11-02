package hashset;

import models.Students;

import java.util.HashSet;

public class Hashset_with_Model {

    public void demo(){

        HashSet<Students> studentslist  = new HashSet<>();

        Students student1 = new Students("arun",24,34,5999.0,"A");
        Students student2 = new Students("subodh",25,36,6999.0,"B");
        Students student3 = new Students("ankit",26,38,7999.0,"C");
        Students student4 = new Students("shubendra",27,40,8999.0,"D");
        Students student5 = new Students("gulshan",28,42,9999.0,"D");

        studentslist.add(student1);
        studentslist.add(student2);
        studentslist.add(student3);
        studentslist.add(student4);
        studentslist.add(student5);

        for (Students var: studentslist){
            System.out.println(var.getName());
            System.out.println(var.getAge());
            System.out.println(var.getRollno());
            System.out.println(var.getFees());
            System.out.println(var.getSection());
        }
    }

    public static void main(String[] args) {
        Hashset_with_Model obj = new Hashset_with_Model();
        obj.demo();
    }
}
