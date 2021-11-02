package inputparameter;

public class Calculator_with_params {

    public void add(int a,int b){
        int result=a+b;
        System.out.println("The sum of the addition is :-"+result);
    }

    public void sub(int a,int b){
        int result=a-b;
        System.out.println("The sum of the substraction is :-"+result);
    }

    public void multi(int a,int b){
        int result=a*b;
        System.out.println("The sum of the multiply is :-"+result);
    }

    public void div(int a,int b){
        int result=a/b;
        System.out.println("The sum of the division is :-"+result);
    }

    public static void main(String[] args) {
        Calculator_with_params obj = new Calculator_with_params();
        obj.add(12,23);
        obj.sub(300,100);
        obj.multi(23,12);
        obj.div(100,2);
    }


}
