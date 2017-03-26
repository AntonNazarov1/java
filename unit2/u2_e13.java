public class u2_e13 {                       // иключенные номера с 4 и/или 13
    public static void main(String[] args) {
        int c = 0;
        boolean b = false;

        for (int a = 3; a < 99995; a++) {
            int d = a;
            b = false;
            while (d > 0){
                if (d%10 == 4 || d%100 == 13){
                    b = true;
                    break;
                }
                d = d/10;
            }
            if (b){
                c++;
            }
        }
        System.out.println(c);
    }
}
