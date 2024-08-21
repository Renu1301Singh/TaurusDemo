package Amazon.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AmazonProceedToBuy {
    WebDriver driver;
    By ProceedToBuy = By.xpath("//input[@name=\"proceedToRetailCheckout\"]");
String ExpectedTitle="Amazon Sign In";
    public AmazonProceedToBuy(WebDriver driver) {
        this.driver = driver;


    }
    public void ProceedToBuy() {
        driver.findElement(ProceedToBuy).click();


        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public void IsProceedToBuy(){
        Assert.assertEquals(driver.getTitle(), ExpectedTitle, "Navigated to Shopping Cart Page");
        System.out.println("done");
    }

}
