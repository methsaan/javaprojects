import java.util.Observer;
import java.util.Observable;

public class Bidder implements Observer {
	private double budget;
	private boolean stay = true;

	public Bidder(double budget) {
		this.budget = budget;
	}

	public void update(Observable o, Object obj) {
		if ((double)obj < budget) {
			stay = true;
			System.out.println("Bidder: Staying...");
		} else {
			stay = false;
			System.out.println("Bidder: Leaving...");
		}
	}
	
}
