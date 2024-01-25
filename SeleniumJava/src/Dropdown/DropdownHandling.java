package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHandling {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        dropdown.selectByVisibleText("France");
        dropdown.selectByValue("japan");

        // Capture all options and print them
        List<WebElement> options = dropdown.getOptions();
        System.out.println("Total Number of Options: " + options.size());

        for (WebElement option : options) {
            System.out.println("Value: " + option.getAttribute("value") + " InnerHTML: " + option.getText());
        }

        // Selecting options without dropdown built-in functions
        for (WebElement option : options) {
            if (option.getText().equals("Brazil")) {
                option.click();
                break;
            }
        }

        driver.quit();
    }
}
