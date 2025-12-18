public class PizzaOrder {
	public static void main(String[] args) {
		PizzaBuilder pizzaBuilder = new PizzaBuilder("Medium");
		Pizza pizza = pizzaBuilder.setExtraCheese(3).setPepperoni(2)
					.setMushrooms(5).setOnions(4).build();
		System.out.println(pizza.toString());
	}
}
