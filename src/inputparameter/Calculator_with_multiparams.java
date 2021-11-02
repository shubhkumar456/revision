package inputparameter;

public class Calculator_with_multiparams {

    public void addition(int a,int b,int c,int d){
        int result = a+b+c+d;
        System.out.println("the sum of the addition in multiparams :-"+result);

    }

    public void subs(int a,int b,int c,int d){
        int result = a-b-c-d;
        System.out.println("the sum of the substraction in multiparams :-"+result);
    }

    public void multi(int a,int b,int c,int d){
        int result = a*b*c*d;
        System.out.println("the sum of the multiplication in multiparams :-"+result);

    }

    public void div(int a,int b,int c,int d) {
        int result = a / b / c / d;
        System.out.println("the sum of the division in multiparams :-"+result);
    }

    public static void main(String[] args) {
        Calculator_with_multiparams obj = new Calculator_with_multiparams();
        obj.addition(12,23,34,45);
        obj.subs(100,20,30,10);
        obj.multi(11,12,13,14);
        obj.div(10000,10,2,5);
    }

}
