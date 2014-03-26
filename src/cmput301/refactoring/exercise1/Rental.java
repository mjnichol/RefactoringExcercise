package cmput301.refactoring.exercise1;

public class Rental {
	/**
	 * @uml.property  name="_movie"
	 * @uml.associationEnd  multiplicity="(1 1)"
	 */
	private Movie _movie;
	/**
	 * @uml.property  name="_daysRented"
	 */
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

	/* getCharge method added to remove feature envy */
	public double getCharge() {
		return _movie.getCharge(this);
	}

	public PriceCode getPriceCodeObject() {
		return this._movie.getPriceCode();
	}
}
