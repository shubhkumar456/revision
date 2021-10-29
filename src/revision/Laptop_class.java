package revision;

public class Laptop_class {

    String name = "Lenovo";
    String model = "Lenovo ThinkPad";
    int accessories = 3;
    double price = 84999.9;
    int ram = 8;
    int rom = 512;

    public static void main(String[] args) {

        Laptop_class obj = new Laptop_class();

        System.out.println(obj.name);
        System.out.println(obj.model);
        System.out.println(obj.accessories);
        System.out.println(obj.price);
        System.out.println(obj.ram);
        System.out.println(obj.rom);
    }

}
