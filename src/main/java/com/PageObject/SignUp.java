package com.PageObject;

import org.openqa.selenium.By;

public class SignUp {
	
	static By Resister = By.xpath("//a[contains(text(),'Registration')]");

	public  void clkResister()
	{
		keyword.driver.findElement(Resister).click();
	}
}
