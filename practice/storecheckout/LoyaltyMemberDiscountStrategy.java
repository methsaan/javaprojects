public class LoyaltyMemberDiscountStrategy implements DiscountStrategy {
	public double discount(double original) {
		return original - 15;
	} 
}
