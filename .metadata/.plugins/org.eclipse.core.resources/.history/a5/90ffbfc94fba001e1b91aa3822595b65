package Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class brokenLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int count = 0;

        for (WebElement link : allLinks) {
            String url = link.getAttribute("href");

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(url + " is a broken link");
                    count++;
                } else {
                    System.out.println(url + " is a valid link");
                }
            } catch (IOException e) {
                // Exception handling for cases like malformed URLs
                System.out.println(url + " is a broken link (Exception: " + e.getMessage() + ")");
                count++;
            }
        }

        System.out.println("Total number of broken links: " + count);

        driver.quit();
    }
}
