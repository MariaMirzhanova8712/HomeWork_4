package Arrays;

public class AnomaliesInArray_17 {
    public static int[] array = {56, 45, 38, 155, 100, 101};
    public static int[] array2 = {56, 45, 38, 155, 200, 101};

    public static void main(String args[]) {
        isOdd(array);
        System.out.println("------------------");
        isOdd(array2);
    }

    // сортировка элементов массива по убыванию
    public static void isOdd(int[] array) {
//  массив для хранения правил последовательности
        int[] rule = new int[array.length-1];
//  счетчик
        int i = 1;
        int j = 1;
//  печатаем первый и второй элемент массива, они не могут быть аномалией
        System.out.println(array[0]);
        System.out.println(array[1]);
        while (i < array.length) {
            if (array[i] > array[i - 1]) {
//  массив возрастает 1
                rule[j-1] = 1; //задаем правило что если массив array возрастает, то в массив  rule записываем 1 как элемент
            }
            if (array[i] < array[i - 1]) {
//  массив убывает 2
                rule[j-1] = 2; //задаем правило что если массив array убывает, то в массив  rule записываем 2 как элемент
            }
// если правило для элемента не соответствует предидущему в массиве то печатаем предупреждение
            if ((i > 1) && (j > 1) && (rule[j - 1] != rule[j - 2])) {
                System.out.println(array[i] + " <---- аномальный элемент");
                j=0;
//  если аномалия не найдена печатаем элемент
            } else if (i > 1) System.out.println(array[i]);
            i++;
            j++;
        }
    }
}
