package Arrays;

import java.util.Arrays;

public class WorkingWeek_12 {
    static int[] workingHours = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1, 5, 5, 0};

    public static void main(String args[]) {

        System.out.println(Arrays.toString(workingHours));
        System.out.println(Arrays.toString(sumHours(workingHours)));
    }

    public static int[] sumHours(int[] array) {
        int[] sumHoursInWeek = new int[array.length / 7];
        int sum = 0;
        int day = 0;
        int weekDuration = 7;
        int week = 0;
        int i = 0;
        while (i < array.length) {
            for (; day < weekDuration; day++) {
                sum += array[i];
                i++;
            }
            sumHoursInWeek[week] = sum;
            day = 0;
            sum = 0;
            week++;
        }
        return sumHoursInWeek;
    }

}
