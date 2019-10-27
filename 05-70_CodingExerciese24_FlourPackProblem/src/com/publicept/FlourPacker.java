package com.publicept;

public class FlourPacker {

	private static final int BIG_COUNT_WEIGHT = 5;
	private static final int SMALL_CONT_WEIGHT = 1;

	public static boolean canPack(int bigCount, int smallCount, int goal) {

		if(bigCount * BIG_COUNT_WEIGHT + smallCount * SMALL_CONT_WEIGHT < goal) return false;

		int	remainingGoalWeight = goal;
		int remainingBigCount = bigCount;
		int remainingSmallCount = smallCount;
		int deliverBigCountNumber = 0;
		int deliverSmallCountNumber = 0;

		while (remainingGoalWeight > 0) {
			
			while (remainingBigCount > 0 && remainingGoalWeight >= 5) {
				System.out.println("remaining big count: " + remainingBigCount);
				System.out.println("delivery big count number: " + deliverBigCountNumber);
				System.out.println("remaining goal weight: " + remainingGoalWeight);
				remainingBigCount--;
				remainingGoalWeight -= 5;
				deliverBigCountNumber++;
				System.out.println("remaining big count: " + remainingBigCount);
				System.out.println("delivery big count number: " + deliverBigCountNumber);
				System.out.println("remaining goal weight: " + remainingGoalWeight);
				if(remainingGoalWeight == 0) {
					return true;
				}
			}
			
			while (remainingSmallCount > 0 && remainingGoalWeight > 0) {
				System.out.println("remaining small count: " + remainingSmallCount);
				System.out.println("delivery small count number: " + deliverSmallCountNumber);
				System.out.println("remaining goal weight: " + remainingGoalWeight);
				remainingSmallCount--;
				deliverSmallCountNumber++;
				remainingGoalWeight--;
				System.out.println("remaining small count: " + remainingSmallCount);
				System.out.println("delivery small count number: " + deliverSmallCountNumber);
				System.out.println("remaining goal weight: " + remainingGoalWeight);
				if(remainingGoalWeight == 0) {
					return true;
				}
			}
			break;
		}
		return false;
	}
}
