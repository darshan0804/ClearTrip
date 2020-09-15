package com.autodisk.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Darshan M R
 *
 */
public class Homepage {
	public WebDriver driver;
	
public Homepage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

}
	
	@FindBy(id = "flashSaleEl-air")
	private WebElement flightsBtn;

	
	
	public WebElement getFlightsBtn() {
		return flightsBtn;
	}
	
	
	
	
	
}
