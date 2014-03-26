package cmput301.refactoring.exercise3;

public class Movie {
	
	private String _title;
	private PriceCode _priceCode;
	public Movie(String title, PriceCode priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public PriceCode getPriceCode() {
		return this._priceCode;
	}
	
	public void setPriceCode(PriceCode pCode) {
		this._priceCode = pCode;
	}
	
	public String getTitle() {
		return _title;
	}

	public double getCharge(int _daysRented) {
		return _priceCode.getCharge(_daysRented);
	}

	public int getFrequentRenterPoints(int _daysRented) {
	    //add bonus for a two day new release rental
	    if((getPriceCode() instanceof NewRelease) && _daysRented > 1)
	          return 2;
	    else
	          return 1;
	}
}
