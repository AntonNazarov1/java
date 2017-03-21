import java.util.Scanner;             // сумма цифр введенного с клавиатуры числа

public class u2_e9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число:");
        int n = in.nextInt();
        int sum = 0;

        while (n > 0){
            sum = sum+n%10;
            n = n/10;
        }

        System.out.print("Сумма его цифр: "+sum);

    }
}
