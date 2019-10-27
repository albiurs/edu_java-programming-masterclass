package com.publicept;

public class Outlander extends Car {

	int roadServiceMonth;

	public Outlander(int roadServiceMonth) {
		super("Outlander", "4WD", 5, 5, 6, false);	// isManual = automatic
		this.roadServiceMonth = roadServiceMonth;
	}

	public void  accelerate(int rate) {		// rate = change in speed
		int	 newVelocity = getCurrentVelocity() + rate;

		if(newVelocity == 0) {
			stop();
			setCurrentGear(1);
		} else if(newVelocity > 0 && newVelocity <= 10) {
			setCurrentGear(1);
		} else if(newVelocity > 10 && newVelocity <= 20) {
			setCurrentGear(2);
		} else if(newVelocity > 20 && newVelocity <= 30) {
			setCurrentGear(3);
		} else if(newVelocity > 30 && newVelocity <= 60) {
			setCurrentGear(4);
		} else if(newVelocity > 60 && newVelocity <= 100) {
			setCurrentGear(5);
		} else  {
			setCurrentGear(5);
		}

		if(newVelocity > 0) {
			setDrive(newVelocity, getCurrentDirection());
		}
	}
}
