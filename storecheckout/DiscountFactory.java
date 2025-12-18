public class DiscountFactory {
	public DiscountStrategy create(int choice) {
		if (choice == 1) {
			return new SeasonalSaleDiscountStrategy();
		} else if (choice == 2) {
			return new LoyaltyMemberDiscountStrategy();
		} else {
			return new NoDiscountDiscountStrategy();
		}
	}
}
