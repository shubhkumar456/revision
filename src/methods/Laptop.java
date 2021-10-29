package methods;

public class Laptop {

    String brand ;
    int ram;
    int rom;
    String android;
    double price;

    public void brand(){
        System.out.println("the brand name of the laptop is lenovo thinkpad");
    }

    public void ram(){
        System.out.println("the ram of the laptop is 8GB");
    }

    public void rom(){
        System.out.println("The rom of the laptop is 512GB");
    }

    public void processor(){
        System.out.println("This laptop works on the i5 processor");
    }

    public void price(){
        System.out.println("the price of the laptop is :- 88999.0");
    }

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.brand();
        obj.ram();
        obj.rom();
        obj.processor();
        obj.price();
    }
}
