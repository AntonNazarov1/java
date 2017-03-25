public class u2_e11 {                         //  таблички с двойками
    public static void main(String[] args) {

        int c = 0;
        boolean b = false;


        for (int a = 1; a < 50000; a++) {
            int d = a;
            b = false;
            while (d > 0) {
                if (d % 10 == 2) {
                    b = true;
                    break;
                }
                d = d / 10;
            }
            if (b){
                c++;
            }
        }
        System.out.println(c);
    }
}

