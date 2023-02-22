package com.feb.drivers;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IE extends DriverManager{

	@Override
	public WebDriver CreateDriver() {
		WebDriverManager.iedriver().setup();
		return this.CreateDriver();
	}

}
