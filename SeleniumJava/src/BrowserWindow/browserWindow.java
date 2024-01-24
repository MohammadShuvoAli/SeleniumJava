package BrowserWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class browserWindow {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        String parentWindowId = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindowId);

        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowId : windowHandles) {
            System.out.println(windowId);
        }

        String parentWindowIdJava = (String) windowHandles.toArray()[0];
        String childWindowId = (String) windowHandles.toArray()[1];

        driver.switchTo().window(parentWindowIdJava);
        System.out.println("Parent Window: " + driver.getTitle());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.switchTo().window(childWindowId);
        System.out.println("Child Window: " + driver.getTitle());

        System.out.println("\nPrinting using Loop");
        for (String windowId : windowHandles) {
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());
        }

        System.out.println("\nClosing a Specific window");
        for (String windowId : windowHandles) {
            driver.switchTo().window(windowId);
            if (driver.getTitle().equals("OrangeHRM")) {
                driver.close();
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
