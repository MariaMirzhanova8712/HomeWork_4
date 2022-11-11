package Arrays;

import java.util.concurrent.ThreadLocalRandom;

public class SumOfElementsInArray_7 {

    public static void main(String[] args) {
        int legth = 7;
        int[] array = new int[legth];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(101);
            System.out.println(i + " " + array[i]);
            sum = sum + array[i];
        }
        System.out.println("сумма случайных чисел из массива длинной из " + legth + " элементов = " + sum);
    }
}
