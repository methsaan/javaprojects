import java.util.Scanner;

public class AuctionTracker {
	public static void main(String[] args) {
		Item item = new Item(400);
		Bidder bidder = new Bidder(700);
		ScoreBoard scoreBoard = new ScoreBoard();
		Auctioneer auctioneer = new Auctioneer();
		item.addObserver(scoreBoard);
		item.addObserver(auctioneer);
		item.addObserver(bidder);

		Scanner input = new Scanner(System.in);
		System.out.print("Raise price (y/n)? ");
		if (input.nextLine().equals("y")) {
			item.setPrice(500);
		}

		System.out.print("Raise price (y/n)? ");
		if (input.nextLine().equals("y")) {
			item.setPrice(650);
		}

		System.out.print("Raise price (y/n)? ");
		if (input.nextLine().equals("y")) {
			item.setPrice(800);
		}
	}
}
