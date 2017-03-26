public class u2_e12 {                       // кол-во симметричных комбинаций в часах
    public static void main(String[] args) {
        int c = 0;

        for (int i = 0; i <= 23; i++){
            for (int k = 0; k <= 59; k++){
                if (i%10 == (k/10)%10 && (i/10)%10 == k%10){
                    c++;
                }
            }
        }
        System.out.print(c);

    }
}
