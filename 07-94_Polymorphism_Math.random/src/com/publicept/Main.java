package com.publicept;

/**
 * Main
 * main(String[] args)
 *
 * randomMovie()
 */
public class Main {

	/**
	 * main()
	 * @param args args
	 */
	public static void main(String[] args) {

		/*
		 * Create polymorphic variable "movie", containing different shapes/types (=(sub-)classes) of Movie,
		 * while all of them really are different shapes/types of "Movie".
		 */
		for (int i=0; i<10; i++) {

			Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
					"Plot: " + movie.plot() + "\n");
		}
	}


	/**
	 * randomMovie()
	 * @return random movie
	 */
	public static Movie randomMovie() {

		// Math.random() = returns a random double value between 0 and 1
		int randomNumber = (int) (Math.random() * 6); // generate random number from 0 to 6
		System.out.println("random number generated was: " + randomNumber);

		switch (randomNumber) {
			case 0:
				// ==================================
				// == Super/parent object showcase ==
				// ==================================
				return new Movie("Empty dummy movie");	// showcase of a super/parent object created
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				// ===========================
				// == Polymorphism showcase ==
				// ===========================
				return new Forgettable(); // showcase of a different sub/child Movie object created
			default:
				return null;
		}
	}
}



/**
 * Movie
 * Movie(String name)
 *
 * plot()
 * getName()
 */
class Movie {

	// == fields ==
	private String name;

	// == constructors ==
	public Movie(String name) {
		this.name = name;
	}

	// == public methods ==
	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
}



/**
 * Jaws extends Movie
 * Jaws()
 *
 * plot()
 */
class Jaws extends Movie {

	public Jaws() {
		super("Jaws");
	}

	@Override
	public String plot() {
		return "A shark eats lots of people";
	}
}



/**
 * IndependenceDay extends Movie
 * IndependenceDay()
 *
 * plot()
 */
class IndependenceDay extends Movie {

	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}



/**
 * MazeRunner extends Movie
 * MazeRunner()
 *
 * plot()
 */
class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}



/**
 * StarWars extends Movie
 * StarWars()
 *
 * plot()
 */
class StarWars extends Movie {

	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over the universe";
	}
}



/**
 * Forgettable extends Movie
 * Forgettable()
 *
 * ===========================
 * == Polymorphism showcase ==
 * ===========================
 * super class plot is shown if #5 Forgettable is executed
 */
class Forgettable extends Movie {

	public Forgettable() {
		super("Forgettable");
	}
	// ===========================
	// == Polymorphism showcase ==
	// ===========================
	// No plot method implemented:
	// returns "No plot here" from the super Movie class
}