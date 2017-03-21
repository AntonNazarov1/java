public class u2_e10 {                         // счастливые билеты
    public static void main(String[] args) {
        int a,b;
        int c = 0;


        for (int i = 1001; i <= 999999; i++){
            int sum1 = 0;
            int sum2 = 0;
            a = i/1000;
            b = i%1000;

         while (a > 0) {
             sum1 = sum1 + a%10;
             a = a/10;
         }
         while (b > 0){
             sum2 = sum2 + b%10;
             b = b/10;
         }
         if (sum1 == sum2) {
             c++;
         }
        }
        System.out.println(c);
    }
}