package cmput301.refactoring.exercise1;


public abstract class PriceCode {
	public abstract double getCharge(double result, Rental rental);

	public abstract int frequentRenterPoints(int frequentRenterPoints,
			Rental each);
}