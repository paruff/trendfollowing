package org.llap.trendfollowing.notice;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class stock {
	private BigDecimal price;
	private BigDecimal change;
	private BigDecimal peg;
	private BigDecimal dividend;
	private Stock stock;

	public static void main(String[] args) throws IOException {
		System.out.println("Hello World!"); // Display the string.

		stock s=new stock();
	      s.getStock();
	}
	   public void getStock() throws IOException
	   {
			Stock stock = YahooFinance.get("INTC");

			price = stock.getQuote().getPrice();
			change = stock.getQuote().getChangeInPercent();
			peg = stock.getStats().getPeg();
			dividend = stock.getDividend().getAnnualYieldPercent();
			
			stock.print();
	   }
}
