package Arrays;
//Отсортированный по возрастанию и неотсортированный массив

public class AscendingSortedAndUnsortedArray_9 {
    static int[] arraySort = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
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
            if (array[j + 1] < array[j]) {            //проверить условие что текущий элемент массива j меньше чем следующий за ним элемент j+1 (условие сортировки по возрастанию)
                return " - этот массив не сортированный";     //в зависимости от того выполняется ли условие в if метод возвращает соответствующее сообщение типа строка
            }
        }
        return " - этот массив сортированный по возрастанию";
    }
}