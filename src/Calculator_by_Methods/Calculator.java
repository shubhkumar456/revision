package Calculator_by_Methods;

public class Calculator {


    public void addition(){

        int a =12;
        int b =12;
        int result = a+b;

        System.out.println("The sum of the addition is :-  "+result);
    }

    public void substraction(){

        int a =112;
        int b =12;
        int result = a-b;

        System.out.println("The sum of the substraction is :-  "+result);
    }

    public void multiplication(){

        int a =12;
        int b =12;
        int result = a*b;

        System.out.println("The sum of the multiplication is :-  "+result);
    }

    public void division(){

        int a =120;
        int b =12;
        int result = a/b;

        System.out.println("The sum of the division is :-  "+result);
    }


    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.addition();
        obj.substraction();
        obj.multiplication();
        obj.division();
    }
}
