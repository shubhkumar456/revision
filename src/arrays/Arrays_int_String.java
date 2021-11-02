package arrays;

import java.util.ArrayList;

public class Arrays_int_String {

    public void demo(){

        ArrayList <String> namelist = new ArrayList<>();

        namelist.add("Google Maps");
        namelist.add("Java");
        namelist.add("Spring Boot");
        namelist.add("Spring");
        namelist.add("HTML");
        namelist.add("Google Chrome");

        System.out.println("print some some name using get method :"+namelist.get(0));
        System.out.println("print some some name using get method :"+namelist.get(1));
        System.out.println("print some some name using get method :"+namelist.get(2));

        for(Object var: namelist){
            System.out.println("print some browsing application :-"+var);
        }

        namelist.remove(0);
        namelist.remove(1);
        namelist.remove(2);

        for(Object var: namelist){
            System.out.println("print some browsing application after removing :-"+var);
        }


        ArrayList<Integer> rollnolist = new ArrayList<>();

        rollnolist.add(123);
        rollnolist.add(234);
        rollnolist.add(345);
        rollnolist.add(456);
        rollnolist.add(567);
        rollnolist.add(678);

        System.out.println("print some some rice using get method :"+rollnolist.get(0));
        System.out.println("print some some rice using get method :"+rollnolist.get(1));
        System.out.println("print some some rice using get method :"+rollnolist.get(2));

        for(Object output: rollnolist){
            System.out.println("print some students rollno. :-"+output);
        }

        rollnolist.remove(0);
        rollnolist.remove(1);
        rollnolist.remove(2);

        for(Object output: rollnolist){
            System.out.println("print some students rollno. after removing :-"+output);
        }


        ArrayList<Double> pricelist = new ArrayList<>();

        pricelist.add(2999.0);
        pricelist.add(3999.0);
        pricelist.add(4999.0);
        pricelist.add(5999.0);
        pricelist.add(6999.0);
        pricelist.add(7999.0);
        pricelist.add(8999.0);

        System.out.println("print some some rice using get method :"+pricelist.get(0));
        System.out.println("print some some rice using get method :"+pricelist.get(1));
        System.out.println("print some some rice using get method :"+pricelist.get(2));

        for(Object result: pricelist){
            System.out.println("print some product price :-"+result);
        }

        pricelist.remove(0);
        pricelist.remove(1);
        pricelist.remove(2);

        for(Object result: pricelist){
            System.out.println("print some product price after removing :-"+result);
        }

    }

    public static void main(String[] args) {

        Arrays_int_String obj = new Arrays_int_String();
        obj.demo();
    }
}
