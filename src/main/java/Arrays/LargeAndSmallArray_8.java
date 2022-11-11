package Arreys;

import java.util.concurrent.ThreadLocalRandom;

public class LargeAndSmallArray_8 {
    static int[] arrayBig = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 10};
    static int[] arraySmall = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println(bigOrSmall(arrayBig));
        System.out.println(bigOrSmall(arraySmall));
    }

    public static String bigOrSmall(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            //System.out.println(i + " " + array[i]);
            sum = sum + array[i];
        }
        if (sum > 100) {
            return "Массив большой";
        } else return "Массив маленький";

    }


}
