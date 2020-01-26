/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        int newScore = Score.calculateScore("Urs", 500);
        System.out.println("New score is " + newScore);
        Score.calculateScore(75);
        Score.calculateScore();


        /**
         * Challenge: Calculation of centimeters from feet and inches
         */
        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >=0 and <=12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimetres
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >=0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm  and one foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.

        double feet = 1.00d;
        double inches = 1.00d;

        double centimeters = CentimetersFromFeet.calcFeetAndInchesToCentimeters(feet, inches);
        if (centimeters < 0.0) {
            System.out.println("invalid parameters");
        }

        inches = 100.00d;
        centimeters = CentimetersFromFeet.calcFeetAndInchesToCentimeters(inches);
        if (centimeters < 0.00) {
            System.out.println("invalid parameters");
        }
    }
}



/**
 * CentimetersFromFeet
 *
 * calcFeetAndInchesToCentimeters(double inches)
 * calcFeetAndInchesToCentimeters(double feet, double inches)
 */
class CentimetersFromFeet {


    /**
     * Calculate centimeters from inches(one param only)
     * @param inches
     * @return
     */
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12; // (cast double to int)
            double remainingInches = (int) inches % 12.00d; // (cast double to int)
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1.00d;
    }


    /**
     * calcFeetAndInchesToCentimeters(two params - overloaded)
     *
     * @param feet feet
     * @param inches inches
     * @return cm
     */
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches < 12)) {
            inches += 12 * feet;
            double  centimeters = 2.54 *inches;
            System.out.println(feet + " ft + " + inches + " in = " + centimeters + " cm");
            return centimeters;
        } else {
            return -1.00d;
        }
    }
}



/**
 * Score
 *
 * calculateScore()
 * calculateScore(int score)
 * calculateScore(String playerName, int score)
 */
class Score {


    /**
     * Calculate Score (2 params)
     * @param playerName
     * @param score
     * @return
     */
    // method signature: "calculateScore(String playerName, int score)" = name and parameters
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }


    /**
     * Calculate Score (1 Param)
     * @param score
     * @return
     */
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }


    /**
     * Calculate Score (no params)
     * @return
     */
    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}


