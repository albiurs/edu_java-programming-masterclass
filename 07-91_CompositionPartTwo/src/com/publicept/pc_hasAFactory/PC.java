package com.publicept.pc_hasAFactory;

public class PC {

	/**
	 * Composition:
	 * -> hasA relationship!
	 */
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp() {
		this.theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		// fancy graphics
		this.monitor.drawPixelAt(1200, 50, "yellow");
	}
}
