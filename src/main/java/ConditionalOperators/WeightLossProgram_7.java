package ConditionalOperators;

public class WeightLossProgram_7 {
    public static int caloriesLimit = 1400;
    public static int chocolate = 340;
    public static int porridge = 250;
    public static int lard = 500;


    public static void main(String args[]) {
        System.out.println("Дневной лимит " + caloriesLimit + " ккал." );
        System.out.println("----------------");
        whatToEat(790);
        whatToEat(950);
        whatToEat(1100);
        whatToEat(1300);
    }

    public static void whatToEat(int caloriesConsumed) {
        System.out.println("Уже потреблено калорий: " + caloriesConsumed);
        if (caloriesConsumed + lard <= caloriesLimit) {
            System.out.println("Можно съесть сало калорийностью " + lard);
        } else if (caloriesConsumed + chocolate <= caloriesLimit) {
            System.out.println("Можно съесть шоколадку калорийностью " + chocolate);
        } else if (caloriesConsumed + porridge <= caloriesLimit) {
            System.out.println("Можно съесть кашу калорийностью " + porridge);
        } else System.out.println("Ничего из имеющегося съесть нельзя - будет превышен лимит калорий");
        System.out.println("----------------");
    }
}
