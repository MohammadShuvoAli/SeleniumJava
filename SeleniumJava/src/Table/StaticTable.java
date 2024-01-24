package Table;

import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        // Counting the number of rows and columns in the table
        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr"));
        int no_of_rows = rows.size();
        System.out.println("No of Rows: " + no_of_rows);

        List<WebElement> columns = driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr/th"));
        int no_of_columns = columns.size();
        System.out.println("No of Columns: " + no_of_columns);

        // Reading specific row and column data
        String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[1]")).getText();
        System.out.println("Specific row and column data: " + data + "\n");

        // Printing all rows and columns from the table
        for (int r = 2; r <= no_of_rows; r++) {
            for (int c = 1; c <= no_of_columns; c++) {
                String tableData = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
                System.out.print(tableData + "      ");
            }
            System.out.println();
        }

        // Read data based on condition
        // Finding out book information written by "Mukesh"
        for (int r = 2; r <= no_of_rows; r++) {
            String author = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[" + r + "]/td[2]")).getText();
            if (author.equals("Mukesh")) {
                String bookName = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[" + r + "]/td[1]")).getText();
                String bookSubject = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[" + r + "]/td[3]")).getText();
                String bookPrice = driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[" + r + "]/td[4]")).getText();
                System.out.println(bookName + " " + author + " " + bookSubject + " " + bookPrice);
            }
        }

        driver.quit();
    }
}
