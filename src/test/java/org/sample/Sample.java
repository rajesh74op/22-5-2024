package org.sample;

import org.openqa.selenium.WebElement;

public class Sample extends Base {
	public static void main(String[] args) {
		getdriver();
		geturl("https://www.facebook.com/");
		maximize();
		
		//POM(class)
		Pojo p = new Pojo();
		WebElement username = p.getUsername();
		WebElement password = p.getpassword();
		
		 //username.sendKeys("raja");
		 driver.navigate().refresh();
	        //username.sendKeys("mypassword");
	        password.sendKeys("124578");
	        
	}

}
