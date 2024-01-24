package MouseOperations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement targetElement = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(targetElement, sourceElement).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
