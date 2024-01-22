package FirstScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Compare the title using equals()
        if (driver.getTitle().equals("Google"))
            System.out.println("Test Passed!!!");
        else
            System.out.println("Test Failed!!!");

        // Close the browser
        driver.quit();
		
    }
}
