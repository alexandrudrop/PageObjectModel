package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class TheWickedKingPage extends SeleniumWrappers{
	
	public WebDriver driver;
	public TheWickedKingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By category = By.cssSelector("div[class='product_meta'] a[href='https://keybooks.ro/product-category/new-releases/']");
	public By productId = By.cssSelector("div[class='product_meta'] span span");
	public By productGalleryBtn = By.cssSelector("a[class='woocommerce-product-gallery__trigger']");
	public By nextArrowBtn = By.cssSelector("button[aria-label='Next (arrow right)']");
	public By theWickedKingImg1 = By.cssSelector("img[class='pswp__img']"
			+ "[src='https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing1.png']");
	public By theWickedKingImg2 = By.cssSelector("img[class='pswp__img']"
			+ "[src='https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing2.png']");
	public By theWickedKingImg3 = By.cssSelector("img[class='pswp__img']"
			+ "[src='https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing3.png']");
	public By theWickedKingImg4 = By.cssSelector("img[class='pswp__img']"
			+ "[src='https://keybooks.ro/wp-content/uploads/2022/11/TheWickedKing4.png']");
	
	
	public String checkCategoryFieldText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkProductIdFieldText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public String checkTheWickedKingImg1(By locator) {
		return driver.findElement(locator).getAttribute("src");
	}
}	
