import java.util.Scanner;

public class StoreCheckout {
	public static void main(String[] args) {
		DiscountStrategy discountStrategy;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter discount type (1=seasonal sale, 2=loyalty member, 3=no discount): ");
		int choice = input.nextInt();
		discountStrategy = new DiscountFactory().create(choice);
		System.out.print("Enter original amount: ");
		Discount discount = new Discount(discountStrategy);
		double finalAmount = discount.discount(input.nextDouble());
		System.out.println(finalAmount);
	}
}
