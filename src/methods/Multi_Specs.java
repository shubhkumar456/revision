package methods;

public class Multi_Specs {

    String brand;
    int stores;
    double price;
    int units;
    String modeltypes;


    public void brand(){
        System.out.println("There are numbers of Specs brand available in the market");

    }

    public void name(){
        System.out.println("The example of the specs store is Lenskart India's no.1 brand of specs");

    }

    public void types(){
        System.out.println("It gives a different of many types of choices to choose the glass and frames of the specs");

    }

    public void framename(){
        System.out.println("The name of the frame which i use id vincent chase aviator,blu,air");

    }

    public void prices(){
        System.out.println("there are different price according to the glass or the frames such as :-  1000.0 to 10000.0");

    }

    public static void main(String[] args) {
        Multi_Specs obj = new Multi_Specs();
        obj.brand();
        obj.name();
        obj.types();
        obj.framename();
        obj.prices();
    }
}
