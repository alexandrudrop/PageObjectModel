package tests.tema;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class RedirectingToSocialMedia extends BaseTest{
	
	@Test
	public void redirectingToSocialMedia() throws InterruptedException {
		
		app.click(app.menu.facebookLink);
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		String expectedFacebookUrl = "https://www.facebook.com/keytraining.ro";
		String actualFacebookUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedFacebookUrl, actualFacebookUrl);
		Thread.sleep(3000);
		driver.close();
		

		driver.switchTo().window(browserTabs.get(0));
		app.click(app.menu.twitterLink);
		List<String> browserTabs1 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs1.get(1));
		Thread.sleep(3000);
		String expectedTwitterUrl = "https://x.com/";
		String actualTwitterUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedTwitterUrl, actualTwitterUrl);
		Thread.sleep(3000);
		driver.close();

		
		driver.switchTo().window(browserTabs.get(0));
		app.click(app.menu.instagramLink);
		List<String> browserTabs2 = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs2.get(1));
		String expectedInstagramUrl = "https://www.instagram.com/";
		String actualInstagramUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedInstagramUrl, actualInstagramUrl);
		Thread.sleep(2000);
	}
}