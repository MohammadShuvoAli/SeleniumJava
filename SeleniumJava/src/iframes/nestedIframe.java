package iframes;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedIframe {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();

        WebElement outerFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        driver.switchTo().frame(outerFrame);

        WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(innerFrame);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shuvo");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Switching back to the main frame
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/section/div/div/div/div/div/div/ul/li[1]/a")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
