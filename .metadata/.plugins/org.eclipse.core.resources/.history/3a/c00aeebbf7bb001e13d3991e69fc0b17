package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ScreenshotAshot {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://bangladesh.gov.bd/index.php");
        driver.manage().window().maximize();

        // Use AShot to take a screenshot
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        // Save the screenshot to a file
        ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "/src/Screenshot/ScreenshotAshot.png"));

        System.out.println("Screenshot Taken!");
        driver.quit();
    }
}
