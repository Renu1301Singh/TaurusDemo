package Amazon.Pages;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AmazonAddToCart {
    WebDriver driver;
    By AddtoCartButton= By.cssSelector("div.a-button-stack>span>span>span>input");
    By Cart= By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']");
    String ExpectedTitle="Amazon.in Shopping Cart";

    public AmazonAddToCart(WebDriver driver){
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println(e);
        }
        this.driver=driver;

    }
    public void AddToCartButton(){
        driver.findElement(AddtoCartButton).click();

    }
  public   void navigateToShoppingCart() {
        WebElement viewCartButton = driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']"));
        viewCartButton.click();
    }
   public void assertShoppingCartPage(){

        String actualTitle = driver.getTitle();
        try {
            Assert.assertEquals(actualTitle, ExpectedTitle, "Navigated to Shopping Cart Page");
        } catch (Exception e) {
            System.out.println("Didn't Navigated to Shopping Cart Page");
        }}}
