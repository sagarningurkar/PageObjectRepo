package com.PageObject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword {
	
public static RemoteWebDriver driver;
	
	
	public static void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	
	public static  void openUrl()
	{
		driver.get("https://tradewithjazz.com/");
	}

}
