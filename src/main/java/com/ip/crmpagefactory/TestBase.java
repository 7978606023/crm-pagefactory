package com.ip.crmpagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {

	static WebDriver driver;
	
	@BeforeTest 
	public void setUp() 
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver = new ChromeDriver(); 
	   driver.manage().window().maximize(); 
	  String url = "https://www.google.com"; 
	  driver.get(url); 
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 } 
	
	@Test(priority = 0) 
	public void googleSearch() 
	{ 
	// Create an object of GoogleSearchPage class. 
	   GoogleSerchPage gs = new GoogleSerchPage(driver); 
	    gs.title();  // Calling title method. 
	    gs.search(); // Calling search method. 
	    gs.submit(); // Calling submit method. 
	 } 
	@AfterTest
	public void closing() 
	{ 
	  TestBase.driver.quit(); 
	 } 
}
