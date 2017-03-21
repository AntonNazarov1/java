import java.util.Random;             // наибольшая цифра случайного числа

public class u2_e2$2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int r = (int) (Math.random()*899+99);
        int a = r%10;
        int b = (r/10)%10;
        int c = (r/100)%10;
        if (a > b && a > c){
            System.out.println("В числе " +(r)+ " наибольшая цифра " +(a));
        }
        if (b > a && b > c) {
            System.out.println("В числе " +(r)+ " наибольшая цифра " +(b));
        }
        if (c > a && c > b){
            System.out.println("В числе " +(r)+ " наибольшая цифра " +(c));
        }
    }
}

/*
import java.util.Random;

public class u2_e2$2 {
    public static void main(String[] args) {

        Random rand = new Random();
        int r = (int) (Math.random() * 20 + 10);
        System.out.println(r);
    }
}

*/