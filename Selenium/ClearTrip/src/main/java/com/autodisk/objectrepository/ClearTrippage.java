package com.autodisk.objectrepository;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Darshan M R
 *
 */
public class ClearTrippage {

	
	public WebDriver driver;
	
	public ClearTrippage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(xpath = "//p[contains(text(),'Non-stop')]")
	private WebElement NonStopBTN;
	
	@FindBy(xpath="//div[contains(@class,'col-12')]/div[contains(@data-test-attrib,'onward-view')]//img[@alt='SpiceJet' or @alt='IndiGo']")
	private List<WebElement> DepartureBTN;
	
	@FindBy(xpath="//div[contains(@class,'col-12')]//div[contains(@data-test-attrib,'return-view')]//img[@alt='SpiceJet' or @alt='GoAir']")
	private List<WebElement> ReturnBTN;
	
	@FindBy(xpath = "//button[text()='Book']")
	private WebElement BookBTN;

	public WebElement getBookBTN() {
		return BookBTN;
	}

	public WebElement getNonStopBTN() {
		return NonStopBTN;
	}

	public List<WebElement> getDepartureBTN() {
		return DepartureBTN;
	}
	public List<WebElement> getReturnBTN() {
		return ReturnBTN;
	}
	
	public void Departuresetting(int num)
	{
		int size=DepartureBTN.size();
		Assert.assertTrue(size>=2);
		if(num<size)
		{
			WebElement select = DepartureBTN.get(num-1);
			select.click();
		}
		
	
	}
	public void Departuresettingforretrn(int num)
	{
		int size=ReturnBTN.size();
		Assert.assertTrue(size>=2);
		if(num<size)
		{
			WebElement select = ReturnBTN.get(num-1);
			select.click();
		}
	
	}
	
}

	
