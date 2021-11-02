package loops;

public class ForLoop {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){
            System.out.println("increment of for loop :"+i);
            if(i==4){
                break;
            }
        }

        int three =3;
        for(int i=1; i<=10; i++){
            System.out.println("print table of three "+i*three);
        }

        int five = 5;
        for(int i=10; i>0; i--){
            System.out.println("decrement of table five :"+i*five);
        }
    }
}
