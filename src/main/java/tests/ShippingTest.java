package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import selenium.utils.BaseTest;

public class ShippingTest extends BaseTest{
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@Test(priority=1)
	public void loginTest() {
		
		app.click(app.menu.loginLink);
		app.login.logInApp(USER, PASS);
		assertTrue(app.login.checkMsgIsDisplayed(app.login.successLoginMsg));
		
	}
	
	@Test(priority=2)
	public void shippingAddressCountryDropdownField() {
		
		driver.navigate().to("https://keybooks.ro/account/edit-address/shipping/");
		app.shipping.selectByIndex(41);
		assertEquals(app.shipping.getSelectedCountryOption(app.shipping.countryList), "Canada");
		

	}
	
	@Test(priority=3)
	public void shippingAddressProvinceDropdownField() throws InterruptedException {
		
		Thread.sleep(2000);
		app.shipping.selectByValue("NL");
		assertEquals(app.shipping.getSelectedProvinceOption(app.shipping.provinceList), "Newfoundland and Labrador");
	}
}
