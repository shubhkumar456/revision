package hashmap;

import java.util.HashMap;

public class Hashmap_demo {

    public void demo(){

        HashMap<Integer,String> hashmap = new HashMap<>();

        hashmap.put(1,"Java");
        hashmap.put(2,"HTML");
        hashmap.put(3,"Spring");
        hashmap.put(4,"Spring Boot");
        hashmap.put(5,"Python");

        System.out.println(hashmap.get(1));
        System.out.println(hashmap.get(2));
        System.out.println(hashmap.get(3));

        hashmap.remove(1,"Java");
        hashmap.remove(2,"HTML");
        hashmap.remove(3,"Spring");

        for (Integer var: hashmap.keySet()){
            System.out.println(var);
        }

        for(String output: hashmap.values()){
            System.out.println(output);
        }


    }



    public static void main(String[] args) {
        Hashmap_demo obj = new Hashmap_demo();
        obj.demo();

    }
}
