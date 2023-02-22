package com.feb.drivers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverManager extends DriverManager{

	@Override
	public WebDriver CreateDriver() {
		WebDriverManager.firefoxdriver().setup();
		return this.CreateDriver();
	}

}
