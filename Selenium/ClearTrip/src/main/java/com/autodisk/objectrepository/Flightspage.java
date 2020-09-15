package com.autodisk.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Drashan M R
 *
 */
public class Flightspage {

	public WebDriver driver;
	public Flightspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(id = "FromTag")
	private WebElement FromtagBox;
	
	@FindBy(id = "ToTag")
	private WebElement Totagbox;
	
	@FindBy(xpath = "//strong[text()=\"Round trip\"]")
	private WebElement RoundradioBTN;
	
	public WebElement getRoundradioBTN() {
		return RoundradioBTN;
	}


	@FindBy(id = "DepartDate")
	private WebElement departdateBTN;
	
	@FindBy(id = "ReturnDate")
	private WebElement returndateBTN;
	
	@FindBy(name = "adults")
	private WebElement adultsBTN;
	
	
	@FindBy(id = "SearchBtn")
	private WebElement SearchButton;
	
	
	
	

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getAdultsBTN() {
		return adultsBTN;
	}

	public WebElement getDepartdateBTN() {
		return departdateBTN;
	}

	public WebElement getReturndateBTN() {
		return returndateBTN;
	}

	public WebElement getFromctagBox() {
		return FromtagBox;
	}

	public WebElement getTotagbox() {
		return Totagbox;
	}
	
	public void EnterValues(String fromdata, String todata)
	{
		FromtagBox.sendKeys(fromdata);
		
		Totagbox.sendKeys(todata);
		
		
	}
	
	

	
	
}
