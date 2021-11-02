package arrays;

import java.util.ArrayList;

public class ArrayWith_Generics {

    public void demo(){

        ArrayList <String> namelist = new ArrayList<>();

        namelist.add("java");
        namelist.add("Python");
        namelist.add("Spring ");
        namelist.add("Spring Boot");
        namelist.add("HTML");
        namelist.add("Google");

        for(Object var: namelist){
            System.out.println("print string names :"+var);
        }
    }

    public static void main(String[] args) {
        ArrayWith_Generics obj = new ArrayWith_Generics();
        obj.demo();
    }
}
