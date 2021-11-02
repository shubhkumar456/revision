package arrays;

import java.util.ArrayList;

public class ArrayList_demo2 {

    public void demo(){

        ArrayList brands = new ArrayList();

        brands.add("Puma"); //  index  0
        brands.add("HRX"); //  index  1
        brands.add("Nike"); //  index  2
        brands.add("Blackberrs"); //  index  3
        brands.add("U.S.Polo"); //  index  4
        brands.add("Wrogn"); //  index  5
        brands.add("Roadster"); //  index  6

        System.out.println("Printing Brands :-"+brands.get(4));
        System.out.println("Printing Brands :-"+brands.get(3));
        System.out.println("Printing Brands :-"+brands.get(1));

        for(Object var : brands){
            System.out.println("Printing some brands name :-"+var);
        }

        brands.remove(6);
        brands.remove(5);

        for(Object var : brands){
            System.out.println("Printing some brands name after removing :-"+var);
        }


    }

    public static void main(String[] args) {
        ArrayList_demo2 obj = new ArrayList_demo2();
        obj.demo();
    }
}
