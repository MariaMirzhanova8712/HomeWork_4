package Arrays;

import java.util.concurrent.ThreadLocalRandom;

public class FillArrayWithRandomNumbers_6 {

    public static void main(String[] args) {
        int legthArray = 5;
        int[] array = new int[legthArray];
        for (int i = 0; i < legthArray; i++) {
            int number = ThreadLocalRandom.current().nextInt(101); //генерируем элемент массива
            array[i] = number;                                            //присваеваем i- тому эменету массива сгенерированное значение
            System.out.println(i + " " + array[i]);
        }
    }
}



