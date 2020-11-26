package org.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	
	public WebDriver chromeLaunch() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mukesh\\eclipse-workspace\\CucumberAdactive\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		

	}
	public void implicitWai() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}
	public void url(String s) {
		driver.get(s);
		implicitWai();

	}
	public void sendkeys(WebElement e,String s) {
		e.sendKeys(s);

	}
	public void buttonClick(WebElement e) {
		e.click();

	}
	
	

	public void selectByVisibletext(WebElement e, String txt) {
		Select s = new Select(e);
		s.selectByVisibleText(txt);

	}
	
	public String attributeValue(WebElement w) {
		String val = w.getAttribute("value");
		return val;
	}

}
