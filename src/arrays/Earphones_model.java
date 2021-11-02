package arrays;

import models.Earphones;

import java.util.ArrayList;

public class Earphones_model {

    public void demo(){

        ArrayList<Earphones> brandslist = new ArrayList<>();

        Earphones earphone1 = new Earphones("Boat sounds",24,17999.0,"Sound qualitywas best on this price");
        brandslist.add(earphone1);

        Earphones earphone2 = new Earphones("JBL sounds",14,37999.0,"Sound qualitywas best on this price");
        brandslist.add(earphone2);

        Earphones earphone3 = new Earphones("Sony Speakers",34,27999.0,"Sound qualitywas best on this price");
        brandslist.add(earphone3);

        Earphones earphone4 = new Earphones("Zebroniccs sounds",44,10999.0,"Sound qualitywas best on this price");
        brandslist.add(earphone4);

        for (Earphones var : brandslist){
            System.out.println(var.getName());
            System.out.println(var.getButtons());
            System.out.println(var.getPrice());
            System.out.println(var.getQuality());
        }
    }

    public static void main(String[] args) {
        Earphones_model obj = new Earphones_model();
        obj.demo();
    }
}
