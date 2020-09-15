package com.autodisk.flighttest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.autodisk.genriclibrary.Baseclass;
import com.autodisk.genriclibrary.ExcelLib;
import com.autodisk.genriclibrary.WebDriverUtils;
import com.autodisk.objectrepository.Bookinggpage;
import com.autodisk.objectrepository.ClearTrippage;
import com.autodisk.objectrepository.Flightspage;
import com.autodisk.objectrepository.Paymentpage;
/**
 * 
 * @author Darshan M R
 *
 */
public class FlightsTest extends Baseclass {

	@Test
	public void BookFligts() throws Throwable, Throwable
	{
				
		//navigate to home page
		
	WebDriverUtils webut = new WebDriverUtils();
	
	//navigate to flight page
	Flightspage flp = new Flightspage(driver);
		
		flp.getRoundradioBTN().click();
		
		flp.EnterValues("Mumbai", "Delhi");
			
		webut.Explicitwait(driver, flp.getDepartdateBTN(), 20);
			
		webut.selectclanderbyJs(driver, flp.getDepartdateBTN(),"20/09/2020");
		
		webut.selectclanderbyJs(driver, flp.getReturndateBTN(),"26/09/2020");
		
		//select adult

		webut.selectdropdownByID(flp.getAdultsBTN(), 1);
		
		//click on searchbuton
		flp.getSearchButton().click();
		
		//selet the flight
		ClearTrippage clt = new ClearTrippage(driver);
	
		clt.getNonStopBTN().click();
	
		clt.Departuresetting(2);
		clt.Departuresettingforretrn(2);
	
	
		clt.getBookBTN().click();
		//navigate to BookingPage
	
	
		webut.switchToNewTab(driver, "Cleartrip | Book your flight securely in simple steps");
	
		Bookinggpage book = new Bookinggpage(driver);
	
		book.getCheckBoxBTN().click();
		book.getContinueBokkingBTN().click();
		book.getEmailSearchBOX().sendKeys("verve@sample.com");
		book.getContineBTN().click();
	
		//read data from excel
	
		webut.Explicitwait(driver, book.getTitle1select(), 20);
		webut.selectdropdownByText(book.getTitle1select(), "Mr");
		webut.selectdropdownByText(book.getTitle2select(), "Mr");
	
			
	
			ExcelLib exlib = new ExcelLib();
			
			String ab = exlib.GetDataFromExcel("Data", 1, 1);
			book.getFirstnameBOX().sendKeys(ab);
			
			String xy = exlib.GetDataFromExcel("Data", 1, 4);
			book.getLastNameBOX1().sendKeys(xy);
			
			String cd = exlib.GetDataFromExcel("Data", 1, 2);
			book.getSecondnameBOX().sendKeys(cd);
			
			String zy = exlib.GetDataFromExcel("Data", 1, 5);
			book.getLastNameBOX2().sendKeys(zy);
			
			String ef = exlib.GetDataFromExcel("Data", 1, 3);
			book.getMoblieBox().sendKeys(ef);
			
			book.getTravallerBTN().click();
			
			
			//navigate to payment page
			Paymentpage pay = new Paymentpage(driver);
			//webut.Explicitwait(driver, pay.getNetBankingBTN(), 20);
			pay.getNetBankingBTN().click();
			pay.getKotakBankBTN().click();
		
			pay.getMakePaymentBTN().click();
			
			
			//navigate to kotakpaymentpage
			
		webut.ExplicitwaitForTitle(driver, "Kotak", 60);
		
		Assert.assertTrue(driver.getTitle().contains("Kotak"));
			
			
		System.out.println(driver.getTitle());
			
			
			
				
			
			
		
		
		
	}
	
	
	
}
