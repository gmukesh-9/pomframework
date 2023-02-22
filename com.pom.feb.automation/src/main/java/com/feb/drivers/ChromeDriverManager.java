package com.feb.drivers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager extends DriverManager{

	@Override
	public WebDriver CreateDriver() {
		WebDriverManager.chromedriver().setup();
		return this.CreateDriver();
	}

}
