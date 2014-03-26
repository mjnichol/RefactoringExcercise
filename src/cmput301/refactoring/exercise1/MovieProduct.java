package cmput301.refactoring.exercise1;

/*Movie turned into a GodClass, so we introduced MovieProduct to break up responsibilities */
public class MovieProduct {
	private PriceCode _priceCode;

	public PriceCode get_priceCode() {
		return _priceCode;
	}

	public void set_priceCode(PriceCode _priceCode) {
		this._priceCode = _priceCode;
	}

	public double getCharge(Rental rental) {
		double result = 0;
		result = rental.getPriceCodeObject()
				.getCharge(result, rental);
		return result;
	}
}