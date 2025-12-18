public class PizzaBuilder {
	private String size;
	private final int extraCheese = 0;
	private final int pepperoni = 0;
	private final int mushrooms = 0;
	private final int onions = 0;

	public PizzaBuilder(String size) {
		this.size = size;
	}

	public PizzaBuilder setExtraCheese(int extraCheese) {
		this.extraCheese = extraCheese;
		return this;
	}

	public PizzaBuilder setPepperoni(int pepperoni) {
		this.pepperoni = pepperoni;
		return this;
	}

	public PizzaBuilder setMushrooms(int mushrooms) {
		this.mushrooms = mushrooms;
		return this;
	}

	public PizzaBuilder setOnions(int onions) {
		this.onions = onions;
		return this;
	}

	public Pizza build() {
		return new Pizza(this.size, this.extraCheese, this.pepperoni,
				this.mushrooms, this.onions);
	} 
}
