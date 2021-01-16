package com.TestCase;

import org.testng.annotations.Test;

import com.PageObject.HomePage;
import com.PageObject.SignUp;
import com.PageObject.keyword;

public class TC_01 {

	@Test
	public void Execute()
	{
		keyword.openBrowser();
		keyword.openUrl();
		
		SignUp sign = new SignUp();
		sign.clkResister();
		
		HomePage home = new HomePage();
		home.enterName("Sagar");
		home.enterMidleName("Dattatray");
		
	}
}
