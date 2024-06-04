package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class MenuPageTema extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public MenuPageTema(WebDriver driver) {
		this.driver =  driver;
	}
	
	public By bookLink = By.linkText("A hundred and one receipes");
	public By searchBtn = By.cssSelector("button[title='Open search']");
	public By searchField = By.cssSelector("div[class='content_wrap'] input[class='search_field']");
	public By king = By.cssSelector("h6 a[href='https://keybooks.ro/shop/the-wicked-king/']");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void searchBook(String name) {
		click(searchBtn);
		
		sendKeys(searchField, name);
		
		click(king);
	}

}
