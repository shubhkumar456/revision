package hashmap;

import arrays.Earphones_model;
import models.Earphones;

import java.util.HashMap;

public class Earphones_Model {

    public void demo(){

        HashMap<String, Earphones> Earphone = new HashMap<>();

        Earphones earphone1 = new Earphones("Beats",4,20000.0,"Excellent");
        Earphones earphone2 = new Earphones("Skullcandy",3,3500.0,"Superb");
        Earphones earphone3 = new Earphones("JBL",3,6000.0,"Better");
        Earphones earphone4 = new Earphones("Boat",2,5000.0,"Best");

        Earphone.put("A",earphone1);
        Earphone.put("B",earphone2);
        Earphone.put("C",earphone3);
        Earphone.put("D",earphone4);

        Earphones earphones = Earphone.get("A");
        System.out.println(earphones.getName());
        System.out.println(earphones.getButtons());
        System.out.println(earphones.getPrice());
        System.out.println(earphones.getQuality());

        earphones = Earphone.get("B");
        System.out.println(earphones.getName());
        System.out.println(earphones.getButtons());
        System.out.println(earphones.getPrice());
        System.out.println(earphones.getQuality());


        earphones = Earphone.get("C");
        System.out.println(earphones.getName());
        System.out.println(earphones.getButtons());
        System.out.println(earphones.getPrice());
        System.out.println(earphones.getQuality());


        earphones = Earphone.get("D");
        System.out.println(earphones.getName());
        System.out.println(earphones.getButtons());
        System.out.println(earphones.getPrice());
        System.out.println(earphones.getQuality());

    }

    public static void main(String[] args) {
        Earphones_Model obj = new Earphones_Model();
        obj.demo();
    }
}
