package org.sample;

import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	

public static WebDriver driver;

public static void getdriver() {
	driver =new ChromeDriver();
	
}
public static void geturl(String url) {
	driver.get(url);
}
public static void maximize() {
	driver.manage().window().maximize();
	
	
}
}
