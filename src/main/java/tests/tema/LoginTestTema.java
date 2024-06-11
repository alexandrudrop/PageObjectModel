package tests.tema;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import selenium.utils.BaseTest;

public class LoginTestTema extends BaseTest{
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@Test
	public void loginTest() {
		
		app.click(app.menu.loginLink);
		app.login.logInApp(USER, PASS);
		assertTrue(app.login.checkMsgIsDisplayed(app.login.successLoginMsg));
		
	}

}
