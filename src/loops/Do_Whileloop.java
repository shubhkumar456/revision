package loops;

import java.net.ServerSocket;

public class Do_Whileloop {

    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.println("inside do while loop :"+i);
            i++;

            if(i==7){
                break;
            }
        }
        while (i<=10);


        int x =1;
        int five = 5;
        do{
            System.out.println("print table five inside do while loop :"+x*five);
            x++;
        }
        while(x<=10);


        int a =1;
        int seven = 7;
        do{
            System.out.println("print table seven :"+a*seven);
            a++;
        }
        while(a<=10);


        int b = 10;
        int three = 3;
        do{
            System.out.println("decrement of table three :"+b*three);
            b--;
        }
        while(b>0);


        int d =10;
        int nine = 9;
        do{
            System.out.println("decrement of table nine :"+d*nine);
            d--;
        }
        while(d>0);
    }


    }

