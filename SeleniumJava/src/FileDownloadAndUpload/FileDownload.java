package FileDownloadAndUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.HashMap;
import java.util.Map;

public class FileDownload {
    public static WebDriver chromeSetup() {
        Map<String, Object> preferences = new HashMap<>();
        preferences.put("download.default_directory", System.getProperty("user.dir") + "/src/FileDownloadAndUpload");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", preferences);
        return new ChromeDriver(options);
    }

    public static WebDriver firefoxSetup() {
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword");
        options.addPreference("browser.download.manager.showWhenStarting", false);
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.dir", System.getProperty("user.dir") + "/src/FileDownloadAndUpload/");
        return new FirefoxDriver(options);
    }

    public static void main(String[] args) {
        // Use chromeSetup() or firefoxSetup() based on your preference
        WebDriver driver = chromeSetup();

        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
