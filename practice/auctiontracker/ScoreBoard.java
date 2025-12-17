import java.util.Observer;
import java.util.Observable;

public class ScoreBoard implements Observer {
	public void update(Observable o, Object obj) {
		System.out.println("Scoreboard: " + (double)obj);
	}
}
