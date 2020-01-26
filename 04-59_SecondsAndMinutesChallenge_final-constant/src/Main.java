/**
 * Main
 *
 * main()
 * getDurationString(int seconds)
 * getDurationString(int minutes, int seconds)
 */
public class Main {


    // == constants ==
    private static final String INVALID_VALUE_MESSAGE = "Invalid value!"; // define constants with final and UPPERCASE



    // == public methods ==
    /**
     * main()
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(getDurationString(1, 1));
        System.out.println(getDurationString(60000123));
    }


    /**
     * getDurationString()
     * Get duration String from minutes and seconds.
     *
     * @param minutes min
     * @param seconds sec
     * @return duration String in minutes and seconds
     */
    public static String getDurationString(int minutes, int seconds) {

        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            String hourString;
            if(hours <= 9) {
                hourString = "0" + hours;
            } else {
                hourString = "" + hours;
            }

            int remainingMinutes = minutes % 60;
            String minuteString;
            if(remainingMinutes <= 9) {
                minuteString = "0" + remainingMinutes;
            } else {
                minuteString = "" + remainingMinutes;
            }

            String secondString;
            if(seconds <= 9) {
                secondString = "0" + seconds;
            } else {
                secondString = "" + seconds;
            }

            String timeString = hourString + "h " + minuteString + "m " + secondString + "s";
            return timeString;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }


    /**
     * getDurationString()
     * Get duration String from hours, minutes and seconds (1 Param).
     *
     * @param seconds sec
     * @return duration String in hours, minutes and seconds
     */
    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }

}
