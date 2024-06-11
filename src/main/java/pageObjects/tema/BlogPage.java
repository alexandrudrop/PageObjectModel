package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers{
	
	public WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By searchBlogField = By.xpath("//aside[@id='search-2']/descendant::input[@class='search_field']");
	public By searchBlogBtn = By.xpath("");
	
	public void searchBlog(String name) {
		
		sendKeys(searchField, name);
		
		click(why);
	}

}
