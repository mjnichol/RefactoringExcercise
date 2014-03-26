package cmput301.refactoring.exercise3;


public abstract class PriceCode {
	
	public abstract double getCharge(double result, int _daysRented);

	public double getCharge(int _daysRented) {
		double result = 0;
		result = getCharge(result, _daysRented);
		return result;
	}
}