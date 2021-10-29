package revision;

public class Mobile_class {

    String brand ="Vivo";
    double price = 15999.0;
    String model = "Vivo Z1Pro";
    int accessories = 5;

    public static void main(String[] args) {

        Mobile_class obj = new Mobile_class();

        System.out.println(obj.brand);
        System.out.println(obj.price);
        System.out.println(obj.model);
        System.out.println(obj.accessories);

        Mobile_class obj1 = new Mobile_class();

        System.out.println(obj1.brand);
        System.out.println(obj1.price);
        System.out.println(obj1.model);
        System.out.println(obj1.accessories);
    }
}
