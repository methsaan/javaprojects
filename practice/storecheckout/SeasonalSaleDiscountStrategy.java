public class SeasonalSaleDiscountStrategy implements DiscountStrategy {
	public double discount(double original) {
		return 0.8 * original;
	} 
}
