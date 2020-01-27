package com.publicept;

/**
 * EnhancedPlayer
 * EnhancedPlayer(String name, int health, String weapon)
 *
 * loseHealth(int damage)
 * getHealth()
 */
public class EnhancedPlayer {

	// == fields ==
	/*
	 * private
	 * not accessible to any class outside
	 */
	private String name;
	private int health = 0;
	private String weapon;



	// == constructors ==
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;

		if(this.health >= 0 && health <= 100) {
			this.health = health;
		}

		this.weapon = weapon;
	}



	// == public methods ==
	public void loseHealth(int damage) {
		this.health -= damage;
		if(this.health <= 0) {
			System.out.println("player knocked out");
			// reduce number of lives remaining from the player
		}
	}

	public int getHealth() {
		return health;
	}
}
