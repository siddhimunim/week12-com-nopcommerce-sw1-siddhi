package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl =" https://demo.nopcommerce.com/ ";
    @Before
    public void setUpUrl(){
        openWebBrowser(baseUrl);
    }
    @Test
    public void  userShouldNavigateToLoginPageSuccessfully() {
        //click on log in//

        clickOnElement(By.linkText("Log in"));

        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextCompareElement(By.xpath("//h1[text()='Welcome, Please Sign In!']"));
        //varify//
        Assert.assertEquals(expectedMessage, actualMessage );
    }
     @Test
         public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on login//
         clickOnElement(By.linkText("Log in"));

        //enter valid username//
         sendTextToElements(By.xpath("//input[@id='Email']"),"jenny.smith@gmail.com");
         //valid password//
         sendTextToElements(By.xpath("//input[@id='Password']"),"jennysmith");
         //click on login button//
         clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
         //verify massage//
         String expectedMessage= "Log out";
         String actualMessage = getTextCompareElement(By.xpath("//a[@href='/logout']"));
         Assert.assertEquals(expectedMessage,actualMessage);



     }
    @Test

     public void varifyTheErrorMessage(){
         //click on login//
         clickOnElement(By.linkText("Log in"));
         //enter invalid username//
         sendTextToElements(By.xpath("//input[@id='Email']"),"Stv123@gmail.com");
         //invalid password//
         sendTextToElements(By.xpath("//input[@id='Password']"),"abcd123");
         //click on login button//
         clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
         //verify massage//
         String expectedMessage="Login was unsuccessful. Please correct the errors and try again.\n" +
                 "No customer account found" ;

         String actualMessage = getTextCompareElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
         Assert.assertEquals(expectedMessage,actualMessage);



     }








    @After
    public void tearDown(){
      closeBrowser();
    }
}
