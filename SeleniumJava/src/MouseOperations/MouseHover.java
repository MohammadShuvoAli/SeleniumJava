package MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

    public static void main(String[] args) throws InterruptedException {
    	
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        WebElement computers = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        WebElement electronics = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));
        WebElement apparel = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));
        WebElement accessories = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Accessories']"));

        Actions actions = new Actions(driver);

        // Mouse Hover
        // perform() is mandatory for executing the action. Without perform(), it will just create the action chain
        actions.moveToElement(computers).moveToElement(electronics).moveToElement(apparel).moveToElement(accessories).click().perform();

        Thread.sleep(2000); // Added sleep for demonstration purposes
        driver.quit();
    }
}
