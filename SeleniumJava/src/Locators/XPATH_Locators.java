package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");

        // Absolute XPath
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/input")).sendKeys("Apple");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button")).click();
        driver.navigate().back();

        // Relative XPath
        driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("Apple");
        driver.findElement(By.xpath("//*[@id='small-search-box-form']/button")).click();

        // XPath AND
        driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).sendKeys("XPath AND");
        driver.findElement(By.xpath("//input[@name='q' and @placeholder='Search store']")).clear();

        // XPath OR
        driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search']")).sendKeys("XPath OR");
        driver.findElement(By.xpath("//input[@name='q' or @placeholder='Search']")).clear();

        // XPath contains()
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("XPath contains()");
        driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).clear();

        // XPath starts-with()
        driver.navigate().back();
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("XPath starts-with()");
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).clear();

        // XPath text()
        driver.navigate().back();
        driver.findElement(By.xpath("//a[text()='Build your own computer']")).click();
        sleep(2000);
        driver.navigate().back();
        sleep(1000);

        driver.quit();
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
