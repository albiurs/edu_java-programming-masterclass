public class TeenNumberChecker {

	public static boolean hasTeen (int valueOne, int valueTwo, int valueThree) {

		return (isTeen(valueOne) || isTeen(valueTwo) || isTeen(valueThree));
	}

	public static boolean isTeen(int value) {
		return (value > 12 && value < 20);
	}
}
