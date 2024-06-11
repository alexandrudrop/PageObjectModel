package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import selenium.utils.SeleniumWrappers;

public class ShippingPage extends SeleniumWrappers{
	
	public WebDriver driver;
	public ShippingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By countryList = By.name("shipping_country");
	public By provinceList = By.id("shipping_state");
	
	public void selectByIndex(int index) {
		WebElement element = driver.findElement(countryList);
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void selectByValue(String value) {
		WebElement element = driver.findElement(provinceList);
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public String getSelectedCountryOption() {
		WebElement element = driver.findElement(countryList);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}
	
	public String getSelectedProvinceOption() {
		WebElement element = driver.findElement(provinceList);
		Select select = new Select(element);
		return select.getFirstSelectedOption().getText();
	}

}
