package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);

        // Date Format: DD/MM/YY
        // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/05/2024");

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        String date = "5";
        String month = "September";
        String year = "2024";

        while (true) {
            String m = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
            String y = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
            if (month.equals(m) && year.equals(y)) {
                break;
            } else {
                driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click(); // Next Button
                // driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();  // Previous Button
            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
        for (WebElement day : dates) {
            if (day.getText().equals(date)) {
                day.click();
                break;
            }
        }

        Thread.sleep(5000); // Added sleep for demonstration purposes
        driver.quit();
    }
}
