package hashset;

import java.util.HashSet;

public class Hashset_Demo {

    public void demo(){

        HashSet <String> namelist = new HashSet<>();

        namelist.add("Mitashi");
        namelist.add("Mitashi");
        namelist.add("sony");
        namelist.add("sony");
        namelist.add("ifallcon");
        namelist.add("ifallcon");
        namelist.add("oneplus");
        namelist.add("micromax");

        for (String var : namelist){
            System.out.println("print name remove duplicates :"+var);
        }

        HashSet <Integer> workersid = new HashSet<>();

        workersid.add(1122);
        workersid.add(1122);
        workersid.add(2233);
        workersid.add(2233);
        workersid.add(3344);
        workersid.add(3344);
        workersid.add(4455);
        workersid.add(4455);

        for (Integer result : workersid){
            System.out.println("print some id's remove duplicates :"+result);
        }

        HashSet <Double> pricelist = new HashSet<>();

        pricelist.add(499.9);
        pricelist.add(499.9);
        pricelist.add(599.9);
        pricelist.add(599.9);
        pricelist.add(799.9);
        pricelist.add(799.9);

        for(Double output : pricelist){
            System.out.println("print some price using hashset :"+output);
        }

    }

    public static void main(String[] args) {
        Hashset_Demo obj = new Hashset_Demo();
        obj.demo();
    }
}
