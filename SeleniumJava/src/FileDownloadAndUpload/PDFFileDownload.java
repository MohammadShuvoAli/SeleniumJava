package FileDownloadAndUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.HashMap;
import java.util.Map;

public class PDFFileDownload {

    public static void main(String[] args) {
        // Uncomment the desired browser setup
         WebDriver driver = chromeSetup();
        // WebDriver driver = edgeSetup();
        // WebDriver driver = firefoxSetup();

        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();

        // Wait for the download to complete (you may need to adjust this based on your needs)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.quit();
    }

    private static WebDriver chromeSetup() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", System.getProperty("user.dir"));
        prefs.put("plugins.always_open_pdf_externally", true);
        options.setExperimentalOption("prefs", prefs);

        return new ChromeDriver(options);
    }

    private static WebDriver edgeSetup() {
        EdgeOptions options = new EdgeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", System.getProperty("user.dir"));
        prefs.put("plugins.always_open_pdf_externally", true);
        options.setExperimentalOption("prefs", prefs);

        return new EdgeDriver(options);
    }

    private static WebDriver firefoxSetup() {
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
        options.addPreference("browser.download.manager.showWhenStarting", false);
        options.addPreference("pdfjs.disabled", true);
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.dir", System.getProperty("user.dir"));

        return new FirefoxDriver(options);
    }
}
