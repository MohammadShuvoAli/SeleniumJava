package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class checkboxHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> days = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

        // Printing checkbox length
        System.out.println("Days Count: " + days.size());

        // Printing checkbox values
        int dayCount = 1;
        for (WebElement day : days) {
            System.out.println("Day " + dayCount + ": " + day.getAttribute("value"));
            dayCount++;
        }

        // Selecting a single checkbox
        days.get(2).click();

        // Clicking on all checkboxes
        for (WebElement day : days) {
            day.click();
        }

        // Selecting multiple checkboxes by choice
        for (WebElement day : days) {
            String weekName = day.getAttribute("id");
            if (weekName.equals("friday") || weekName.equals("sunday") || weekName.equals("thursday")) {
                day.click();
            }
        }

        // Select last 2 days
        for (int i = days.size() - 2; i < days.size(); i++) {
            days.get(i).click();
        }

        // Select first 2 days
        for (int i = 0; i < days.size() && i < 2; i++) {
            days.get(i).click();
        }

        // Clearing selected checkboxes
        for (WebElement day : days) {
            if (day.isSelected()) {
                day.click();
            }
        }

        driver.quit();
    }
}
