import java.util.Scanner;                     // простое число


public class u2_e7 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число:");
        int a = in.nextInt();
        boolean b = true;

        for (int i = 2; i < (Math.sqrt(a)+1); i++) {
            if (a % i == 0) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("оно простое");
        }
        else {
            System.out.println("оно составное");
        }

    }
}


/*


import java.util.Scanner;


public class u2_e7 {
    public static void main(String[] args) {

        System.out.print("Введите натуральное число:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.print(Math.sqrt(a));


    }
}   */