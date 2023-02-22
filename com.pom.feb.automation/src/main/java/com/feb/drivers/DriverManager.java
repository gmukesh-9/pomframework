package com.feb.drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
	public WebDriver driver;
	public abstract WebDriver CreateDriver();
	
	public WebDriver getDriver() {
		return this.CreateDriver();
	}

	public void quitDriver( ) {
		driver.quit();
	}
}
