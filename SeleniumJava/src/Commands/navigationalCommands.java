package Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to daraz.com.bd
        // driver.get("https://www.daraz.com.bd/");
        driver.navigate().to("https://www.daraz.com.bd/");

        // Navigate to foodpanda.com.bd
        // driver.get("https://www.foodpanda.com.bd/");
        driver.navigate().to("https://www.foodpanda.com.bd/");

        // Refresh the current page (foodpanda.com.bd)
        driver.navigate().refresh();

        // Navigate back to daraz.com.bd
        driver.navigate().back();

        // Navigate forward to foodpanda.com.bd
        driver.navigate().forward();

        // Close the browser
        driver.quit();
    }
}
