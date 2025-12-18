public class Pizza {
	private String size;
	private int extraCheese;
	private int pepperoni;
	private int mushrooms;
	private int onions;

	public Pizza(String size, int extraCheese, int pepperoni, int mushrooms, int onions) {
		this.size = size;
		this.extraCheese = extraCheese;
		this.pepperoni = pepperoni;
		this.mushrooms = mushrooms;
		this.onions = onions;
	}

	public String toString() {
		return "Pizza<size=" + this.size + ",extraCheese=" + this.extraCheese +
			",pepperoni=" + this.pepperoni + ",mushrooms=" + this.mushrooms +
			",onions=" + this.onions + ">";
	}
}
