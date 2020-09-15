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
public class Paymentpage {

	
	public WebDriver driver;
	public Paymentpage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Net Banking")
	private WebElement NetBankingBTN;
	
	public WebElement getNetBankingBTN() {
		return NetBankingBTN;
	}

	public WebElement getKotakBankBTN() {
		return KotakBankBTN;
	}

	@FindBy(id = "kotak_bank")
	private WebElement KotakBankBTN;
	
	@FindBy(id = "paymentSubmit")
	private WebElement MakePaymentBTN;
	
	public WebElement getMakePaymentBTN() {
		return MakePaymentBTN;
	}
	
	
	
}
