package stockanalysis.controller;

import stockanalysis.model.StockModel;
import stockanalysis.view.View;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StockController {
	private StockModel stockModel;
	private View view;
	private StockModelBuilder stockModelBuilder = new StockModelBuilder();
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private Scanner input = new Scanner(System.in);

	public StockController(View view) {
		this.view = view;
		this.view.setModel(this.stockModel);
	}

	public void initStart() {
		System.out.print("Enter start date (yyyy-MM-dd): ");
		String startStr = input.nextLine();
		this.stockModelBuilder = this.stockModelBuilder.setStart(
				LocalDateTime.parse(startStr, formatter));
		this.stockModel = this.stockModelBuilder.build();
	}

	public void initEnd() {
		System.out.print("Enter end date (yyyy-MM-dd): ");
		String endStr = input.nextLine();
		this.stockModelBuilder = this.stockModelBuilder.setEnd(
				LocalDateTime.parse(endStr, formatter));
		this.stockModel = this.stockModelBuilder.build();
	}

	public void initSharePrices() {
		System.out.print("Enter share prices (price_1,price_2,...,price_n): ");
		String sharePricesStr = input.nextLine();
		String[] sharePricesStrArr = sharePricesStr.split(",");
		double[] sharePricesArr = Arrays.stream(sharePricesStrArr)
				.mapToDouble(Double::parseDouble)
				.toArray();
		ArrayList<String> sharePricesLst = new ArrayList<>(Arrays.asList(sharePricesArr));
		this.stockModelBuilder = this.stockModelBuilder.setSharePrices(
				sharePricesLst);
		this.stockModel = this.stockModelBuilder.build();
	}

	public void setStart() {
		System.out.print("Enter start date (yyyy-MM-dd): ");
		String startStr = input.nextLine();
		this.stockModel.setStart(LocalDateTime.parse(startStr, this.formatter));
	}

	public void setEnd() {
		System.out.print("Enter end date (yyyy-MM-dd): ");
		String endStr = input.nextLine();
		this.stockModel.setEnd(LocalDateTime.parse(endStr, this.formatter));
	}
}
