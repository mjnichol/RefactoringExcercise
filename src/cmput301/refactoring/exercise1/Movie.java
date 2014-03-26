package cmput301.refactoring.exercise1;

public class Movie {
	
	private MovieProduct movieProduct = new MovieProduct();
	
	/**
	 * @uml.property  name="_title"
	 */
	private String _title;
	public Movie(String title, PriceCode priceCode) {
		_title = title;
		movieProduct.set_priceCode(priceCode);
	}
	
	public PriceCode getPriceCode() {
		return movieProduct.get_priceCode();
	}
	
	public void setPriceCode(PriceCode arg) {
		movieProduct.set_priceCode(arg);
	}
	
	public String getTitle() {
		return _title;
	}

	public double getCharge(Rental rental) {
		return movieProduct.getCharge(rental);
	}
}
