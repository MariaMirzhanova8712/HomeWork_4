package Arrays;

public class SortedInDescendingOrderAndUnsortedArray_10 {
    static int[] arraySort = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
    static int[] arrayNotSort = {1, 5, 18, 4, 15, 6, 8, 11, 9, 20};

    public static void main(String[] args) {
        System.out.println(sortOrNotSort(arraySort));
        System.out.println(sortOrNotSort(arrayNotSort));
    }

    public static String sortOrNotSort(int[] array) { //создаем метод sortOrNotSort который принимает на вход массив(любой)
        for (int i = 0; i < array.length; i++) {      //печатаем элементы массива
            System.out.print(array[i] + " ");
        }
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j + 1] > array[j]) {            //проверить условие что текущий элемент массива j больше чем следующий за ним элемент j+1 (условие сортировки по убыванию)
                return " - этот массив не сортированный";     //в зависимости от того выполняется ли условие в if метод возвращает соответствующее сообщение типа строка
            }
        }
        return " - этот массив сортированный по убыванию";
    }
}
