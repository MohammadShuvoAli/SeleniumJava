package Browser_Commnads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommnads {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        // Close the current window
        driver.close();

        // Quit the WebDriver
        driver.quit();
    }
}
