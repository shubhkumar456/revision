package arrays;

import models.Students;

import java.util.ArrayList;

public class Student_model {

    public void demo(){

        ArrayList<Students> studentarray = new ArrayList<>();

        Students student1 = new Students("shubendra",24,12345,3999.0,"Section C");
        studentarray.add(student1);

        Students student2 = new Students("gulshan",26,2345,5999.0,"Section B");
        studentarray.add(student2);

        Students student3 = new Students("subodh",25,345,4999.0,"Section F");
        studentarray.add(student3);

        Students student4 = new Students("hemant",22,22345,9999.0,"Section A");
        studentarray.add(student4);

        for(Students var: studentarray){
            System.out.println("print name :"+ var.getName());
            System.out.println("print name :"+ var.getAge());
            System.out.println("print name :"+ var.getRollno());
            System.out.println("print name :"+ var.getFees());
            System.out.println("print name :"+ var.getSection());
            var.setName("Harry potter");
            System.out.println("recorrect name :"+var.getName());

        }
    }

    public static void main(String[] args) {
        Student_model obj = new Student_model();
        obj.demo();
    }

}
