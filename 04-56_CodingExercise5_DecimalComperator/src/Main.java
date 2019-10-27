public class Main {

    public static void main(String[] args) {

        double valueOne = 3.175d;
        double valueTwo = 3.175d;

        boolean areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(valueOne, valueTwo);
        System.out.println("Are the values equal by three decimal places?");
        System.out.println(areEqualByThreeDecimalPlaces);

    }
}
