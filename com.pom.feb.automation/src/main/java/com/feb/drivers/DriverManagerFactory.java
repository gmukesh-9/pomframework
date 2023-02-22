package com.feb.drivers;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverTypes browser) {
		DriverManager driverManager;
		switch(browser) {
		case CHROME:
			driverManager = new ChromeDriverManager();
			break;
		case FIREFOX:
			driverManager = new FirefoxDriverManager();
			break;
		//case IE:
			//driverManager = new IE();
			//break;
		default:
			driverManager = new ChromeDriverManager();
			break;
		}
		
		return driverManager;
	}
}
