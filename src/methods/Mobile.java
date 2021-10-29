package methods;

public class Mobile {

    String brand;
    int ram;
    int rom;
    double price;

    public void brand(){
        System.out.println("THis time iam using vivo Z1pro mobile phone");
    }

    public void ram(){
        System.out.println("THe ram of this mobile is 8GB");
    }

    public void rom(){
        System.out.println("The rom of the mobile is 64GB");
    }

    public void price(){
        System.out.println("The price of the vivo z1 pro mobile is :- 14999.0");
    }

    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand();
        obj.ram();
        obj.rom();
        obj.price();
    }
}
