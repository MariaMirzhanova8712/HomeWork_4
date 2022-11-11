package ConditionalOperators;

public class ControlOnAttraction_6 {
    public static void main(String[] args) {
        admissionToAttraction(true, false); //подросток старше 15 лет, ростом выше 160 см, без родителей (да)
        admissionToAttraction(false, true); //подросток младше 15 лет, ростом ниже 160 см, с родителями (да)
        admissionToAttraction(true, true); //подросток старше 15 лет, ростом выше 160 см, с родителями (да)
        admissionToAttraction(false, false); //подросток младше 15 лет, ростом ниже 160 см, без родителей (нет)
    }

    public static void admissionToAttraction(boolean isHeightMoreThen160sm, boolean isWithParents) {
        if (isHeightMoreThen160sm || isWithParents) { //проверяем что хотя бы одно из условий истинно
            System.out.println("на аттракцион можно");
        } else {
            System.out.println("на аттракцион нельзя");
        }
    }
}
