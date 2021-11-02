package return_type_method;

public class Calculator_with_returntype {

    public int addition(int a,int b,int c,int d){
        int result = a+b+c+d;
        return result;
    }

    public int substraction(int a,int b,int c,int d){
        int result = a-b-c-d;
        return result;
    }

    public int multi(int a,int b,int c,int d){
        int result = a*b*c*d;
        return result;
    }

    public int division(int a,int b,int c,int d){
        int result = a/b/c/d;
        return result;
    }

    public static void main(String[] args) {
        Calculator_with_returntype obj =new Calculator_with_returntype();

        int var = obj.addition(12,23,34,45);
        System.out.println("sum of the addition "+var);

        int values = obj.substraction(1200,200,100,300);
        System.out.println("sum of the substraction "+var);

        int result = obj.multi(12,12,23,23);
        System.out.println("the sum of the multi "+result);

        int val = obj.division(12000,12,2,4);
        System.out.println("the sum of the division is "+val);
    }


}
