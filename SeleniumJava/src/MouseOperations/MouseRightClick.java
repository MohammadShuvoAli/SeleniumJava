package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));

        Actions actions = new Actions(driver);
        actions.contextClick(button).perform();

        Thread.sleep(2000); // Added sleep for demonstration purposes
        driver.quit();
    }
}
