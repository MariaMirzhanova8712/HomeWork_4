package ConditionalOperators;

import java.util.Objects; //импортируем класс Objects для работы с методом equals (сравнение)

public class BattleOfJediAndSith_8 {
    // Ситх Палпатин | ситх Дарт Мол
    String sithName;
    //    Джедай Оби Ван
    String jedyName;
    //    0 на одной высоте, 1 джедай выше, 2 ситх выше
    int whoHigher;

    public static void main(String args[]) {
//        Побеждает джедай
        whoWins("Ситх Дарт Мол", "Джедай Оби Ван", 1); //ситх и джедай с именами, джедай выше
        whoWins("Ситх Дарт Мол", "Джедай Оби Ван", 0); //ситх и джедай с именами, на одной высоте
//        Побеждает ситх
        whoWins("Ситх Дарт Мол", "Джедай Оби Ван", 2); //ситх и джедай с именами, ситх выше
//        Побеждает ситх
        whoWins("Ситх Палпатин", "Джедай Оби Ван", 0); //ситх и джедай с именами, на одной высоте
        whoWins("Ситх Палпатин", "Джедай Оби Ван", 1); //ситх и джедай с именами, джедай выше
        whoWins("Ситх Палпатин", "Джедай Оби Ван", 2); //ситх и джедай с именами, ситх выше
//        Побеждает ситх
        whoWins("Ситх Палпатин", "", 0); //ситх с именем и безымянный джедай, на одной высоте
        whoWins("Ситх Палпатин", "", 1); //ситх с именем и безымянный джедай, джедай выше
        whoWins("Ситх Палпатин", "", 2); //ситх с именем и безымянный джедай, ситх выше
//        Побеждает джедай
        whoWins("", "", 1); // безымянный ситх и безымянный джедай, джедай выше
//        Побеждает ситх
        whoWins("", "", 0); // безымянный ситх и безымянный джедай, на одной высоте
        whoWins("", "", 2); // безымянный ситх и безымянный джедай, ситх выше
    }

    public static void whoWins(String sithName, String jedyName, int whoHigher) {
        String sithNamePrint; //инициализируем строковую переменную куда будем записывать имена ситхов и выводить их на печать
        String jedyNamePrint; //инициализируем строковую переменную куда будем записывать имена джедаев и выводить их на печать
        if (Objects.equals(sithName, "")) { //если имя не задано
            sithNamePrint = "Безымянный ситх"; //записываем в переменную что это безымянный ситх
        } else sithNamePrint = sithName;
        if (Objects.equals(jedyName, "")) {
            jedyNamePrint = "Безымянный джедай";
        } else jedyNamePrint = jedyName;
                                                                                     //метод который "раскодирует" значения 0,1,2 в соответствии с заложенной логикой высоты
        System.out.println("В битве " + sithNamePrint + " против " + jedyNamePrint + whoHigher(whoHigher));
        if (Objects.equals(sithName, "") && Objects.equals(jedyName, "")) { //если выполняется условие безымянности ситхов и джедаев
            if (whoHigher == 0) sithWins(); //если на одной высоте
            if (whoHigher == 2) sithWins(); //если ситх выше
            if (whoHigher == 1) jedyWins(); //если джедай выше
        } else if ("Ситх Палпатин".equals(sithName)) { //если выполняется условие что имя ситха Ситх Палпатин
            sithWins();
        } else if ("Ситх Дарт Мол".equals(sithName) && ("Джедай Оби Ван".equals(jedyName))) { //если выполняется условие что заданы имена ситхов и джедаев
            if (whoHigher == 0) jedyWins();
            if (whoHigher == 2) sithWins();
            if (whoHigher == 1) jedyWins();
        }
        System.out.println("-------------------");
    }

    public static void jedyWins() {
        System.out.println("Джедай побеждает");
    }

    public static void sithWins() {
        System.out.println("Ситх побеждает");
    }

    public static String whoHigher(int whoHigher) { //метод из строки 44
        if (whoHigher == 0) return " оба на равной высоте";
        else if (whoHigher == 1) return " джедай выше";
        else return " ситх выше";
    }
}
