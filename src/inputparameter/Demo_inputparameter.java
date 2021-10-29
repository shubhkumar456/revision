package inputparameter;

public class Demo_inputparameter {

    public void message(String name){
        System.out.println("Hello welcome to the world of "+name);
    }

    public void twoparams(String name, int age){
        System.out.println("My name is :"+name +" My age is :"+age);
    }

    public void threeparams(String brand ,int ram ,double price){
        System.out.println("THe brand name of the mobile which i use is: "+brand +" the ram of the mobile is :"+ram +" The price of the mobile is : "+price);
    }

    public void four_params(String brand,int types,double price,String quality){
        System.out.println("Brand name is :"+brand+ " Types of accessories :"+types+ " Price of the products is :"+price +" The quality of the product is :"+quality);

    }


    public static void main(String[] args) {
        Demo_inputparameter obj = new Demo_inputparameter();
        obj.message("Devil");
        obj.twoparams("Shubendra kumar",24);
        obj.threeparams("Vivo Z1Pro",8,15999.0);
        obj.four_params("Boat Sound ",6,350.0-20000.0,"The quality of the sound was absoutely good");
    }
}
