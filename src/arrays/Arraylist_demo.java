package arrays;

import java.util.ArrayList;

public class Arraylist_demo {

    public void demo(){

        ArrayList subject = new ArrayList();

        subject.add("Hindi");  //  index 0
        subject.add("English");  //  index  1
        subject.add("Mathematics"); //  index  2
        subject.add("Science");  //  index  3
        subject.add("Business Studies");  //  index  4
        subject.add("Economics");  //  index  5
        subject.add("Accountancy");  // index  6


        System.out.println("Using get method :"+subject.get(6));
        System.out.println("Using get method :"+subject.get(5));
        System.out.println("Using get method :"+subject.get(4));
        System.out.println("Using get method :"+subject.get(2));


        for (Object var : subject){
            System.out.println("Printing subject :"+var);
        }

        subject.remove(0);
        subject.remove(1);
        subject.remove(3);
        subject.remove(2);

        for (Object var : subject){
            System.out.println("Printing subject After removing such subjects :"+var);
        }

    }

    public static void main(String[] args) {
        Arraylist_demo obj = new Arraylist_demo();
        obj.demo();
    }
}
