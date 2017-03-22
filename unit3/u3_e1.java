public class u3_e1 {
    public static void main(String[] args) {
        int[][] array1 = new int[8][5];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++){
                array1[i][j] = (int)(Math.random()*89+10);
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
