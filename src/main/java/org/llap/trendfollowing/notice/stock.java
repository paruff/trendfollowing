package org.llap.trendfollowing.notice;

import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class stock {
	Stock stock = YahooFinance.get("INTC");
	 
	BigDecimal price = stock.getQuote().getPrice();
	BigDecimal change = stock.getQuote().getChangeInPercent();
	BigDecimal peg = stock.getStats().getPeg();
	BigDecimal dividend = stock.getDividend().getAnnualYieldPercent();
	 
//	stock.print();
}
