package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookies {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        // Capture cookies from the browser
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Number of Cookies: " + cookies.size());
        System.out.println("All Cookies: " + cookies);

        // Print details of all cookies
        for (Cookie cookie : cookies) {
            System.out.println(cookie);
        }

        // Print specific details from cookies
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ", " + cookie.getValue());
        }

        // Add a new cookie to the browser
        driver.manage().addCookie(new Cookie("Shuvo", "123456"));
        cookies = driver.manage().getCookies();
        System.out.println("Number of Cookies after adding: " + cookies.size());
        for (Cookie cookie : cookies) {
            System.out.println(cookie.getName() + ", " + cookie.getValue());
        }

        // Delete a specific cookie
        driver.manage().deleteCookieNamed("Shuvo");
        cookies = driver.manage().getCookies();
        System.out.println("Number of Cookies after deleting 'Shuvo': " + cookies.size());

        // Delete all cookies
        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println("Number of Cookies after deleting all: " + cookies.size());

        driver.quit();
    }
}
