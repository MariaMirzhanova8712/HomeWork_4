package Arreys;

public class FillArrayAutomatically_4 {

    public static void main(String[] args) {
        int array[] = new int[100];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + (array[i] = i)); //распечатываем индекс элемента массива и через тире его значение
        }
    }
}
