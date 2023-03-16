import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String[] args) {


        //We use select class to handle dropdown.


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");

        WebElement category = driver.findElement(By.cssSelector("[name=url]"));
        Select select = new Select(category);
        select.selectByIndex(12);


    }
}
