package tests.tema;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pageObjects.tema.AHundredAndOneRecepiesPage;
import pageObjects.tema.MenuPage;
import selenium.utils.BaseTest;

public class AHundredAndOneRecepiesTest extends BaseTest{
	
	@Test(priority=1)
	public void bookNameFieldIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkBookNameFieldIsDisplayed(book.bookNameField));
	}
	
	@Test(priority=2)
	public void productGalleryBtnIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkProductGalleryBtnIsDisplayed(book.productGalleryBtn));
	}
	
	@Test(priority=3)
	public void ratingFieldIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkRatingFieldIsDisplayed(book.ratingField));
	}
	
	@Test(priority=4)
	public void priceFieldIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkPriceFieldIsDisplayed(book.priceField));
	}
	
	@Test(priority=5)
	public void producetDetailsFieldIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkProductDetailsFieldIsDisplayed(book.productDetailsField));
	}
	
	@Test(priority=6)
	public void productQuantityFieldIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkProductQuantityFieldIsDisplayed(book.productQuantityField));
	}
	
	@Test(priority=7)
	public void addToCartBtnIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkAddToCartBtnIsDisplayed(book.addToCartBtn));
	}
	
	@Test(priority=8)
	public void categoryFieldIsDisplayedTest() {
		
		MenuPage menu = new MenuPage(driver);
		AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
		
		menu.navigateTo(menu.bookLink);
		assertTrue(book.checkCategoryFieldIsDisplayed(book.categoryField));
	}
}
