package Arrays;

import java.util.Arrays;

public class UnfinishedWorkWeek_13 {
    static int[] workingHours = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1, 5, 5, 0};  // две полные недели
    static int[] workingHoursUnfinished = {1, 1, 1, 2, 3, 5, 0,     2, 2, 2, 1, 5};  // неполная неделя

    public static void main(String args[]) {
        System.out.println(Arrays.toString(sumHours(workingHours)));
        System.out.println(Arrays.toString(sumHours(workingHoursUnfinished)));
    }

    public static int[] sumHours(int[] array) {
        int length;
        if (array.length % 7 == 0) { //если неделя полная т.е. количество элементов массива нацело делится на 7
            length = array.length / 7;
        } else {
            length = (array.length / 7) + 1; // если неделя неполная, то для этого "остатка недели" резервируется еще 1 элемент массива sumHoursInWeek
        }
        int[] sumHoursInWeek = new int[length];
        int sum = 0; //переменная для подсчета суммы часов
        int day = 0; //переменная для подсчета дней
        int weekDuration = 7;
        int week = 0; //переменная под количество недель
        int i = 0;
        while (i < array.length) {
            sum += array[i];      //в цикле суммируем элементы массива (часы работы по дням)
            i++;
            day++;
            if (day >= weekDuration) {      //когда количество дней достигает длительности недели,
                sumHoursInWeek[week] = sum; //записываем в массив сумму часов суммированную за неделю
                day = 0; //обнуляем  счетчик дней
                sum = 0; //обнуляем  счетчик суммы часов
                week++;  //прибавляем счетчик недель (переходим на следующую неделю)
            }
        }
        if (array.length % 7 != 0) {  //если неделя неполная и условие деления нацело на 7 не выполняется,
            sumHoursInWeek[week] = sum; //то записываем в массив sumHoursInWeek ту сумму которая успела посчитаться
        }
        return sumHoursInWeek; //возвращаем массив с отработанными часами
    }
}
