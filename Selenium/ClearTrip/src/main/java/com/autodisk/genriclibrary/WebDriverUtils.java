package com.autodisk.genriclibrary;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * 
 * @author Darshan M R
 *
 */
public class WebDriverUtils {
	public WebDriver driver;
	
	public void Timeout(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	
	public void Explicitwait(WebDriver driver,WebElement element,int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	
	public void ExplicitwaitForTitle(WebDriver driver,String pagetitle,long time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.titleContains(pagetitle));
		
		
	}
	
	
	public void selectdropdownByID(WebElement element,int id)
	{
		Select sel = new Select(element);
		sel.selectByIndex(id);
		
		
	}
	
	public void selectdropdownByText(WebElement element,String text)
	{
		Select sel = new Select(element);
		sel.selectByValue(text);
		
		
	}
	
	public void selectclanderbyJs( WebDriver driver,WebElement element,String dateval)
	{
		
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].value='"+dateval+"';", element);
	
		
	}
	public void switchToNewTab(WebDriver driver, String pageTitle) {
		 Set<String> set = driver.getWindowHandles();
		 Iterator<String> it = set.iterator(); 
		 while (it.hasNext()) {
			 String winID = it.next();
			 driver.switchTo().window(winID);
		      String currentPageTitle = driver.getTitle();
		      if(currentPageTitle.contains(pageTitle)) {
		    	  break;
		     }
			
		}
	}
	

			
	
	
}
