package Calculator_by_Methods;

public class Calculator2 {

    public void addition(){

    int a = 23;
    int b = 23;
    int result = a+b;
    System.out.println("The sum of addition is :-  "+result);

    }

    public void substraction(){

        int a = 123;
        int b = 23;
        int result = a-b;
        System.out.println("The sum of substraction is :-  "+result);
    }

    public void division(){

        int a = 323;
        int b = 23;
        int result = a/b;
        System.out.println("The sum of division is :-  "+result);
    }

    public void multiplication(){

        int a = 23;
        int b = 23;
        int result = a*b;
        System.out.println("The sum of multiplication is :-  "+result);
    }

    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
        obj.addition();
        obj.substraction();
        obj.division();
        obj.multiplication();
    }

}
