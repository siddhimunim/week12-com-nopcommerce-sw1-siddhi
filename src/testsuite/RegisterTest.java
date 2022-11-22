package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl =" https://demo.nopcommerce.com/ ";
    @Before
    public void setUpUrl(){
        openWebBrowser(baseUrl);
    }
    @Test
    //on regestration page//
    public void  UserShouldNavigateToRegisterPageSuccessfully(){
        clickOnElement(By.xpath("//div[@class='header-links']/ul/li[1]/a"));
        //verify
        String expectedMessage = "Register";
        String actualMessage = getTextCompareElement(By.xpath("//div[@class='header-links']/ul/li[1]/a"));
        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @Test
    //register account successfully//
    public void userSholdRegisterAccountSuccessfully(){
        //click on link//
        clickOnElement(By.xpath("//div[@class='header-links']/ul/li[1]/a"));
        //select gender button
        clickOnElement(By.xpath("//div[@id='gender']/span[2]/input"));
        //enter 1st name//
        sendTextToElements(By.xpath("//input[@id='FirstName']"),"John");
        //enter last name//
        sendTextToElements(By.xpath("//input[@id='LastName']"),"Smith");
        //enter date of birth//
        //day//
        sendTextToElements(By.xpath("//select[@name='DateOfBirthDay']"),"22");
        //enter month//
        sendTextToElements(By.xpath("//select[@name='DateOfBirthMonth']"),"3");
        //enter year//
        sendTextToElements(By.xpath("//select[@name='DateOfBirthYear']"),"1982");
        //enter email address//

        sendTextToElements(By.xpath("//input[@id='Email']"),"abc1234@gmail.com");
        //enter password
        sendTextToElements(By.xpath("//input[@name='Password']"),"120abcd");
        //confirm password
        sendTextToElements(By.xpath("//input[@name='ConfirmPassword']"),"120abcd");
        //click on regestration button//
        clickOnElement(By.xpath("//button[@id='register-button']"));
//reg complete//
        String expectedMessage = "Your registration completed";
        String actualMessage = getTextCompareElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals(actualMessage,expectedMessage);





    }
    @After
    public void tearDown(){
         closeBrowser();
    }
}
