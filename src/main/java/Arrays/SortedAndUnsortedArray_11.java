package Arrays;

public class SortedAndUnsortedArray_11 {
    public static int[] arrayAsc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //сортированный по возрастанию массив
    public static int[] arrayDesc = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; //сортированный по убываю массив
    public static int[] arrayNotSorted = {9, 1, 8, 3, 7, 5, 4, 2, 0, 6}; //несортированный массив
    public static int[] arrayNotSorted2 = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9}; //массив состоящий из одинаковых элементов

    public static void main(String args[]) {
        System.out.println("arrayAsc " + isSorted(arrayAsc));
        System.out.println("arrayDesc " + isSorted(arrayDesc));
        System.out.println("arrayNotSorted " + isSorted(arrayNotSorted));
        System.out.println("arrayNotSorted2 " + isSorted(arrayNotSorted2));
    }

    // сортировка элементов массива по убыванию
    public static String isSorted(int[] array) { //создаем метод isSorted который принимает на вход массив и проверяет его сортированность
        boolean sortedAsc = true; //переменной типа boolean (соответствует сортировке по возрастанию) присваиваем значение true (истина)
        boolean sortedDesc = true; //переменной типа boolean (соответствует сортировке по убыванию) присваиваем значение true (истина)
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[i - 1]) { //условие сортировки по убыванию
//  массив НЕ отсортирован по убыванию
                sortedAsc = false;         //условие ложно. т.е. массив не сортирован по возрастанию
            }
            if (array[i] > array[i - 1]) { //условие сортировки по возрастанию
//  массив НЕ отсортирован по возрастанию
                sortedDesc = false;        //условие ложно.т.е. массив не сортирован по убыванию
            }
            if (array[i] == array[i - 1]) { //если элементы массива равны
//  массив НЕ отсортирован по возрастанию
                sortedDesc = false;        //условие ложно.т.е. массив не сортирован по убыванию
                sortedAsc = false;        //условие ложно.т.е. массив не сортирован по возрастанию
            }
            i++;
        }
        if (sortedAsc || sortedDesc) { //проверяем условие, если значение переменной sortedAsc или sortedDesc истинно
            return "массив отсортирован"; //то возвращаем сообщение что он отсортирован
        } else
            return "массив не отсортирован"; //если оба уловия ложны значит возвращаем сообщение что массив не отсортирован
    }
}
