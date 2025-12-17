import java.util.Observable;

public class Item extends Observable {
	private double price;

	public Item(double price) {
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
		this.setChanged();
		this.notifyObservers(this.price);
	}
	public double getPrice() {
		return this.price;
	}
}
