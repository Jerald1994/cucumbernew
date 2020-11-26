package org.pojo;

import org.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactiveHome extends BaseClass  {
	
	public AdactiveHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement nam;
	
	@FindBy(id = "password")
	private WebElement pas;
	
	@FindBy(id = "login")
	private WebElement log;

	public WebElement getNam() {
		return nam;
	}

	public WebElement getPas() {
		return pas;
	}

	public WebElement getLog() {
		return log;
	}
	
	public void home(String name,String pass) {
		
		sendkeys(getNam(), name);
		sendkeys(getPas(), pass );
		buttonClick(getLog());
		

	}

}
