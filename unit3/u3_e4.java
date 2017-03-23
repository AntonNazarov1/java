import java.util.Random;

public class u3_e4 {
    public static void main(String[] args) {
        Number car1 = new Number();
        car1.generate();
    }
}
class Number{
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
}


/*                         // без генерации букв
import java.util.Random;

public class u3_e4 {
    public static void main(String[] args) {
        Number car1 = new Number();
        car1.generate();
    }
}
class Number{
    int car_number = (int) (Math.random()*899+100);
    int region = (int) (Math.random()*89+10);


    void generate(){
        System.out.println("M " +car_number+ " MM " +region);
    }
}

*/
