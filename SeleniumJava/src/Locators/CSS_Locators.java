package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        // Tag & ID CSS Selector (Tag name is optional)
        driver.findElement(By.cssSelector("#email")).sendKeys("tag & id CSS Selector");
        sleep(1000);
        driver.findElement(By.cssSelector("#email")).clear();
        sleep(1000);

        // Tag & Class CSS Selector (Tag name is optional)
        driver.findElement(By.cssSelector(".inputtext")).sendKeys("tag & class CSS Selector");
        sleep(1000);
        driver.findElement(By.cssSelector(".inputtext")).clear();
        sleep(1000);

        // Tag & Attribute CSS Selector (Tag name is optional)
        driver.findElement(By.cssSelector("[data-testid='royal_email']")).sendKeys("tag & attribute selector");
        sleep(1000);
        driver.findElement(By.cssSelector("input[data-testid='royal_email']")).clear();
        sleep(1000);

        // Tag, Class, and Attribute CSS Selector
        driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_email']")).sendKeys("Tag, class and attribute CSS Selector");
        driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_pass']")).sendKeys("1234567890");
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
