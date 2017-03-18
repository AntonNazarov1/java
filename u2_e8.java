/*public class u2_e8 {                        // 11 чисел Фибоначчи
    public static void main (String[] args){
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i <= 9; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);


        }
    }

    }
*/


import java.util.Scanner;

public class u2_e8 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кол-во членов последовательности:");
        int n = in.nextInt();
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < (n-2); i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);


        }
    }

}