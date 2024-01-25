package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BootstrapDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

        driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click();

        List<WebElement> countryList = driver.findElements(By.xpath("//*[@id='select2-billing_country-results']/li"));
        System.out.println("Total Number of Countries: " + countryList.size());

        // Printing all country names from dropdown
        for (WebElement country : countryList) {
            System.out.println(country.getText());
        }

        // Selecting a specific country from dropdown
        for (WebElement country : countryList) {
            if (country.getText().equals("Bangladesh")) {
                country.click();
                break;
            }
        }

        Thread.sleep(5000); // Added sleep for demonstration purposes
        driver.quit();
    }
}
