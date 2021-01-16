package com.TestCase;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.QA.PageObject.BaseClass;
import com.QA.PageObject.ResisterPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_ResisterQA {
	
	@Test
	public void filUp()
	{
		BaseClass.openBrowser();
		BaseClass.openUrl();
	
		ResisterPage page = new ResisterPage();
		page.enterName("Sagar");

}
}