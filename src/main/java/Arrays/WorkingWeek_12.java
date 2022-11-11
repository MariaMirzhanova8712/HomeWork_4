//package Arreys;
//
//import java.util.concurrent.ThreadLocalRandom;
//import java.util.Arrays;
//
//public class WorkingWeek_12 {
//    static int[] arrayWorkDay = {1, 1, 1, 2, 3, 5, 0, 2, 2, 2, 1, 5, 5, 0};
//    int[] arrayWorkWeek = new int[]{sum1, sum2};
//    int sum1 = 0;
//    int sum2 =0;
//
//    public static void main(String[] args) {
//        System.out.println(workingHoursPerWeek1(arrayWorkDay));
//        System.out.println(arrayWorkWeek);
//
//
//    }
//
//    public static String workingHoursPerWeek1(int[] arrayWorkDay) {
//        int sum1 = 0;
//        for (int i = 0; i <= 6; i++) {
//            sum1 = sum1 + arrayWorkDay[i];
//        }
//        return String.valueOf(sum1);
//
//        for (int i = 7; i <= 14; i++) {
//            sum2 = sum2 + arrayWorkDay[i];
//        }
//        return String.valueOf(sum2);
//
//    }
//
//
//}
