/*import java.util.Random;     // 1-й способ не доделан

public class u3_e4 {
    public static void main(String[] args) {
        Numbers car1 = new Numbers();
        car1.generate();
    }
}
class Numbers{
    int car_number = (int) (Math.random()*899+100);
    int region = (int) (Math.random()*89+10);
    String[] letters = {"A","B","E","K","M","H","O","P","C","T","Y","X","D"};

    void generate(){
        for (int i = 0; i < letters.length; i++){
            i = (int) (Math.random()*12+0);
            System.out.println(letters[i]+" "+car_number+" "+letters[i+1]+""+letters[i+3]+" "+region);
            break;
        }
    }
} */

import java.util.Random;         // второй способ

public class u3_e4 {
    public static void main(String[] args) {
        Numbers car1 = new Numbers();
        car1.generate();
    }
}

class Numbers {
        int car_number = (int) (Math.random()*899+100);
        int region = (int) (Math.random()*89+10);
        String[] letters = {"A","B","E","K","M","H","O","P","C","T","Y","X","D"};

        void generate() {
            System.out.print(letters[new Random().nextInt(letters.length)] + " " + car_number + " ");
            System.out.print(letters[new Random().nextInt(letters.length)]);
            System.out.print(letters[new Random().nextInt(letters.length)] + " " + region);
        }

}
