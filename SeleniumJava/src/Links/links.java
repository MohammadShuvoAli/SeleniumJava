package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class links {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        // Click on link
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        System.out.println("Total Links Available on Page: " + links.size());

        // Print all link names
        int linkCount = 1;
        for (WebElement link : links) {
            System.out.println("Link No. " + linkCount + " Name: " + link.getText());
            linkCount++;
        }

        driver.quit();
    }
}
