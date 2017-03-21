import java.util.Random;

public class u2_e3$3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int r = (int) (Math.random() * 28800 + 0);
        System.out.println(r);
        if (r < 28800 && r > 25200){
            System.out.println("осталось 7 часов");
        }
        if (r < 25200 && r > 21600){
            System.out.println("осталось 6 часов");
        }
        if (r < 21600 && r > 18000){
            System.out.println("осталось 5 часов");
        }
        if (r < 18000 && r > 14400) {
            System.out.println("осталось 4 часа");
        }
        if (r < 14400 && r > 10800) {
            System.out.println("осталось 3 часа");
        }
        if (r < 10800 && r > 7200) {
            System.out.println("осталось 2 часа");
        }
        if (r < 7200 && r > 3600) {
            System.out.println("остался 1 час");
        }
        if (r < 3600 && r > 0) {
            System.out.println("осталось менее часа");
        }
    }

}

