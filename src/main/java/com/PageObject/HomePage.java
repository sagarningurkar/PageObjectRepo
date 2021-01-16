package com.PageObject;

import org.openqa.selenium.By;

public class HomePage {

	By firstName = By.name("first_name");
	By MiddleName = By.name("middle_name");
	
	public void enterName(String value)
	{
		keyword.driver.findElement(firstName).sendKeys(value);
	}
	
	public void enterMidleName(String value)
	{
		keyword.driver.findElement(MiddleName).sendKeys(value);
	}
}
