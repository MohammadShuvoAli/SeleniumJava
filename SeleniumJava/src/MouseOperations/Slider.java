package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

        System.out.println("Slider Location Before: ");
        System.out.println(slider.getLocation());

        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 100, 0).perform();

        System.out.println("Slider Location After: ");
        System.out.println(slider.getLocation());

        Thread.sleep(2000);
        driver.quit();
    }
}
