public class NoDiscountDiscountStrategy implements DiscountStrategy {
	public double discount(double original) {
		return original;
	} 
}
