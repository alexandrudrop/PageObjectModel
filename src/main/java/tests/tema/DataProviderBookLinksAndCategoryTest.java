package tests.tema;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;
import testdata.utils.DataProviderRomansClass;

public class DataProviderBookLinksAndCategoryTest extends BaseTest{
	
	@Test(dataProviderClass=DataProviderRomansClass.class, dataProvider="booksLinkAndCategoryProvider")
	public void assertBookLinksAndCategory(String bookLink, String bookCategory) {
		
		app.click(app.menu.shopLink);
		app.click(app.shop.romansLink);
		
		WebElement link = driver.findElement(By.cssSelector
				("div[class='post_content'] a[href='https://keybooks.ro/shop/"+bookLink+"/']"));
		assertTrue(link.isDisplayed());
		
		WebElement category = driver.findElement(By.xpath
				//("//div[@class='product_meta']/descendant::a[text()='"+bookCategory+"']"));
				("//div[@class='product_meta']/descendant::a[text()='Romans']"));
		assertTrue(category.isDisplayed());
		
		
		
	}

}
