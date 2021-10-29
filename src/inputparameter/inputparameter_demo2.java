package inputparameter;

public class inputparameter_demo2 {

    public void message(String message){
        System.out.println("the message for the student is :"+message);
    }

    public void two_params(String name,double price){
        System.out.println("The name of the product is :"+name+ ", Price is :"+price);
    }

    public void three_params(String product,int units,double price){
        System.out.println("the name of the product :"+product+ ", units of product is "+units+ ", the price is :"+price);
    }

    public void four_params(String specsname,String brand,int units,double price ){
        System.out.println("Name of specs :"+specsname+ ", brand name :"+brand+ ", units of products which i ordered :"+units+", price is :"+price);
    }

    public static void main(String[] args) {
        inputparameter_demo2 obj = new inputparameter_demo2();
        obj.message("The message for all the students is there will be a holiday for a week due to fever, cough and cold");
        obj.two_params("Nivea",100.0);
        obj.three_params("Lux Soap",4,109.0);
        obj.four_params("Vincent chase aviator","Lenskart",2,2459.0);
    }
}
