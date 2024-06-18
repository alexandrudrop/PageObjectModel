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
	public By searchBlogBtn = By.xpath("//aside[@id='search-2']/descendant::button");
	public By readMore = By.xpath("//span[@class='post_readmore_label']");
	public By categoryClassic = By.xpath
			("//span[@class='post_info_item post_info_tags']/a[@href='https://keybooks.ro/category/classic/']");
	public By categoryNews = By.xpath
			("//span[@class='post_info_item post_info_tags']/a[@href='https://keybooks.ro/category/news/']");
	public By categoryRecommend = By.xpath
			("//span[@class='post_info_item post_info_tags']/a[@href='https://keybooks.ro/category/recommend/']");
	public By audioPost = By.linkText("Audio post");
	
	public void searchBlog(String name) {
		sendKeys(searchBlogField, name);
		click(searchBlogBtn);
	}
	
	public String checkCategoryText(By locator) {
		return driver.findElement(locator).getText();
	}
}