package org.pojo;

import java.sql.Driver;

import org.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "radiobutton_0")
    private WebElement button;
	
	@FindBy (id = "continue")
    private WebElement click;

	public WebElement getButton() {
		return button;
	}

	public WebElement getClick() {
		return click;
	}

}
