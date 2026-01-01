package stockanalysis.controller;

import stockanalysis.model.StockModel;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StockController {
	private StockModel stockModel;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private Scanner input = new Scanner(System.in);

	public void initStock() {
		StockModelBuilder stockModelBuilder = new StockModelBuilder();
		System.out.print("Enter start date (yyyy-MM-dd): ");
		String startStr = input.nextLine();
		stockModelBuilder = stockModelBuilder.setStart(
				LocalDateTime.parse(startStr, formatter));
		System.out.print("Enter end date (yyyy-MM-dd): ");
		String endStr = input.nextLine();
		stockModelBuilder = stockModelBuilder.setEnd(
				LocalDateTime.parse(endStr, formatter));
		System.out.print("Enter share prices (price_1,price_2,...,price_n): ");
		String sharePricesStr = input.nextLine();
		String[] sharePricesStrArr = sharePricesStr.split(",");
		double[] sharePricesArr = Arrays.stream(sharePricesStrArr)
				.mapToDouble(Double::parseDouble)
				.toArray();
		ArrayList<String> sharePricesLst = new ArrayList<>(Arrays.asList(sharePricesArr));
		stockModelBuilder = stockModelBuilder.setSharePrices(
				sharePricesLst);
		this.stockModel = stockModelBuilder.build();
	}

	public void setSetStart() {
		System.out.print("Enter start date (yyyy-MM-dd): ");
		String startStr = input.nextLine();
		this.stockModel.setStart(LocalDateTime.parse(startStr, this.formatter));
	}

	public void setSetEnd() {
		System.out.print("Enter end date (yyyy-MM-dd): ");
		String endStr = input.nextLine();
		this.stockModel.setEnd(LocalDateTime.parse(endStr, this.formatter));
	}
}
