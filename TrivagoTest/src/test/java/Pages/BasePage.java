package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage{
    public WebDriver driver;
    protected WebDriverWait wait;
    public BasePage(WebDriver driver) {
       this.driver=driver;
       wait= new WebDriverWait(driver, 30);
    }

    //If we need we can use custom wait in BasePage and all page classes
  // WebDriverWait wait = new WebDriverWait(this.driver,20);

    //Click Method by using JAVA Generics (You can use both By or Webelement)
    protected <T> void Click(T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
         //   wait.until(ExpectedConditions.visibilityOfElementLocated((By) elementAttr));
            driver.findElement((By) elementAttr).click();
        } else {
          //  wait.until(ExpectedConditions.visibilityOf((WebElement) elementAttr));
            ((WebElement) elementAttr).click();
        }
    }

    //Write Text by using JAVA Generics (You can use both By or Webelement)
    protected <T> void WriteText(T elementAttr, String text) {
        if(elementAttr.getClass().getName().contains("By")) {
            driver.findElement((By) elementAttr).sendKeys(text);
        } else {
            ((WebElement) elementAttr).sendKeys(text);
        }
    }

    //Read Text by using JAVA Generics (You can use both By or Webelement)
    protected <T> String ReadText(T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            return driver.findElement((By) elementAttr).getText();
        } else {
            return ((WebElement) elementAttr).getText();
        }
    }

    //Close popup if exists
    protected void HandlePopup(By by) throws InterruptedException {
        List<WebElement> popup = driver.findElements(by);
        if(!popup.isEmpty()){
            popup.get(0).click();
            Thread.sleep(200);
        }
    }

    protected <T> void VerifyCurrentScreen(T elementAttr) {
        if(elementAttr.getClass().getName().contains("By")) {
            Assert.assertTrue(driver.findElement((By) elementAttr).isDisplayed());
        } else {
            Assert.assertTrue(((WebElement) elementAttr).isDisplayed());
        }
    }
    //Used to find table tags: rows and columns
    protected WebElement GetWebElementByTagName (WebElement webElement,String TagName) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.findElement(By.tagName(TagName));
    }
    //Used to find table tags: rows and columns
    protected List<WebElement> GetWebElementsByTagName (WebElement webElement,String TagName) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        return webElement.findElements(By.tagName(TagName));
    }




    protected void WaitForWebElementToBeClickable(WebElement webElement){
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    protected void WaitForWebElementInvisibility(WebElement webElement){
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

}
