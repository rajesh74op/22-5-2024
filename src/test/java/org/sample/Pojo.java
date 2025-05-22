package org.sample;

import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pojo extends Base {

	public Pojo() {
		PageFactory.initElements(driver,this);
}
	@FindBys({
		@FindBy(id = "email1"),
		@FindBy(xpath= " //input[@type='text']")
	})
	private WebElement username;
	@FindAll({
		@FindBy(name="pass1"),
		@FindBy(xpath="//input[@class='inputtext_55r1_61uy_9npi']")
	})
	private WebElement password;
	
	public WebElement getUsername() {
		return username;
	}
	public WebElement getpassword() {
		return password;
		
	}
}
