package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver =  driver;
	}
	
	public By bookLink = By.linkText("A hundred and one receipes");
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}

}
