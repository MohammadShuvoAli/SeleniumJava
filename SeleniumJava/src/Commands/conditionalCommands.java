package Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class conditionalCommands {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/register");

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Display Status: " + searchBox.isDisplayed());
        System.out.println("Enabled Status: " + searchBox.isEnabled());

        WebElement radioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        System.out.println("Radio Button Before Click: " + radioButton.isSelected());
        radioButton.click();
        System.out.println("Radio Button After Click: " + radioButton.isSelected());

        // Additional condition: Check if an element is present
        By additionalElementLocator = By.xpath("//div[@class='header-links']/ul/li/a[contains(text(),'Log in')]");
        WebElement additionalElement = driver.findElement(additionalElementLocator);
        
        if (additionalElement.isDisplayed()) {
            System.out.println("Additional Element is displayed.");
        } else {
            System.out.println("Additional Element is not displayed.");
        }

        driver.quit();
    }
}
