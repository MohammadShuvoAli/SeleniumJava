package DataDrivenTesting;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import ExcelReadWrite.XLUtilities;

import java.time.Duration;

public class FDCalculatorTest {

    public static void main(String[] args) throws InvalidFormatException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BS001.html");

        String file = System.getProperty("user.dir") + "\\src\\DataDrivenTesting\\caldata.xlsx";
        System.out.println(file);
        int rows = XLUtilities.getRowCount(file, "Sheet1");
        
        for (int r = 2; r <= rows; r++) {
            String principleAmount = XLUtilities.readData(file, "Sheet1", r, 1);
            String rateOfInterest = XLUtilities.readData(file, "Sheet1", r, 2);
            String period1 = XLUtilities.readData(file, "Sheet1", r, 3);
            String period2 = XLUtilities.readData(file, "Sheet1", r, 4);
            String frequency = XLUtilities.readData(file, "Sheet1", r, 5);
            String expectedMaturityValue = XLUtilities.readData(file, "Sheet1", r, 6);

            // Passing data to the application
            int principleAmountValue = (int) Double.parseDouble(principleAmount);
            // Passing data to the application
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(principleAmountValue));
            driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
            
            // Handle period1 as an integer without decimal places
            int period1Value = (int) Double.parseDouble(period1);
            driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(String.valueOf(period1Value));
            
            // Handling the alert
            try {
                Alert alert = driver.switchTo().alert();
                alert.dismiss();
            } catch (NoAlertPresentException e) {
                // If no alert is present, continue with the test
            }
            
            Select periodDropdown = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
            periodDropdown.selectByVisibleText(period2);

            Select frequencyDropdown = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
            frequencyDropdown.selectByVisibleText(frequency);

            driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();

            String actualMaturityValue = driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();

            // Validation
            if (Float.parseFloat(expectedMaturityValue) == Float.parseFloat(actualMaturityValue)) {
                System.out.println("Test Passed!!!");
                XLUtilities.writeData(file, "Sheet1", r, 8, "Passed");
                XLUtilities.fillGreen(file, "Sheet1", r, 8);
            } else {
                System.out.println("Test Failed!!!");
                XLUtilities.writeData(file, "Sheet1", r, 8, "Failed");
                XLUtilities.fillRed(file, "Sheet1", r, 8);
            }

            driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        driver.quit();
    }
}
