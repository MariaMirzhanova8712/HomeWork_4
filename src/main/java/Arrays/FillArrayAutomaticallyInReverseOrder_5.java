package Arrays;

public class FillArrayAutomaticallyInReverseOrder_5 {

    public static void main(String[] args) {
        int[] array = new int[100];
        int i = 100;
        while (i > 0) {
            array[100 - i] = i - 1;
            System.out.println((100 - i) + " - " + array[100 - i]); //распечатываем индекс элемента массива и через тире его значение
            i--;
        }
    }
}
