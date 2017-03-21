public class u2_e4 {
    public static void main (String[] args) {
        int a = 2;
        int b = 20;
        //System.out.println(Math.pow(a, b));
        for (int i = 2; i <= Math.pow(a, b); i = i * 2){
            System.out.println(i);
        }
    }
}
