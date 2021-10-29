package revision;

import methods.MitashiTV;

import javax.security.sasl.SaslServer;

public class Mitashi {

    String name;
    String brand;
    int types;
    double price;
    String quality;

    public Mitashi(String name, String brand, int types, double price, String quality) {
        this.name = name;
        this.brand = brand;
        this.types = types;
        this.price = price;
        this.quality = quality;
    }

    public static void main(String[] args) {
        Mitashi obj = new Mitashi("Mitashi tower speaker ","Mitashi",5,27999.0,"Sound quality was best");

        System.out.println(obj.name);
        System.out.println(obj.brand);
        System.out.println(obj.types);
        System.out.println(obj.price);
        System.out.println(obj.quality);


        Mitashi obj1 = new Mitashi("Mitashi smart tv ","Mitashi",4,57999.0,"picture qualit was best");

        System.out.println(obj1.name);
        System.out.println(obj1.brand);
        System.out.println(obj1.types);
        System.out.println(obj1.price);
        System.out.println(obj1.quality);


        Mitashi obj2 = new Mitashi("Mitashi Air conditioner ","Mitashi",6,37999.0,"it gives best cooling");

        System.out.println(obj2.name);
        System.out.println(obj2.brand);
        System.out.println(obj2.types);
        System.out.println(obj2.price);
        System.out.println(obj2.quality);

    }
}
