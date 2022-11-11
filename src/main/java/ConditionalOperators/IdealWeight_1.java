package ConditionalOperators;

public class IdealWeight_1 {
    static double allowance = 5;

    //Идеальный вес - рост минус 100 и ещё минус 10 процентов +/- 5 кг
    public static void main(String[] args) {
        System.out.println(idealWeight(50, 165));
        System.out.println(idealWeight(70, 180));
        System.out.println(idealWeight(100, 180));
    }

    public static String idealWeight(int weight, int height) {
        double idealWeight = height - 100 - (height - 100) * 0.1; // точка идеального веса
        double idealWeightHigh = idealWeight + allowance;
        double idealWeightLower = idealWeight - allowance;
        if (weight > idealWeightLower && weight < idealWeightHigh) {
            return "при росте " + height + " см, вес " + weight + " кг является идеальным";
        } else return "при росте " + height + " см, вес " + weight + " кг вес не является идеальным";
    }
}




