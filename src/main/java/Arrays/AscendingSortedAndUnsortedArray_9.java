package Arreys;

public class AscendingSortedAndUnsortedArray_9 {
    static int[] arraySort = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    static int[] arrayNotSort = {1, 5, 18, 4, 15, 6, 8, 11, 9, 20};

    public static void main(String[] args) {
        System.out.println(sortOrNotSort(arraySort));
        System.out.println(sortOrNotSort(arrayNotSort));
    }
    public static String sortOrNotSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return "массив не сортированный";
            }
        }
        return "массив сортированный по возрастанию";
    }

}
