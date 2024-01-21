package com.selenium.java.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Locators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Set implicit wait [OLD]
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        // Set implicit wait NEW
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // Searching element using ID, Name & Class Locator
        driver.findElement(By.id("small-searchterms")).clear();
        driver.findElement(By.name("q")).sendKeys("Apple");
        driver.findElement(By.className("search-box-button")).click();
        System.out.println("Button Pressed");

        // Going Back to Homepage
        driver.navigate().back();

        // Finding Element using link text
        driver.findElement(By.linkText("Build your own computer")).click();
        // Going Back to Homepage
        driver.navigate().back();

        // Finding element using partial link text
        driver.findElement(By.partialLinkText("HTC")).click();
        driver.navigate().back();

        // Counting no. of slides using find_elements
        List<WebElement> slides = driver.findElements(By.className("nivo-control"));
        System.out.println(slides.size() + " Slides");

        // Counting no. of links available on the homepage using TAG_NAME locator
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size() + " Links");

        driver.quit();
    }
}
