package stockanalysis.model;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class StockModel extends Publisher {
	private ArrayList<double> sharePrices = new ArrayList<double>();
	private LocalDateTime start;
	private LocalDateTime end;

	public StockModel(LocalDateTime start, LocalDateTime end, ArrayList<double> sharePrices) {
		this.sharePrices = sharePrices;
		this.start = start;
		this.end = end;
	}

	public LocalDateTime getStart() {
		return this.start;
	}

	public LocalDateTime getEnd() {
		return this.end;
	}

	public ArrayList<double> getSharePrices() {
		return this.sharePrices;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public void setSharePrices(ArrayList<double> sharePrices) {
		this.sharePrices = sharePrices;
	}
}
