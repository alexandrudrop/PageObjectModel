package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class RomansPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public RomansPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public By searchIcon = By.cssSelector("button[title='Open search']");
	public By searchInput = By.cssSelector("div[class='content_wrap'] input[class='search_field']");
	
	public void search(String value) {
		
		click(searchIcon);
		sendKeys(searchInput, value);
		click(searchIcon);
	}

	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
