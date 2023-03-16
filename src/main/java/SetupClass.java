import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
      //  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("book");
       // driver.findElement(By.cssSelector("[class=\"nav-search-facade\"]")).click();




    }
}
