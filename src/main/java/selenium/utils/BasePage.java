package selenium.utils;

import pageObjects.ContactsPage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.tema.MenuPageTema;
import pageObjects.tema.TheWickedKingPage;

public class BasePage extends SeleniumWrappers{
	
	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ContactsPage contacts = new ContactsPage(driver);
	public MenuPageTema menuTema = new MenuPageTema(driver);
	public TheWickedKingPage wickedKing = new TheWickedKingPage(driver);

}
