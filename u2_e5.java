import java.util.Scanner;

public class u2_e5 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число:");
        int a = in.nextInt();
        int f = 1;
        for (int i = 2; i <= a; i++){
            f *= i; // f = f*i
        }
        System.out.println("Факториал равен: " +f);
    }
}
