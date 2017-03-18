import java.util.Scanner;           // не работает


public class u2_e7 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число:");
        int a = in.nextInt();

        for (int i = 2; i < a; i++){
            if ( a%i == 0 ) {
                System.out.println("простое");

            }
                System.out.println("составное");

        }



    }

    }



