package return_type_method;

public class Return_demo {

    public String demo(){
        String message= "hello world";
        return message;
    }

    public int age (){
        int age = 24;
        return age;
    }

    public String message(String msg){
        String message = "Hello world Welcome to the "+msg+" World";
        return message;
    }

    public int add(int a, int b){
        int result = a+b;
        return result;
    }

    public static void main(String[] args) {
        Return_demo obj = new Return_demo();
        String var = obj.demo();
        System.out.println("Printing demo message :-"+var);

        int result = obj.age();
        System.out.println("Iam "+result+" year old");

        String output = obj.message("Devil");
        System.out.println("Come to my world "+output);

        int val = obj.add(12,23);
        System.out.println("The sum of the addition "+val);
    }
}
