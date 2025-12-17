import java.util.Observer;
import java.util.Observable;

public class Auctioneer implements Observer {
	public void update(Observable o, Object obj) {
		System.out.println("Auctioneer: Going once, going twice...");
	}
}
