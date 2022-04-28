package amazontest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;

public class DellTest extends Utility {
    String baseUrl = "https://www.amazon.co.uk/";
    @Before
    public  void openAmazon(){
        setUpBrowser(baseUrl);
    }
    @Test
    public void searchDell(){
        driver.manage().getCookies();
WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
searchBox.sendKeys("dell laptop");
clickOnElement(By.xpath("//input[@id='nav-search-submit-button']"));

mouseHoverToElementAndClick(By.xpath("//li[@id='p_89/Dell']/span/a/div/label"));
        List<WebElement> num = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        System.out.println(num.size());
List<WebElement> name = driver.findElements(By.xpath("//div[@class='a-section a-spacing-none s-padding-right-small s-title-instructions-style']"));
       for(WebElement nametext : name){
           System.out.println(nametext.getText());
       }
    }
    public void tearDown(){
        closeBrowser();
    }
}
