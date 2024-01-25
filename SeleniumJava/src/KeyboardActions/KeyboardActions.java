package KeyboardActions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://text-compare.com/");

        WebElement field1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        // WebElement field2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        field1.sendKeys("Hi! I am Shuvo");

        Actions actions = new Actions(driver);

        // Select all text in the first field
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

        // Copy the selected text
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

        // Move to the next input field
        actions.sendKeys(Keys.TAB).perform();

        // Paste the copied text
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
