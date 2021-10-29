package methods;

public class MitashiTV {

    String brand ;
    int ram;
    int rom;
    String android;
    double price;


    public void name(){
        System.out.println("the name of the smart tv is mitashi");
    }

    public void model(){
        System.out.println("the model name of the tv is mideo55v60 4ks");
    }

    public void ram(){
        System.out.println("the ram of the tv is 2");
    }

    public void rom(){
        System.out.println("the rom of the tv is 4gb");
    }

    public void price(){
        System.out.println("The price of the tv is :- 56999.0");
    }

    public static void main(String[] args) {
        MitashiTV obj = new MitashiTV();
        obj.name();
        obj.model();
        obj.ram();
        obj.rom();
        obj.price();
    }
}
