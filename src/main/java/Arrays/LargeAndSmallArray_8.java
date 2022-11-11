package Arrays;
//Если сумма элементов больше 100 - напечатать сообщение - это большой массив
// Если сумма элементов меньше 100 - напечатать сообщение - это маленький массив

public class LargeAndSmallArray_8 {
    static int[] arrayBig = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 10};
    static int[] arraySmall = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println(bigOrSmall(arrayBig));
        System.out.println(bigOrSmall(arraySmall));
    }
    public static String bigOrSmall(int[] array) { //создаем метод bigOrSmall который принимает на вход массив из чисел типа int
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            sum = sum + array[i];                  // и считает сумму его элементов
        }
        if (sum > 100) {                           // в зависимости от того выполняется ли условие в if метод возвращает соответствующее сообщение типа строка
            return " - это большой массив";

        } else return " - это маленький массив";

    }


}
