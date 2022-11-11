package Arrays;

public class TaskWithTwoAsterisks_16 {
    //  работа учитываается только в рабочие дни, если выходной то это полностью переработка
    static int[] workingTime = {8, 10, 9, 10, 8, 12, 14, 9};
    static int monday = 1470098; //код для понедельника
    static int tuesday = 206655; //код для вторника
    static int wednesday = 46001; //код для среды
    static int thursday = 740573; //код для четверга
    static int friday = 107476; //код для пятницы
    static int saturday = 1353572; //код для субботы
    static int sunday = 0; //код для воскресенья
    public static int timeLimit = 8; //продолжительность рабочего дня

    public static void main(String args[]) {
        work(workingTime, 1470098); //понедельник
        work(workingTime, 740573); //четверг
        work(workingTime, 0); //воскресенье
    }
    public static void work(int[] array, int startingDay) {
        int currentDay = 0; //текущий день
        if (startingDay == monday) {
            currentDay = 1;
        } else if (startingDay == tuesday) {
            currentDay = 2;
        } else if (startingDay == wednesday) {
            currentDay = 3;
        } else if (startingDay == thursday) {
            currentDay = 4;
        } else if (startingDay == friday) {
            currentDay = 5;
        } else if (startingDay == saturday) {
            currentDay = 6;
        } else if (startingDay == sunday) {
            currentDay = 7;
        }
        int sum = 0;
        System.out.println(" день начала отсчета " + currentDay);
        for (int i = 0; i < array.length; i++) {
            if (currentDay == 6 || currentDay == 7) { //если текущий день суббота или воскресенье
                sum = sum + array[i]; //накапливаем сумму переработок
                System.out.println((i + 1) + " было отработано " + array[i] + " ч. переработка в выходной день - " + array[i] + " ч.");
            } else {
                sum = sum + array[i] - timeLimit; //накапливаем сумму переработок за вычетом норматива продолжительности раб. дня
                System.out.println((i + 1) + " было отработано " + array[i] + " ч. переработка в будний день - " + (array[i] - timeLimit) + " ч.");
            }
            currentDay++;
            if (currentDay > 7) {
                currentDay = 1;
            }
        }
        System.out.println("всего переработка - " + sum + " ч.");
    }
}
