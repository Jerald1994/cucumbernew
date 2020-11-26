package org.simplemodifiedpojo;

import org.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orderNo extends BaseClass {
	
	public orderNo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "order_no")
	private WebElement id;

	public WebElement getId() {
		return id;
	}
	
	public void printOrder() {
		WebElement e = driver.findElement(By.id("order_no"));
		String str = e.getAttribute("value");
		System.out.println(str);
		
	}
	
	
}
