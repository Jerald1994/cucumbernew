package org.pojo;

import org.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends BaseClass {
	
	public BookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "first_name")
    private WebElement name;
	
	@FindBy (id = "last_name")
    private WebElement last;
	
	@FindBy (id = "address")
    private WebElement addres;
	
	@FindBy (id = "cc_num")
    private WebElement cardno;
	
	@FindBy (id = "cc_type")
    private WebElement cardType;
	
	@FindBy (id = "cc_exp_month")
    private WebElement month;
	
	@FindBy (id = "cc_exp_year")
    private WebElement year;
	
	@FindBy (id = "cc_cvv")
    private WebElement cvv;
	
	@FindBy (id = "book_now")
    private WebElement book;

	public WebElement getName() {
		return name;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddres() {
		return addres;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	

}
