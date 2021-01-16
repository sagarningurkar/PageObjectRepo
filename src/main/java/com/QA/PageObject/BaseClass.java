package com.QA.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void openBrowser()
	{
	WebDriverManager.chromedriver().setup();
	driver  = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public static void openUrl()
	{
		driver.get("http://demo.automationtesting.in/Register.html");
	}

}
