package com.publicept.pc_hasAFactory;

/**
 * PC
 * PC(Case theCase, Monitor monitor, Motherboard motherboard)
 *
 * getTheCase()
 * getMonitor()
 * getMotherboard()
 */
public class PC {



	// == fields ==
	/*
	 * Composition:
	 * -> hasA relationship!
	 */
	private Case theCase;

	private Monitor monitor;
	private Motherboard motherboard;



	// == constructors ==
	public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}



	// == getters ==
	/**
	 * getTheCase()
	 * @return the case
	 */
	public Case getTheCase() {
		return theCase;
	}

	/**
	 * getMonitor()
	 * @return the monitor
	 */
	public Monitor getMonitor() {
		return monitor;
	}

	/**
	 * getMotherboard()
	 * @return the motherboard
	 */
	public Motherboard getMotherboard() {
		return motherboard;
	}
}
