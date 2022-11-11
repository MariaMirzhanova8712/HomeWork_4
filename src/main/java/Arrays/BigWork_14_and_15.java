package Arrays;

public class Recycling_14_and_15 {
    static int[] array = {8, 10, 9, 10, 8, 12, 14, 9};
    static int workingDayDuration = 8;
    static int countOfDaysHours = array.length * workingDayDuration;

    public static void main(String[] args) {
        System.out.println(recycling(array));

    }
    public static String recycling(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            System.out.println("переработка за " + i + " день " + (array[i] - workingDayDuration) + " час(а)");
        }
        if (sum > countOfDaysHours) {
            return "есть переработка " + (sum - countOfDaysHours + " час(а)");
        } else return "переработки нет";
    }
}
