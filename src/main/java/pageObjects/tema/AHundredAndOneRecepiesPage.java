package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AHundredAndOneRecepiesPage {
	
	public WebDriver driver;
	
	public AHundredAndOneRecepiesPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	// locatori
	
	public By bookNameField = By.cssSelector("h1[class*='product_title']");
	public By productGalleryBtn = By.cssSelector("a[href='#'][class*='woocommerce-product']");
	public By ratingField = By.cssSelector("div[class*='rating']>div[class='star-rating']");
	public By priceField = By.cssSelector("p[class='price']>ins bdi");
	public By productDetailsField = By.cssSelector("div[class*='product-details']");
	public By productQuantityField = By.cssSelector("div[class='quantity']");
	public By addToCartBtn = By.cssSelector("button[name='add-to-cart']");
	public By categoryField = By.cssSelector("a[href='https://keybooks.ro/product-category/cookbooks/'][rel]");	
	
	//metode
	
	public boolean checkBookNameFieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkProductGalleryBtnIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkRatingFieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkPriceFieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkProductDetailsFieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkProductQuantityFieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkAddToCartBtnIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public boolean checkCategoryFieldIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
}
