package Arrays;

public class BigWork_14_and_15 {
    //  работа учитываается только в рабочие дни, если выходной то это полностью переработка
    static int[] workingTime = {8, 10, 9, 10, 8, 12, 14, 9};

    public static int timeLimit = 8; //  продолжительность рабочего дня

    public static void main(String args[]) {
        work(workingTime); //понедельник
    }

    public static void work(int[] array) {
        int currentDay = 1; //текущий день
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (currentDay == 6 || currentDay == 7) {
                sum += array[i];
                System.out.println(dayOfWeek(currentDay) + " было отработано " + array[i] + " ч. переработка в выходной день - " + array[i] + " ч.");
            } else {
                sum = sum + (array[i] - timeLimit);
                System.out.println(dayOfWeek(currentDay) + " было отработано " + array[i] + " ч. переработка в будний день - " + (array[i] - timeLimit) + " ч.");
            }
            currentDay++;
            if (currentDay > 7) {
                currentDay = 1;
            }
        }
        System.out.println("всего переработка - " + sum + " ч.");
    }

    public static String dayOfWeek(int numberOfDay) {
        if (numberOfDay == 1) return "понедельник ";
        else if (numberOfDay == 2) return "вторник ";
        else if (numberOfDay == 3) return "среда ";
        else if (numberOfDay == 4) return "четверг ";
        else if (numberOfDay == 5) return "пятница ";
        else if (numberOfDay == 6) return "суббота ";
        else return "воскресенье ";
    }
}
