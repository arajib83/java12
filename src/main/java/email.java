import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class email {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


        driver.switchTo().frame(0);
        WebElement nothanks = driver.findElement(By.xpath("//button[@aria-label=\"No thanks\"]"));
        nothanks.click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        WebElement text = driver.findElement(By.cssSelector("[class=\"gLFyf\"]"));
        text.sendKeys("gmail.com/login", Keys.ENTER);
        driver.findElement(By.xpath("//a[@href=\"https://accounts.google.com/ServiceLogin?elo=1\"]")).click();
        driver.findElement(By.cssSelector("[type=\"email\"]")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("[id=\"identifierNext\"]")).click();



    }
}
