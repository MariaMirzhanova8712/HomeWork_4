package ConditionalOperators;

public class Greeting_4 {
    public static void main(String[] args) {
        //тестовые примеры
        timeOfDay(7,1); //будний день, утро до 8 утра
        timeOfDay(9,2); //будний день, время после 8 утра
        timeOfDay(12,3); //будний день, время после 11 утра
        timeOfDay(10,6); //выходной день, время до 12 дня
        timeOfDay(14,7); //выходной день, время после 12 дня
        timeOfDay(17,6); //выходной день, время после 16 дня
        timeOfDay(19,6); //выходной день, время после 18 вечера

    }
    public static void timeOfDay(int hour, int dayOfWeek) {
        if ((hour >= 0 && hour < 8) && (dayOfWeek >= 1 && dayOfWeek <= 5)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Доброе утро");
        } else if ((hour >= 8 && hour < 11) && (dayOfWeek >= 1 && dayOfWeek <= 5)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Всё пропало ты проспал!");
        }  else if ((hour >= 11 && hour < 23) && (dayOfWeek >= 1 && dayOfWeek <= 5)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
        } else if ((hour >= 0 && hour < 12) && (dayOfWeek > 5 && dayOfWeek <= 7)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Доброе утро");
        } else if ((hour >= 12 && hour < 16) && (dayOfWeek > 5 && dayOfWeek <= 7)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Лучше поспать ещё");
        } else if ((hour >= 16 && hour < 18) && (dayOfWeek > 5 && dayOfWeek <= 7)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
        } else if ((hour >= 18 && hour < 23) && (dayOfWeek > 5 && dayOfWeek <= 7)) { //проверяем условие, если выполняется, печатаем
            System.out.println("Дааа, с режимом надо что-то делать");
        }
    }
}
