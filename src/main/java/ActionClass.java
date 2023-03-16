import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) {



        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement jw = driver.findElement(By.xpath("//div[@class=\"hl-cat-nav\"]/ul/li[11]/a"));
        WebElement wa = driver.findElement(By.xpath("//div[@class=\"hl-cat-nav\"]/ul/li[11]/a"));


        Actions action = new Actions(driver);

        action.moveToElement(jw).perform();
        action.click().perform();
       // driver.quit();














    }


}
