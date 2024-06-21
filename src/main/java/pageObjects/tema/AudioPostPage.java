package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers{
	
	public WebDriver driver;
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}
	
    public By musicPlayPauseBtn = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
    public By timeSliderPosition = By.xpath("//span[@class='mejs-time-current']");
    public By volumeSliderPosition = By.xpath("//div[@class='mejs-horizontal-volume-total']");

}
