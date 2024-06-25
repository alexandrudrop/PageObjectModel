package selenium.utils;

import pageObjects.ContactsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.ShippingPage;
import pageObjects.ShopPage;
import pageObjects.tema.AudioPostPage;
import pageObjects.tema.BlogPage;
import pageObjects.tema.MenuPageTema;
import pageObjects.tema.RomansPage;
import pageObjects.tema.TheWickedKingPage;

public class BasePage extends SeleniumWrappers{
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ContactsPage contacts = new ContactsPage(driver);
	public MenuPageTema menuTema = new MenuPageTema(driver);
	public TheWickedKingPage wickedKing = new TheWickedKingPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ShippingPage shipping = new ShippingPage(driver);
	public BlogPage blog = new BlogPage(driver);
	public HomePage home = new HomePage(driver);
	public AudioPostPage audioPost = new AudioPostPage(driver);
	public RomansPage romans = new RomansPage(driver);

}