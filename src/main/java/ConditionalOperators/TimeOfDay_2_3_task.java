package ConditionalOperators;

public class TimeOfDay_2_3_4_task {

    public static void main(String args[]) {

//  значения в середине диапазона
        timeOfDay(3);
        timeOfDay(8);
        timeOfDay(15);
        timeOfDay(22);
//  Граничные значения
        timeOfDay(0);
        timeOfDay(6);
        timeOfDay(12);
        timeOfDay(18);
        timeOfDay(23);
//   Негативные проверки
        timeOfDay(24);
        timeOfDay(-1);
        timeOfDay(25);
    }

    public static void timeOfDay(double hour) {
        if (hour >= 0 && hour < 6) {
            System.out.println("Если время на часах "+ hour + " это Ночь");

        } else if (hour >= 6 && hour < 12) {
            System.out.println("Если время на часах "+ hour + " это Утро");

        } else if(hour >= 12 && hour < 18) {
            System.out.println("Если время на часах "+ hour + " это День");

        } else if(hour >= 18 && hour < 24) {
            System.out.println("Если время на часах "+ hour + " это Вечер");

        } else if (hour < 0) {
            System.out.println("Время суток нужно ввести правильно. Допустимые значения [0-23]");
        } else if (hour > 24) {
            System.out.println("Пользователю следует вернуться с другой планеты на Землю. Допустимые значения [0-23]");
        }
    }

}
