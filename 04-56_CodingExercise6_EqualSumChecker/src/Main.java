/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int valueOne = 1;
        int valueTwo = 2;
        int valueThree = 3;

        boolean hasEqualSum = EqualSumChecker.hasEqualSum(valueOne, valueTwo, valueThree);

        // valueOne + vlaueTwo = valueThree? -> true
        System.out.println("valueOne + vlaueTwo = valueThree? -> " + hasEqualSum); // 1 + 2 = 3
    }
}


/**
 * EqualSumChecker
 *
 * hasEqualSum(int valueOne, int valueTwo, int valueThree)
 */
class EqualSumChecker {

    /**
     * hasEqualSum()
     *
     * @param valueOne
     * @param valueTwo
     * @param valueThree
     * @return Returns true, if the sum of valueOne + valueTwo is equal to valueThree, otherwise false.
     */
    public static boolean hasEqualSum(int valueOne, int valueTwo, int valueThree) {

        // Returns true, if the sum of valueOne + valueTwo is equal to valueThree, otherwise false.
        if((valueOne + valueTwo) == valueThree) {
            return true;
        }
        return false;
    }
}
