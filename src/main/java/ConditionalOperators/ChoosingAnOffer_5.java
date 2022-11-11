package ConditionalOperators;

public class ChoosingAnOffer_5 {

    public static void main(String args[]) {
        bestWork(30000, 2, 20000, 4);
        bestWork(15000, 2, 25000, 4);
        bestWork(39500, 2, 40000, 4);
    }

    public static void bestWork(int compensation1, int travelTime1, int compensation2, int travelTime2) {
        int timeWorkedPerMonth = 168; //количество отработанных часов в месяц
        int payForHour1 = compensation1 / (travelTime1 + timeWorkedPerMonth); //оплата за час работы вариант 1
        System.out.println("плата за час при 1 варианте " + payForHour1);
        int payForHour2 = compensation2 / (travelTime2 + timeWorkedPerMonth); //оплата за час работы вариант 2
        System.out.println("плата за час при 2 варианте " + payForHour2);
        if (payForHour1 > payForHour2) {
            System.out.println("Выгоднее выбрать варинат 1");
        } else if (payForHour1 < payForHour2) {
            System.out.println("Выгоднее выбрать варинат 2");
        } else System.out.println("Одинаково");
    }
}
