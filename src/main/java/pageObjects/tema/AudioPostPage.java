package pageObjects.tema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.utils.SeleniumWrappers;

public class AudioPostPage extends SeleniumWrappers{
	
	public WebDriver driver;
	public AudioPostPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By musicPlayPauseBtn = By.cssSelector("div[class='mejs-button mejs-playpause-button mejs-play']");
	public By musicTimeSliderInitialPosition = By.cssSelector("span[style*='left: 0px']");
	public By musicTimeSliderFinalPosition = By.cssSelector("span[style*='left: 400px']");
	public By musicVolumeSliderInitialPosition = By.cssSelector("div[style='left: 100%;']");
	public By musicVolumeSliderFinalPosition = By.cssSelector("div[style='left: 0%;']");

}
