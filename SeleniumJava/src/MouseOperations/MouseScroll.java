package MouseOperations;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScroll {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://flagpedia.net/index");

        // 1. Scroll down by pixel
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 3000)");

        int value1 = (int) Double.parseDouble(((JavascriptExecutor) driver).executeScript("return window.pageYOffset;").toString());
        System.out.println("Number of pixel moved: " + value1);

        // 2. Scroll down till the element is visible
        WebElement flag = driver.findElement(By.xpath("//img[@alt='Flag of Bangladesh']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", flag);

        int value2 = (int) Double.parseDouble(((JavascriptExecutor) driver).executeScript("return window.pageYOffset;").toString());
        System.out.println("Number of pixel moved: " + value2);

        // 3. Scroll down till the end
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, document.body.scrollHeight)");

        int value3 = (int) Double.parseDouble(((JavascriptExecutor) driver).executeScript("return window.pageYOffset;").toString());
        System.out.println("Number of pixel moved: " + value3);

        // 4. Scroll up to the starting position
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, -document.body.scrollHeight)");

        int value4 = (int) Double.parseDouble(((JavascriptExecutor) driver).executeScript("return window.pageYOffset;").toString());
        System.out.println("Number of pixel moved: " + value4);

        Thread.sleep(2000);
        driver.quit();
    }
}
