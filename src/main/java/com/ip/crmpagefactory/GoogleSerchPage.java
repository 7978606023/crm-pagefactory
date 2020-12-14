package com.ip.crmpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSerchPage {

	WebDriver driver;

	public GoogleSerchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "q")
	WebElement searchBox;
	@FindBy(how = How.NAME, using = "btnK")
	WebElement submit;

	public void title() {
		String getTitle = driver.getTitle();
		System.out.println("Title of Homepage: " + getTitle);
	}

	public void search() {
		searchBox.sendKeys("Selenium");
	}

	public void submit() {
		submit.click();
	}
}
