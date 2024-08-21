package Amazon.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class AmazonProductColourPage {
    WebDriver driver;
    By FirstItem=By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[1]");
    By Color= By.xpath("//li[@id='color_name_0']//span//div//span//span//span//button");
    By ColorName1= By.xpath("//li[@id='color_name_0']//span//div//span//span//span//button//div//div//img");
    By ColorName2= By.xpath("//div[@id=\"variation_color_name\"]//div//span");
    public  AmazonProductColourPage(WebDriver driver){
        this.driver=driver;

    }
    public void SelectProduct(){
        driver.findElement(FirstItem).click();

    }
    public void ChangeColour(){


        /*WebElement colourOption = driver.findElement(By.cssSelector("#color_name_1"));
        colourOption.click(); */

        driver.findElement(Color).click();

    }
    public void IsProductColour(){
        String selectedname= driver.findElement(ColorName1).getAttribute("alt");
        String lablename= driver.findElement(ColorName2).getText();
        assertTrue(selectedname.contains(lablename));

    }
}
