package cmput301.refactoring.exercise1;


/**
 * @see cmput301.refactoring.exercise1.Movie#NEW_RELEASE
 */
public class NewRelease extends PriceCode {
	public double getCharge(double result, Rental rental) {
		result += rental.getDaysRented() * 3;
		return result;
	}

	public int frequentRenterPoints(int frequentRenterPoints, Rental each) {
		if (each.getDaysRented() > 1) {
			frequentRenterPoints += 2;
		}
		return frequentRenterPoints;
	}
}