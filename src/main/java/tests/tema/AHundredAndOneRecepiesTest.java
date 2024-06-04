package tests.tema;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.tema.AHundredAndOneRecepiesPage;
import pageObjects.tema.MenuPageTema;
import selenium.utils.BaseTest;

public class AHundredAndOneRecepiesTest extends BaseTest{
	
    @Test

    public void checkBookElements() {

         MenuPageTema menu = new MenuPageTema(driver);
         AHundredAndOneRecepiesPage book = new AHundredAndOneRecepiesPage(driver);
         menu.navigateTo(menu.bookLink);

         SoftAssert sa =  new SoftAssert();

         sa.assertTrue(book.checkBookNameFieldIsDisplayed(book.bookNameField));
         sa.assertTrue(book.checkProductGalleryBtnIsDisplayed(book.productGalleryBtn));
         sa.assertTrue(book.checkRatingFieldIsDisplayed(book.ratingField));
         sa.assertTrue(book.checkPriceFieldIsDisplayed(book.priceField));
         sa.assertTrue(book.checkProductDetailsFieldIsDisplayed(book.productDetailsField));
         sa.assertTrue(book.checkProductQuantityFieldIsDisplayed(book.productQuantityField));
         sa.assertTrue(book.checkAddToCartBtnIsDisplayed(book.addToCartBtn));
         sa.assertTrue(book.checkCategoryFieldIsDisplayed(book.categoryField));
         sa.assertAll();
    }
}