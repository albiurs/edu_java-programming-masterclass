public class Main {

    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {

        double valueOne = 3.175d;
        double valueTwo = 3.175d;

        boolean areEqualByThreeDecimalPlaces = DecimalComparator.areEqualByThreeDecimalPlaces(valueOne, valueTwo);
        System.out.println("Are the values equal by three decimal places?");
        System.out.println(areEqualByThreeDecimalPlaces);

    }
}


/**
 * DecimalComparator
 *
 * areEqualByThreeDecimalPlaces(double valueOne, double valueTwo)
 */
class DecimalComparator {

    /**
     * areEqualByThreeDecimalPlaces()
     * Check if two double numbers are the same up to three decimal places.
     * @param valueOne double one
     * @param valueTwo double two
     * @return valueOne and valueTwo are the same up to three decimal places (true) or not (false)
     */
    public static boolean areEqualByThreeDecimalPlaces(double valueOne, double valueTwo) {

        valueOne = valueOne * 1000; // double
        valueTwo = valueTwo * 1000; // double

        int valueOneInt = (int) (valueOne); // (cast to int)
        int valueTwoInt = (int) (valueTwo); // (cast to int)

        return valueOneInt == valueTwoInt; // return true if equal
    }
}
