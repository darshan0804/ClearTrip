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
public class Bookinggpage {

	public WebDriver driver;
	public Bookinggpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(name = "insuranceConfirm")
	private WebElement checkBoxBTN;
	
	@FindBy(id = "itineraryBtn")
	private WebElement ContinueBokkingBTN;
	
	@FindBy(id = "username")
	private WebElement EmailSearchBOX;
	
	@FindBy(id = "LoginContinueBtn_1")
	private WebElement ContineBTN;
	
	@FindBy(id = "AdultTitle1")
	private WebElement title1select;
	
	@FindBy(id = "AdultTitle2")
	private WebElement title2select;
	
	@FindBy(id = "AdultFname1")
	private WebElement FirstnameBOX;
	
	@FindBy(id = "AdultFname2")
	private WebElement SecondnameBOX;
	
	@FindBy(id = "mobileNumber")
	private WebElement MoblieBox;
	
	@FindBy(id = "AdultLname1")
	private WebElement LastNameBOX1;
	
	@FindBy(id = "AdultLname2")
	private WebElement LastNameBOX2;
	
	
	
	public WebElement getLastNameBOX1() {
		return LastNameBOX1;
	}

	public WebElement getLastNameBOX2() {
		return LastNameBOX2;
	}

	public WebElement getTitle1select() {
		return title1select;
	}

	public WebElement getTitle2select() {
		return title2select;
	}

	public WebElement getFirstnameBOX() {
		return FirstnameBOX;
	}

	public WebElement getSecondnameBOX() {
		return SecondnameBOX;
	}

	public WebElement getMoblieBox() {
		return MoblieBox;
	}

	public WebElement getTravallerBTN() {
		return TravallerBTN;
	}


	@FindBy(id = "travellerBtn")
	private WebElement TravallerBTN;
	
	
	public WebElement getCheckBoxBTN() {
		return checkBoxBTN;
	}

	public WebElement getContinueBokkingBTN() {
		return ContinueBokkingBTN;
	}
	public WebElement getEmailSearchBOX() {
		return EmailSearchBOX;
	}

	public WebElement getContineBTN() {
		return ContineBTN;
	}


	
	
	
	
}
