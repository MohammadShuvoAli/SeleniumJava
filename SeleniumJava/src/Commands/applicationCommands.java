package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class applicationCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to Facebook
        driver.get("https://www.facebook.com/");

        // Print information
        System.out.println("Title: " + driver.getTitle());
        System.out.println("Current URL: " + driver.getCurrentUrl());
        System.out.println("Page Source: " + driver.getPageSource());

        // Close the browser
        driver.quit();
    }
}
