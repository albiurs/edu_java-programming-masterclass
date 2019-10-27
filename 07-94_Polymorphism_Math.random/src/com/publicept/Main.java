package com.publicept;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
}

class Jaws extends Movie {
	public Jaws() {
		super("Jaws");
	}

	@Override
	public String plot() {
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie {

	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}

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
 * Polymorphism showcase
 * super class plot is shown if #5 Forgetable is executed
 */
class Forgetable extends Movie {
	public Forgetable() {
		super("Forgetable");
	}

	// No plot method
}

public class Main {

    public static void main(String[] args) {

		/**
		 * Create polymorphic variable "movie", containing different shapes/types (=(sub-)classes) of Movie,
		 * while all of them really are different shapes/types of "Movie".
		 */
		for (int i=0; i<10; i++) {
    		Movie movie = randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
				"Plot: " + movie.plot() + "\n");
		}
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random() * 6);
		System.out.println("random number generated was: " + randomNumber);

		switch (randomNumber) {
			case 0:
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
				return new Forgetable();	// showcase of a different sub/child object created
			default:
				return null;
		}
    }
}
