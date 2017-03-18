import java.util.Scanner;


public class u2_e6 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число:");
        int a = in.nextInt();
        System.out.println("Его делители:");
        for (int i = 1; i <= a; i++) {

            if (a%i == 0){
                System.out.println(i);
            }
        }


    }
}
