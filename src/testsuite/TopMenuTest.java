package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl =" https://demo.nopcommerce.com/ ";
    @Before
    public void setUpUrl(){
        openWebBrowser(baseUrl);
    }
    @Test

    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on computer//
      clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
       //verify//
        String expectedMessage = "Computers";
        String actualMessage = getTextCompareElement(By.xpath("//ul[@class='top-menu notmobile']/li[1]/a"));
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @Test
    public void  userShouldNavigateToElectronicsPageSuccessfully(){
        //click on electric tab//
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
        String expectedMessage = "Electronics";
        String actualMessage = getTextCompareElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
        Assert.assertEquals(actualMessage,expectedMessage);


    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        //click on apparel//
        clickOnElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a"));
        //verify //
        String expectedMessage = "Apparel";
        String actualMessage = getTextCompareElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a"));
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        //click on digitdownload//
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a"));
        //verify//
        String expectedMessage = "Digital downloads";
        String actualMessage = getTextCompareElement(By.xpath("//ul[@class='top-menu notmobile']/li[4]/a"));
        Assert.assertEquals(actualMessage,expectedMessage);


    }
    @Test
    public void  userShouldNavigateToBooksPageSuccessfully(){
        //click on book//
        clickOnElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a"));
        String expectedMessage = "Books";
        String actualMessage = getTextCompareElement(By.xpath("//div[@class='header-menu']/ul/li[5]/a"));
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on jewlary//
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a"));
        String expectedMessage = "Jewelry";
        String actualMessage = getTextCompareElement(By.xpath("//ul[@class='top-menu notmobile']/li[6]/a"));
        Assert.assertEquals(actualMessage, expectedMessage);


    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        //click on giftcard//
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a"));
        //verify//
        String expectedMessage = "Gift Cards";
        String actualMessage = getTextCompareElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a"));
        Assert.assertEquals(actualMessage, expectedMessage);

    }



    @After
    public void tearDown(){
          closeBrowser();
    }
}
