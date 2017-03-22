public class u3_e3 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        System.out.println("Начальный массив:");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int)(Math.random()*89+5);
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Перевернутый массив:");

        for (int i = 0; i < arr1.length/2; i ++){
            int a = arr1[i];
            arr1[i] = arr1[arr1.length - i - 1];
            arr1[arr1.length - i - 1] = a;
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
