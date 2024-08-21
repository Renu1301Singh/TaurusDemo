package Amazon.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class AmazonHomePage {
  WebDriver driver;
    By Searchbar=By.id("twotabsearchtextbox");
    By Searchbutton=By.xpath("//input[@id='nav-search-submit-button']");

    String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
String expectedTitleSearch="Amazon.in : Boat Earphones";
  public AmazonHomePage(WebDriver driver){
                this.driver = driver;

      }

      public  void  verifyPageLaunch(){
          assertEquals(driver.getTitle(),expectedtitle);

      }
public void VerifySearchItem(){
    assertEquals(driver.getTitle(),expectedTitleSearch);

}
    public void addsearch(String product){
        driver.findElement(Searchbar).sendKeys(product);

    }
    public  void  clicksearch(){
        driver.findElement(Searchbutton).click();

    }
}

