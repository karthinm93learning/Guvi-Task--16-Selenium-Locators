package com.guvi.Tasks16;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); //Maximizing the browser window
		
		driver.get("https://www.google.com/"); //Sending URL need to open
		
		Thread.sleep(3000);
		
		String url = driver.getCurrentUrl(); // Getting page URL
		System.out.println("URL of Current page: "+ url); // Printing Page URL in a string
		
		driver.navigate().refresh(); // Refreshing the page
		
		driver.close(); // Closing the browser
	
	}

}
