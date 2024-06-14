package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By sortingList = By.name("orderby");
	public By cookbooksLink = By.linkText("Cookbooks");
	public By aHundredAndOneRecepiesBook = By.xpath
			("//a[@class='hover_icon hover_icon_link' and @href='https://keybooks.ro/shop/a-hundred-and-one-receipes/']/span");
	public By cookingWithLoveBook = By.xpath
			("//a[@class='hover_icon hover_icon_link' and @href='https://keybooks.ro/shop/cooking-with-love/']/span");
	public By healthyLifestyleBook = By.xpath
			("//a[@class='hover_icon hover_icon_link' and @href='https://keybooks.ro/shop/healthy-lifestyle/']/span");
	public By theVeganCookeryBook = By.xpath
			("//a[@class='hover_icon hover_icon_link' and @href='https://keybooks.ro/shop/the-vegan-cookery/']");
	public By ultimateBookOfRecipesBook = By.xpath
			("//a[@class='hover_icon hover_icon_link' and @href='https://keybooks.ro/shop/ultimate-book-of-receipes/']/span");
	public By ultimateBookOfRecipesPrice = By.xpath
			("//li[contains(@class, 'post-1705')]/descendant::ins");
	public By stormPrice = By.xpath
			("//li[contains(@class, 'post-256')]/descendant::span[@class='woocommerce-Price-amount amount']");
	public By filterSliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
	public By filterSliderFinalPosition = By.cssSelector("span[style='left: 100%;']");
	
	
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public void selectByVisibleText(String value) {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public String getSelectedOption() {
		WebElement element = driver.findElement(sortingList);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}
	
	public String checkIfAHundredAndOneRecepiesBookIsOnSale(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkIfCookingWithLoveBookIsOnSale(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkIfHealthyLifestyleBookIsOnSale(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkIfTheVeganCookeryBookIsOnSale(By locator) {
	        return driver.findElement(locator).getText();
	}
	
	public String checkIfUltimateBookOfRecipesBookIsOnSale(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkThePriceOfUltimateBookOfRecipes(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkThePriceOfStorm(By locator) {
		return driver.findElement(locator).getText();
	}
}
