package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertPopup {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mypage.rediff.com/login/dologin/");

        // Opens alert window
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Alert alertWindow = driver.switchTo().alert();
        System.out.println(alertWindow.getText());

        alertWindow.accept(); // OK

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
