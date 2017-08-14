package org.llap.trendfollowing.notice;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NoticeApplicationTests {

	@Test
	public void contextLoads() throws IOException {
		Stock stock = YahooFinance.get("T");
		
		assertEquals("T", stock.getSymbol());
        assertEquals("AT&T Inc.", stock.getName());
        assertEquals("USD", stock.getCurrency());
        assertEquals("NYQ", stock.getStockExchange());
	}

}
