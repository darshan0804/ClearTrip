package com.autodisk.genriclibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Darshan M R
 *
 */
public class Baseclass {
	public WebDriver driver;
	public FileLib file=new FileLib();
	public WebDriverUtils web = new WebDriverUtils();
	
	
	@BeforeClass
	public void LunchBrowser() throws Throwable {

		
		
		String BROWSER = file.getDataFromPropertie("browser");
		
		if(BROWSER.equals("chrome"))
		{
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--disable-notifications");
			 driver = new ChromeDriver(options);
			
		}else if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}

	
				
	}
	
	@BeforeMethod
	public void conformbm() throws Throwable {
	
	
	String URL = file.getDataFromPropertie("url");
	web.Timeout(driver);
	
	driver.get(URL);
	
	
	
		
		
	}
	@AfterMethod
	public void closebm() {
		
		
	}
			
			
		
	
	
	@AfterClass
	public void closebrowser() {
		
		//driver.close();
	}
	
	
	
}
