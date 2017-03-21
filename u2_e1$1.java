import java.util.Scanner;

public class u2_e1$1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число из диапазона [5;155]:");
        int n = in.nextInt();
        if ((n < 5) || (n > 155)) {
            System.out.print("Неверное число");
            return;

        }
        if ((n < 25) || (n > 100)) {
                System.out.print("Число "+(n)+ " не содержится в интервале (25;100)");
        }
        else {
            System.out.print("Число "+(n)+ " содержится в интервале (25;100)");
        }
    }
}