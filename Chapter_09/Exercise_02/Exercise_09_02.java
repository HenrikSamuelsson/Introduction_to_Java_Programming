/**
 * Exercise 9.2 from the book Introduction to Java Programming (10th).
 * <p>
 * The Stock class
 * <p>
 * A class that handle stocks, with for example name and price of the stock.
 */
public class Exercise_09_02 {
	public static void main(String[] args) {
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.setPreviousClosingPrice(34.5);

		// Set current price
		stock.setCurrentPrice(34.35);

		// Display stock info
		System.out.println("Previous Closing Price: "
				+ stock.getPreviousClosingPrice());
		System.out.println("Current Price: " + stock.getCurrentPrice());
		System.out.println("Price Change: " + stock.getChangePercent() * 100
				+ "%");
	}
}

class Stock {
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	public Stock() {
	}

	public Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}

	public double getChangePercent() {
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}

	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}

	public double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(double newCurrentPrice) {
		currentPrice = newCurrentPrice;
	}

	public void setPreviousClosingPrice(double newPreviousClosingPrice) {
		previousClosingPrice = newPreviousClosingPrice;
	}
}
