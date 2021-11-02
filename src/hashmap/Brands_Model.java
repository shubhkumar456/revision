package hashmap;

import models.Brands;

import java.util.HashMap;

public class Brands_Model {

    public void demo(){

        HashMap <Double, Brands>  mobilebrands = new HashMap<>();

        Brands brand1 = new Brands("Apple Iphone",6000,89999.0,"IOS Processor");
        Brands brand2 = new Brands("One Plus+",8000,69999.0,"910 Snapdragon Octa core Processor");
        Brands brand3 = new Brands("Vivo Mobiles",5000,49999.0,"890 Snapdragon Processor");
        Brands brand4 = new Brands("Oppo Mobile ",4000,39999.0,"915 Mediatek Helio Processor");

        mobilebrands.put(1.0,brand1);
        mobilebrands.put(2.0,brand2);
        mobilebrands.put(3.0,brand3);
        mobilebrands.put(4.0,brand4);

        Brands brand = mobilebrands.get(1.0);
        System.out.println(brand.getName());
        System.out.println(brand.getBattery());
        System.out.println(brand.getPrice());
        System.out.println(brand.getProcessor());

        brand = mobilebrands.get(2.0);
        System.out.println(brand.getName());
        System.out.println(brand.getBattery());
        System.out.println(brand.getPrice());
        System.out.println(brand.getProcessor());

        brand = mobilebrands.get(3.0);
        System.out.println(brand.getName());
        System.out.println(brand.getBattery());
        System.out.println(brand.getPrice());
        System.out.println(brand.getProcessor());

        brand = mobilebrands.get(4.0);
        System.out.println(brand.getName());
        System.out.println(brand.getBattery());
        System.out.println(brand.getPrice());
        System.out.println(brand.getProcessor());
    }


    public static void main(String[] args) {
        Brands_Model object = new Brands_Model();
        object.demo();
    }
}
