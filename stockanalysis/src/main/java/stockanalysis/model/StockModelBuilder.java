package stockanalysis.model;

import java.util.ArrayList;
import java.time.LocalDateTime;

public class StockModelBuilder {
	private final LocalDateTime start;
	private final LocalDateTime end;
	private final ArrayList<double> sharePrices;

	public StockModelBuilder setStart(LocalDateTime start) {
		this.start = start;
		return this;
	}

	public StockModelBuilder setEnd(LocalDateTime end) {
		this.end = end;
		return this;
	}

	public StockModelBuilder setSharePrices(ArrayList<double> sharePrices) {
		this.sharePrices = sharePrices;
		return this;
	}

	public StockModel build() {
		if (this.start != null && this.end != null && this.sharePrices != null) {
			return new StockModel(this.start, this.end, this.sharePrices);
		}
		return null;
	}
}
