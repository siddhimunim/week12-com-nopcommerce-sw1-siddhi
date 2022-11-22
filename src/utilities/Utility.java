package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
    // method for click on elements//
    public void clickOnElement(By by){
        WebElement loginInLink = driver.findElement(by);
        loginInLink.click();
    }
    //method for type into field//
    public void sendTextToElements(By by, String text){
        WebElement fieldLink = driver.findElement(by);
        fieldLink.sendKeys(text);

    }
    //for compare test//
    public String getTextCompareElement(By by){
        WebElement actualTextMassageElement=driver.findElement(by);
        return actualTextMassageElement.getText();
    }


    }


