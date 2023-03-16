import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Element {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        driver.findElement(By.xpath("//table[@class=\"navFooterMoreOnAmazon\"]/tbody/tr[3]/td[13]/a")).click();
      //  driver.navigate().back();

    }
}
