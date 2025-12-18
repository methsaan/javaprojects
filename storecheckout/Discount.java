public class Discount {
	private DiscountStrategy discountStrategy;
	public Discount(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public double discount(double original) {
		return this.discountStrategy.discount(original);
	}
}
