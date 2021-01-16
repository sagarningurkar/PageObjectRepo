package com.QA.PageObject;

import org.openqa.selenium.By;

public class ResisterPage {
	
	 static By firstName = By.xpath("//input[@placeholder ='First Name']");
	
	
	public static void enterName(String value)
	{
		BaseClass.driver.findElement(firstName).sendKeys("Sagar");
	}

}
