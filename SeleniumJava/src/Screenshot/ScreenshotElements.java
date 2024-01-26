package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class ScreenshotElements {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://bangladesh.gov.bd/index.php");
        driver.manage().window().maximize();

        WebElement logo = driver.findElement(By.xpath("//img[@alt='গণপ্রজাতন্ত্রী বাংলাদেশ']"));

        // Convert the WebElement to a TakesScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) logo;

        // Capture the screenshot as a file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        try {
            // Save the screenshot to a file
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/Screenshot/ScreenshotElements.png"));
            System.out.println("Screenshot Taken!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
