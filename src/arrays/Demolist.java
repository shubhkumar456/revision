package arrays;

import java.util.ArrayList;

public class Demolist {

    public void demo(){

        ArrayList names = new ArrayList();

        names.add("Shubendra Kumar");  //  0
        names.add("Gulshan kumar");   // 1
        names.add("Parmendra Kumar"); // 2
        names.add("Hitendra Kumar");  //  3
        names.add("Arun Thakur");  //   4
        names.add("Subodh Kumar");  //  5

        System.out.println("Printing element using get method :"+names.get(4));
        System.out.println("Printing element using get method :"+names.get(0));
        System.out.println("Printing element using get method :"+names.get(5));


        for (Object var: names){
            System.out.println("Printing names :-"+var);
        }

        names.remove(0);
        names.remove(1);
        names.remove(5);

        for (Object var: names){
            System.out.println("Printing names after removing such names :-"+var);
        }


    }

    public static void main(String[] args) {
        Demolist obj = new Demolist();
        obj.demo();
    }
}
