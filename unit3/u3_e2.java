public class u3_e2 {
    public static void main(String[] args) {

        int[][] array2 = new int[5][8];
        int max_n = array2[0][0];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++){
                array2[i][j] = (int)(Math.random()*200+(-99));
            }
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++){
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++){

                if (max_n < array2[i][j]){
                    max_n = array2[i][j];
                }
            }
        }
        System.out.println("Наибольший элемент: " +max_n);

    }
}

