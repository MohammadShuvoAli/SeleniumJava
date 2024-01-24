package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTable {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Login to ORANGE HRM
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//li[1]//a[1]//span[1]")).click();

        // Get all rows within the div
        List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div/div"));
        List<WebElement> tableColumns = driver.findElements(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div/div"));
        int noOfRows = tableRows.size();
        int noOfColumns = tableColumns.size();
        System.out.println("No of Rows: " + noOfRows);
        System.out.println("No of Columns: " + noOfColumns);

        System.out.println("\nPrinting Table Data:");
        for (int r = 1; r <= noOfRows; r++) {
            for (int c = 2; c < noOfColumns; c++) {
                WebElement tableData = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[" + r + "]/div/div[" + c + "]/div"));
                System.out.print(tableData.getText() + "     ");
            }
            System.out.println();
        }

        driver.quit();
    }
}
