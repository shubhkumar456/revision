package arrays;

public class ArrayClass {

    public void demo(){

        int[] numberarray = {12,13,14,15,16};
        for(int var : numberarray){
            System.out.println("print num values in advance for loop :"+var);
        }

        String[] namearray = {"john","smith","arun","shubendra"};
        for(String val: namearray){
            System.out.println("print name vales in advance for loop :"+val);
        }

        String[] subjects = {"Hindi","English","Maths","English"};
        for(int i=0; i<subjects.length; i++){
            System.out.println("printig subjects for normal loops :"+subjects[i] +" print index "+i);
        }

        String[] names ={"Shubendra Kumar","Gulshan Kumar","Parmendra Kumar","Hitendra Kumar","Hemant Kumar"};
        for(String val : names) {
            System.out.println("Decrement of name loops :" +val);
        }
    }


    public static void main(String[] args) {
        ArrayClass obj = new ArrayClass();
        obj.demo();
    }
}
