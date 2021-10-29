package methods;

public class Student_class {

     String name;
     int age;
     int rollno;



    // name , standard , section , age, position //

     public void name() {
          System.out.println("My name is Shubendra Kumar");

     }
     public void standard(){
          System.out.println("Im in twelth standard");

     }

     public void section(){
          System.out.println("i'm in section B");

     }

     public void age(){
          System.out.println("Iam 14 year old");
     }

     public static void main(String[] args) {
          Student_class obj = new Student_class();
          obj.age();
          obj.name();
          obj.standard();
          obj.section();
     }

}
