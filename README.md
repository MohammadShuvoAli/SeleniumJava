# 🚀 Java Selenium 4 WebDriver - Complete Automation Framework

[![Selenium](https://img.shields.io/badge/Selenium-4.0+-green.svg)](https://www.selenium.dev/)
[![Java](https://img.shields.io/badge/Java-8%2B-orange.svg)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## 📑 Table of Contents

- [📖 Project Overview](#-project-overview)
- [🎯 Why This Project?](#-why-this-project)
  - [For Beginners](#for-beginners)
  - [For Intermediate Users](#for-intermediate-users)
  - [For Advanced Users](#for-advanced-users)
- [🛠️ Technologies & Tools](#️-technologies--tools)
- [💻 System Requirements](#-system-requirements)
- [🚀 Installation & Setup](#-installation--setup)
  - [Step 1: Install Java Development Kit (JDK)](#step-1-install-java-development-kit-jdk)
  - [Step 2: Install IDE (Eclipse Recommended)](#step-2-install-ide-eclipse-recommended)
  - [Step 3: Clone the Repository](#step-3-clone-the-repository)
  - [Step 4: Import Project into Eclipse](#step-4-import-project-into-eclipse)
  - [Step 5: Configure WebDriver](#step-5-configure-webdriver)
  - [Step 6: Download Browser Drivers](#step-6-download-browser-drivers)
  - [Step 7: Verify Setup](#step-7-verify-setup)
- [🏗️ Project Architecture](#️-project-architecture)
- [📚 Detailed Module Documentation](#-detailed-module-documentation)
  - [1. FirstScript - Getting Started](#1-firstscript---getting-started)
  - [2. Locators - Element Identification](#2-locators---element-identification)
  - [3. Commands - WebDriver Operations](#3-commands---webdriver-operations)
  - [4. Wait Commands - Synchronization](#4-wait-commands---synchronization)
  - [5. Alerts - Popup Handling](#5-alerts---popup-handling)
  - [6. Mouse Operations - Advanced Interactions](#6-mouse-operations---advanced-interactions)
  - [7. Keyboard Actions - Input Simulation](#7-keyboard-actions---input-simulation)
  - [8. Dropdown Handling](#8-dropdown-handling)
  - [9. Checkbox Handling](#9-checkbox-handling)
  - [10. iframes - Frame Management](#10-iframes---frame-management)
  - [11. Browser Window Management](#11-browser-window-management)
  - [12. Tables - Data Extraction](#12-tables---data-extraction)
  - [13. Links - Link Validation](#13-links---link-validation)
  - [14. Cookies Management](#14-cookies-management)
  - [15. Date Picker Automation](#15-date-picker-automation)
  - [16. File Operations](#16-file-operations)
  - [17. Excel Integration](#17-excel-integration)
  - [18. Data-Driven Testing](#18-data-driven-testing)
  - [19. Screenshot Capture](#19-screenshot-capture)
  - [20. Headless Testing](#20-headless-testing)
  - [21. Test Case Automation](#21-test-case-automation)
- [🎓 Code Examples & Best Practices](#-code-examples--best-practices)
  - [Page Object Model (POM) Pattern](#page-object-model-pom-pattern)
  - [Singleton WebDriver Manager](#singleton-webdriver-manager)
  - [Configuration Management](#configuration-management)
- [🔧 Common Patterns & Solutions](#-common-patterns--solutions)
  - [Handle Stale Element Exception](#handle-stale-element-exception)
  - [Dynamic Element Wait](#dynamic-element-wait)
  - [JavaScript Executor Utilities](#javascript-executor-utilities)
- [🐛 Troubleshooting Guide](#-troubleshooting-guide)
  - [Common Issues & Solutions](#common-issues--solutions)
  - [Debug Techniques](#debug-techniques)
- [⚡ Performance Optimization](#-performance-optimization)
  - [Best Practices for Fast Execution](#best-practices-for-fast-execution)
- [🔄 CI/CD Integration](#-cicd-integration)
  - [Jenkins Integration](#jenkins-integration)
  - [GitHub Actions](#github-actions)
- [🤝 Contributing Guidelines](#-contributing-guidelines)
  - [How to Contribute](#how-to-contribute)
  - [Code Standards](#code-standards)
- [❓ FAQ](#-faq)
- [📚 Resources & References](#-resources--references)
  - [Official Documentation](#official-documentation)
  - [Learning Resources](#learning-resources)
  - [Tools & Libraries](#tools--libraries)
  - [Communities](#communities)

---

## 📖 Project Overview

This is a **comprehensive Selenium WebDriver 4 automation framework** built with Java, designed to provide practical, real-world examples of web automation testing. The project covers everything from basic WebDriver setup to advanced automation scenarios including data-driven testing, screenshot capture, and complex user interactions.

### Key Highlights

✅ **50+ Automation Scenarios** covering all major Selenium functionalities  
✅ **Production-Ready Code** with proper exception handling and best practices  
✅ **Data-Driven Framework** with Excel integration  
✅ **Multiple Locator Strategies** (CSS, XPath, Axes)  
✅ **Advanced Wait Mechanisms** (Implicit, Explicit, Fluent)  
✅ **Screenshot & Reporting** capabilities  
✅ **Headless Browser** support  
✅ **Cross-Browser Testing** ready  
✅ **Well-Documented** code with inline comments  

---

## 🎯 Why This Project?

### For Beginners
- 🔰 **Step-by-step examples** starting from basic browser launch to advanced scenarios
- 📚 **Well-commented code** explaining every action
- 🎓 **Learning path** from simple to complex implementations

### For Intermediate Users
- 🔧 **Real-world scenarios** you'll encounter in actual projects
- 🎨 **Multiple approaches** to solve the same problem
- 📊 **Data-driven testing** framework implementation

### For Advanced Users
- ⚡ **Performance optimization** techniques
- 🏗️ **Framework architecture** patterns
- 🔍 **Debugging strategies** and troubleshooting

---

## 🛠️ Technologies & Tools

| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 8+ | Programming Language |
| **Selenium WebDriver** | 4.0+ | Browser Automation |
| **Apache POI** | 5.0+ | Excel File Operations |
| **AShot** | 1.5+ | Full-Page Screenshots |
| **ChromeDriver** | Latest | Chrome Browser Automation |
| **GeckoDriver** | Latest | Firefox Browser Automation |

### Additional Libraries
- **selenium-java**: Core Selenium WebDriver library
- **poi-ooxml**: Excel file manipulation
- **ashot**: Screenshot library for full-page captures
- **commons-io**: File operations utilities

---

## 💻 System Requirements

### Minimum Requirements
- **OS**: Windows 10/11, macOS 10.14+, Linux (Ubuntu 18.04+)
- **RAM**: 4GB (8GB recommended)
- **Disk Space**: 500MB for project + dependencies
- **Java**: JDK 8 or higher
- **IDE**: Eclipse, IntelliJ IDEA, or VS Code with Java extensions

### Browser Requirements
- Google Chrome (latest stable version)
- Mozilla Firefox (latest stable version)
- Microsoft Edge (latest stable version)

---

## 🚀 Installation & Setup

### Step 1: Install Java Development Kit (JDK)

**Windows:**
```bash
# Download JDK from Oracle or use Chocolatey
choco install openjdk11
```

**macOS:**
```bash
brew install openjdk@11
```

**Linux:**
```bash
sudo apt update
sudo apt install openjdk-11-jdk
```

**Verify Installation:**
```bash
java -version
javac -version
```

### Step 2: Install IDE (Eclipse Recommended)

**Download Eclipse IDE for Java Developers:**
- Visit: https://www.eclipse.org/downloads/
- Choose "Eclipse IDE for Java Developers"
- Extract and run the installer

### Step 3: Clone the Repository

```bash
# Using HTTPS
git clone https://github.com/MohammadShuvoAli/SeleniumJava.git

# Using SSH
git clone git@github.com:MohammadShuvoAli/SeleniumJava.git

# Navigate to project directory
cd SeleniumJava
```

### Step 4: Import Project into Eclipse

1. Open Eclipse IDE
2. File → Import → Existing Projects into Workspace
3. Browse to the cloned repository folder
4. Select the project and click "Finish"
5. Wait for Eclipse to build the workspace

### Step 5: Configure WebDriver

**Option A: Manual Setup**
```java
// Set the driver path in your code
System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
```

**Option B: Using WebDriverManager (Recommended)**
```xml
<!-- Add to pom.xml if using Maven -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.5.3</version>
</dependency>
```

```java
// In your Java code
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
```

### Step 6: Download Browser Drivers

**ChromeDriver:**
- Visit: https://chromedriver.chromium.org/
- Download version matching your Chrome browser
- Extract and place in `C:\drivers\` (Windows) or `/usr/local/bin/` (Mac/Linux)

**GeckoDriver (Firefox):**
- Visit: https://github.com/mozilla/geckodriver/releases
- Download and extract
- Place in the same drivers folder

### Step 7: Verify Setup

Run the first script:
```bash
# Navigate to the FirstScript folder
cd SeleniumJava/src/FirstScript

# Compile
javac -cp ".:*" OpenGoogle.java

# Run (Windows)
java -cp "C:\path\to\selenium-java.jar;." FirstScript.OpenGoogle

# Run (Mac/Linux)
java -cp "/path/to/selenium-java.jar:." FirstScript.OpenGoogle
```

---

## 🏗️ Project Architecture

```
SeleniumJava/
│
├── src/                          # Source code directory
│   ├── FirstScript/              # Getting started examples
│   ├── Locators/                 # Element location strategies
│   ├── Commands/                 # WebDriver commands
│   ├── Wait_Commands/            # Synchronization techniques
│   ├── Alerts/                   # Alert & popup handling
│   ├── MouseOperations/          # Mouse interaction examples
│   ├── KeyboardActions/          # Keyboard input handling
│   ├── Dropdown/                 # Dropdown selection methods
│   ├── Checkbox/                 # Checkbox interaction
│   ├── iframes/                  # Frame switching
│   ├── BrowserWindow/            # Window management
│   ├── Table/                    # Table data extraction
│   ├── Links/                    # Link validation
│   ├── Cookies/                  # Cookie operations
│   ├── DatePicker/               # Date picker automation
│   ├── FileDownloadAndUpload/    # File operations
│   ├── ExcelReadWrite/           # Excel utilities
│   ├── DataDrivenTesting/        # Data-driven framework
│   ├── Screenshot/               # Screenshot utilities
│   ├── HeadlessTesting/          # Headless browser execution
│   └── TestCaseAutomation/       # Complete test scenarios
│
├── bin/                          # Compiled .class files
├── lib/                          # External libraries (if any)
└── README.md                     # Project documentation
```

---

## 📚 Detailed Module Documentation

## 1. FirstScript - Getting Started

### 📁 Location: `src/FirstScript/`

### Overview
The FirstScript module contains the simplest Selenium script to help beginners understand the basic structure of a Selenium test. It demonstrates browser initialization, navigation, validation, and cleanup.

### Files
- **OpenGoogle.java** - Opens Google, verifies the title, and closes the browser

### Code Walkthrough

```java
package FirstScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    public static void main(String[] args) {
        // Step 1: Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        
        // Step 2: Initialize WebDriver instance
        WebDriver driver = new ChromeDriver();
        
        // Step 3: Navigate to URL
        driver.get("https://www.google.com");
        
        // Step 4: Validate page title
        if (driver.getTitle().equals("Google"))
            System.out.println("Test Passed!!!");
        else
            System.out.println("Test Failed!!!");
        
        // Step 5: Close browser and cleanup
        driver.quit();
    }
}
```

### Key Concepts

| Concept | Explanation |
|---------|-------------|
| `System.setProperty()` | Sets the system property for ChromeDriver executable path |
| `new ChromeDriver()` | Creates a new instance of Chrome browser |
| `driver.get()` | Navigates to the specified URL |
| `driver.getTitle()` | Returns the current page title |
| `driver.quit()` | Closes all browser windows and ends the session |

### Difference: `quit()` vs `close()`

```java
driver.close();  // Closes current window only
driver.quit();   // Closes all windows and ends session (RECOMMENDED)
```

### How to Run
1. Update the ChromeDriver path
2. Right-click → Run As → Java Application
3. Observe browser opening and closing automatically

---

## 2. Locators - Element Identification

### 📁 Location: `src/Locators/`

### Overview
Locators are the foundation of Selenium automation. This module demonstrates all 8 types of locators supported by Selenium WebDriver, with emphasis on CSS and XPath strategies.

### Files
- **Locators.java** - Basic locator strategies (ID, Name, ClassName, etc.)
- **CSS_Locators.java** - CSS selector patterns and techniques
- **XPATH_Locators.java** - XPath expressions and syntax
- **XPATH_Axes.java** - Advanced XPath axes navigation

### Types of Locators

| Locator Type | Syntax | Use Case |
|--------------|--------|----------|
| **ID** | `By.id("elementId")` | Fastest, unique identifiers |
| **Name** | `By.name("elementName")` | Form fields with name attribute |
| **ClassName** | `By.className("className")` | Multiple elements with same class |
| **TagName** | `By.tagName("input")` | Find elements by HTML tag |
| **LinkText** | `By.linkText("Click Here")` | Links with exact text |
| **PartialLinkText** | `By.partialLinkText("Click")` | Links with partial text match |
| **CSS Selector** | `By.cssSelector("#id .class")` | Flexible, faster than XPath |
| **XPath** | `By.xpath("//div[@id='test']")` | Most powerful, traverse any direction |

### CSS Selector Patterns

```java
// Tag & ID
driver.findElement(By.cssSelector("#email"));
driver.findElement(By.cssSelector("input#email"));

// Tag & Class
driver.findElement(By.cssSelector(".inputtext"));
driver.findElement(By.cssSelector("input.inputtext"));

// Tag & Attribute
driver.findElement(By.cssSelector("[name='username']"));
driver.findElement(By.cssSelector("input[name='username']"));

// Multiple Attributes
driver.findElement(By.cssSelector("input[type='text'][name='email']"));

// Contains Attribute Value
driver.findElement(By.cssSelector("input[id^='user']"));    // Starts with
driver.findElement(By.cssSelector("input[id$='name']"));    // Ends with
driver.findElement(By.cssSelector("input[id*='user']"));    // Contains

// Child & Descendant
driver.findElement(By.cssSelector("div > input"));          // Direct child
driver.findElement(By.cssSelector("div input"));            // Any descendant

// Nth-child
driver.findElement(By.cssSelector("ul li:nth-child(2)"));   // 2nd child
driver.findElement(By.cssSelector("ul li:first-child"));    // First child
driver.findElement(By.cssSelector("ul li:last-child"));     // Last child
```

### XPath Patterns

```java
// Absolute XPath (Avoid - brittle)
driver.findElement(By.xpath("/html/body/div[1]/form/input"));

// Relative XPath (Recommended)
driver.findElement(By.xpath("//input[@id='username']"));

// Text-based XPath
driver.findElement(By.xpath("//button[text()='Submit']"));
driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));

// Multiple Attributes
driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
driver.findElement(By.xpath("//input[@type='text' or @name='email']"));

// Starts-with, Contains
driver.findElement(By.xpath("//input[starts-with(@id,'user')]"));
driver.findElement(By.xpath("//input[contains(@class,'input-field')]"));

// XPath Axes
driver.findElement(By.xpath("//div[@id='parent']/child::input"));
driver.findElement(By.xpath("//input[@id='email']/following-sibling::input"));
driver.findElement(By.xpath("//input[@id='email']/preceding-sibling::label"));
driver.findElement(By.xpath("//input[@id='email']/parent::div"));
driver.findElement(By.xpath("//input[@id='email']/ancestor::form"));
```

### XPath Axes Explained

```java
// Child - Direct children only
//div[@id='parent']/child::input

// Descendant - All children at any level
//div[@id='parent']/descendant::input

// Following - All nodes after current node
//input[@id='username']/following::input

// Following-sibling - Siblings after current node
//input[@id='username']/following-sibling::input

// Preceding - All nodes before current node
//input[@id='username']/preceding::label

// Preceding-sibling - Siblings before current node
//input[@id='username']/preceding-sibling::label

// Parent - Direct parent node
//input[@id='username']/parent::div

// Ancestor - All parent nodes
//input[@id='username']/ancestor::form
```

### Best Practices for Locators

✅ **Priority Order:**
1. ID (if unique and stable)
2. Name (for form fields)
3. CSS Selector (fast and flexible)
4. XPath (when DOM traversal needed)

❌ **Avoid:**
- Absolute XPath
- Class names that change dynamically
- Index-based selectors (fragile)

---

## 3. Commands - WebDriver Operations

### 📁 Location: `src/Commands/`

### Files
- **browserCommands.java** - Browser-level operations
- **navigationalCommands.java** - Navigation methods
- **applicationCommands.java** - Application-specific commands
- **conditionalCommands.java** - Element state verification

### Browser Commands

```java
// Get current URL
String currentUrl = driver.getCurrentUrl();

// Get page title
String title = driver.getTitle();

// Get page source
String pageSource = driver.getPageSource();

// Get current window handle
String windowHandle = driver.getWindowHandle();

// Get all window handles
Set<String> allHandles = driver.getWindowHandles();

// Close current window
driver.close();

// Close all windows and quit
driver.quit();
```

### Navigational Commands

```java
// Navigate to URL
driver.get("https://www.example.com");
driver.navigate().to("https://www.example.com");  // Same as get()

// Navigate back
driver.navigate().back();

// Navigate forward
driver.navigate().forward();

// Refresh page
driver.navigate().refresh();
```

### Application Commands

```java
WebElement element = driver.findElement(By.id("username"));

// Send text to element
element.sendKeys("testuser");

// Clear element text
element.clear();

// Click element
element.click();

// Get element text
String text = element.getText();

// Get attribute value
String value = element.getAttribute("value");

// Submit form
element.submit();
```

### Conditional Commands

```java
WebElement element = driver.findElement(By.id("checkbox"));

// Check if element is displayed
boolean isDisplayed = element.isDisplayed();

// Check if element is enabled
boolean isEnabled = element.isEnabled();

// Check if element is selected (checkbox/radio)
boolean isSelected = element.isSelected();

// Example usage
if (element.isDisplayed() && element.isEnabled()) {
    element.click();
}
```

---

## 4. Wait Commands - Synchronization

### 📁 Location: `src/Wait_Commands/`

### Overview
Wait commands are crucial for handling dynamic web pages where elements load at different times. Proper synchronization prevents `NoSuchElementException` and flaky tests.

### Files
- **implicitWait.java** - Global wait applied to all elements
- **explicitWait.java** - Specific wait for particular conditions
- **fluentWait.java** - Customizable polling wait with exception handling

### Implicit Wait

```java
import java.time.Duration;

// Set implicit wait (applies to all findElement calls)
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// Now all element searches will wait up to 10 seconds
WebElement element = driver.findElement(By.id("dynamicElement"));
```

**Characteristics:**
- ✅ Global wait for all elements
- ✅ Simple to implement
- ❌ Cannot customize per element
- ❌ Less flexible

### Explicit Wait

```java
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

// Create WebDriverWait instance
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Wait for element to be clickable
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitButton")));
element.click();

// Wait for element to be visible
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));

// Wait for text to be present
wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("status"), "Success"));

// Wait for element to be invisible
wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));

// Wait for alert to be present
wait.until(ExpectedConditions.alertIsPresent());

// Wait for frame and switch
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frameName"));

// Wait for number of windows
wait.until(ExpectedConditions.numberOfWindowsToBe(2));
```

### Common ExpectedConditions

| Condition | Usage |
|-----------|-------|
| `presenceOfElementLocated()` | Element exists in DOM |
| `visibilityOfElementLocated()` | Element is visible |
| `elementToBeClickable()` | Element is clickable |
| `invisibilityOfElementLocated()` | Element is not visible |
| `textToBePresentInElement()` | Element contains text |
| `titleIs()` | Page title matches |
| `urlContains()` | URL contains text |
| `alertIsPresent()` | Alert popup is present |

### Fluent Wait

```java
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.NoSuchElementException;
import java.time.Duration;

// Create FluentWait instance
FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(30))
    .pollingEvery(Duration.ofSeconds(2))
    .ignoring(NoSuchElementException.class);

// Use the fluent wait
WebElement element = fluentWait.until(driver -> 
    driver.findElement(By.id("dynamicElement"))
);
```

**Characteristics:**
- ✅ Most flexible wait mechanism
- ✅ Custom polling intervals
- ✅ Ignore specific exceptions
- ✅ Custom wait conditions

### Wait Strategy Comparison

| Feature | Implicit | Explicit | Fluent |
|---------|----------|----------|--------|
| Scope | Global | Specific | Specific |
| Customization | Low | Medium | High |
| Polling Interval | Fixed | Fixed | Custom |
| Exception Handling | No | No | Yes |
| Recommended | No | Yes | Advanced |

### Best Practices

```java
// ❌ DON'T mix implicit and explicit waits
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Conflict!

// ✅ DO use explicit waits only
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// ✅ DO create reusable wait methods
public WebElement waitForElement(By locator, int timeout) {
    return new WebDriverWait(driver, Duration.ofSeconds(timeout))
        .until(ExpectedConditions.presenceOfElementLocated(locator));
}

// ✅ DO wait for specific conditions
wait.until(ExpectedConditions.elementToBeClickable(loginButton));

// ❌ DON'T use Thread.sleep (hard wait)
Thread.sleep(5000);  // Bad practice!
```

---

## 5. Alerts - Popup Handling

### 📁 Location: `src/Alerts/`

### Files
- **Alerts.java** - Basic alert handling
- **AlertPopup.java** - Alert acceptance and dismissal
- **AuthenticationPopup.java** - HTTP authentication dialogs
- **NotificationPopup.java** - Browser notification handling

### Types of JavaScript Alerts

#### 1. Simple Alert (OK button only)
```java
// Trigger alert
driver.findElement(By.id("alertButton")).click();

// Switch to alert
Alert alert = driver.switchTo().alert();

// Get alert text
String alertText = alert.getText();
System.out.println("Alert says: " + alertText);

// Accept alert (click OK)
alert.accept();
```

#### 2. Confirmation Alert (OK and Cancel)
```java
// Trigger confirmation
driver.findElement(By.id("confirmButton")).click();

// Switch to alert
Alert alert = driver.switchTo().alert();

// Accept (OK)
alert.accept();

// OR Dismiss (Cancel)
alert.dismiss();
```

#### 3. Prompt Alert (Input field with OK and Cancel)
```java
// Trigger prompt
driver.findElement(By.id("promptButton")).click();

// Switch to alert
Alert alert = driver.switchTo().alert();

// Enter text in prompt
alert.sendKeys("Test User");

// Accept
alert.accept();
```

### Authentication Popup (HTTP Basic Auth)

```java
// Method 1: Pass credentials in URL
String username = "admin";
String password = "admin123";
String url = "https://username:password@example.com/login";

driver.get("https://" + username + ":" + password + "@example.com/login");

// Method 2: Using AutoIT (Windows only)
// Requires external AutoIT script for Windows security dialogs
```

### Wait for Alert

```java
// Wait for alert to be present
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
Alert alert = wait.until(ExpectedConditions.alertIsPresent());
alert.accept();
```

### Handle Alert with Exception Handling

```java
try {
    Alert alert = driver.switchTo().alert();
    System.out.println("Alert text: " + alert.getText());
    alert.accept();
} catch (NoAlertPresentException e) {
    System.out.println("No alert present");
}
```

---

## 6. Mouse Operations - Advanced Interactions

### 📁 Location: `src/MouseOperations/`

### Files
- **MouseHover.java** - Hover over elements
- **MouseDoubleClick.java** - Double-click actions
- **MouseRightClick.java** - Context menu operations
- **DragAndDrop.java** - Drag and drop functionality
- **MouseScroll.java** - Page scrolling
- **Slider.java** - Slider manipulation

### Actions Class Overview

```java
import org.openqa.selenium.interactions.Actions;

// Create Actions instance
Actions actions = new Actions(driver);
```

### Mouse Hover (Move to Element)

```java
WebElement element = driver.findElement(By.id("menuItem"));

// Hover over element
actions.moveToElement(element).perform();

// Hover and click
actions.moveToElement(element).click().perform();

// Hover over submenu
WebElement mainMenu = driver.findElement(By.id("mainMenu"));
WebElement subMenu = driver.findElement(By.id("subMenu"));

actions.moveToElement(mainMenu)
    .pause(Duration.ofSeconds(1))
    .moveToElement(subMenu)
    .click()
    .perform();
```

### Right Click (Context Click)

```java
WebElement element = driver.findElement(By.id("rightClickArea"));

// Right click
actions.contextClick(element).perform();

// Right click and select option
actions.contextClick(element).perform();
driver.findElement(By.id("contextOption")).click();
```

### Double Click

```java
WebElement element = driver.findElement(By.id("doubleClickButton"));

// Double click
actions.doubleClick(element).perform();
```

### Drag and Drop

```java
WebElement source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));

// Method 1: dragAndDrop
actions.dragAndDrop(source, target).perform();

// Method 2: clickAndHold + moveToElement + release
actions.clickAndHold(source)
    .moveToElement(target)
    .release()
    .perform();

// Method 3: dragAndDropBy (move by offset)
actions.dragAndDropBy(source, 100, 200).perform();  // x=100, y=200
```

### Scrolling

```java
// Scroll to element
WebElement element = driver.findElement(By.id("footer"));
actions.scrollToElement(element).perform();

// Scroll by amount (Selenium 4)
actions.scrollByAmount(0, 500).perform();  // Scroll down 500 pixels

// Scroll from element
actions.scrollFromOrigin(
    WheelInput.ScrollOrigin.fromElement(element),
    0, 200
).perform();

// JavaScript scroll (Alternative)
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0, 500)");
js.executeScript("arguments[0].scrollIntoView(true);", element);
```

### Slider Manipulation

```java
WebElement slider = driver.findElement(By.id("priceSlider"));

// Move slider by offset
actions.clickAndHold(slider)
    .moveByOffset(100, 0)  // Move 100px to the right
    .release()
    .perform();

// Drag to specific position
actions.dragAndDropBy(slider, 150, 0).perform();
```

### Complex Action Chains

```java
// Build complex action sequence
actions.moveToElement(element1)
    .click()
    .keyDown(Keys.CONTROL)
    .click(element2)
    .click(element3)
    .keyUp(Keys.CONTROL)
    .perform();

// Pause between actions
actions.moveToElement(element)
    .pause(Duration.ofSeconds(2))
    .click()
    .perform();
```

---

## 7. Keyboard Actions - Input Simulation

### 📁 Location: `src/KeyboardActions/`

### Files
- **KeyboardActions.java** - Keyboard operations and shortcuts

### Basic Keyboard Operations

```java
import org.openqa.selenium.Keys;

WebElement textBox = driver.findElement(By.id("searchBox"));

// Type text
textBox.sendKeys("Selenium WebDriver");

// Press Enter
textBox.sendKeys(Keys.ENTER);

// Clear and type
textBox.clear();
textBox.sendKeys("New Text");

// Type special keys
textBox.sendKeys(Keys.TAB);
textBox.sendKeys(Keys.ESCAPE);
textBox.sendKeys(Keys.BACK_SPACE);
textBox.sendKeys(Keys.DELETE);
```

### Keyboard Shortcuts

```java
Actions actions = new Actions(driver);
WebElement element = driver.findElement(By.id("textField"));

// Ctrl+A (Select all)
actions.keyDown(Keys.CONTROL)
    .sendKeys("a")
    .keyUp(Keys.CONTROL)
    .perform();

// Ctrl+C (Copy)
actions.keyDown(Keys.CONTROL)
    .sendKeys("c")
    .keyUp(Keys.CONTROL)
    .perform();

// Ctrl+V (Paste)
actions.keyDown(Keys.CONTROL)
    .sendKeys("v")
    .keyUp(Keys.CONTROL)
    .perform();

// Ctrl+X (Cut)
actions.keyDown(Keys.CONTROL)
    .sendKeys("x")
    .keyUp(Keys.CONTROL)
    .perform();
```

### Common Key Combinations

```java
// Refresh page (F5)
actions.sendKeys(Keys.F5).perform();

// Ctrl+Shift+Delete (Browser history)
actions.keyDown(Keys.CONTROL)
    .keyDown(Keys.SHIFT)
    .sendKeys(Keys.DELETE)
    .keyUp(Keys.SHIFT)
    .keyUp(Keys.CONTROL)
    .perform();

// Page Down
actions.sendKeys(Keys.PAGE_DOWN).perform();

// Page Up
actions.sendKeys(Keys.PAGE_UP).perform();

// Home (Go to top)
actions.sendKeys(Keys.HOME).perform();

// End (Go to bottom)
actions.sendKeys(Keys.END).perform();
```

### Type Without Focusing Element

```java
// Send keys to active element
actions.sendKeys("text to type").perform();

// Send keys to body
actions.sendKeys(Keys.chord(Keys.CONTROL, "t")).perform();  // New tab
```

---

## 8. Dropdown Handling

### 📁 Location: `src/Dropdown/`

### Files
- **DropdownHandling.java** - Standard dropdown operations
- **BootstrapDropdown.java** - Bootstrap dropdown handling

### Standard HTML Select Dropdown

```java
import org.openqa.selenium.support.ui.Select;

WebElement dropdownElement = driver.findElement(By.id("country"));
Select dropdown = new Select(dropdownElement);

// Select by visible text
dropdown.selectByVisibleText("United States");

// Select by value attribute
dropdown.selectByValue("usa");

// Select by index (0-based)
dropdown.selectByIndex(2);

// Get selected option
WebElement selected = dropdown.getFirstSelectedOption();
System.out.println("Selected: " + selected.getText());

// Get all options
List<WebElement> options = dropdown.getOptions();
for (WebElement option : options) {
    System.out.println(option.getText());
}

// Check if multi-select
boolean isMulti = dropdown.isMultiple();

// Deselect (multi-select only)
if (dropdown.isMultiple()) {
    dropdown.deselectByVisibleText("Option 1");
    dropdown.deselectAll();
}
```

### Bootstrap/Custom Dropdown (Non-Select)

```java
// Open dropdown
driver.findElement(By.id("dropdownToggle")).click();

// Wait for options to appear
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropdown-menu")));

// Select option
driver.findElement(By.xpath("//li[text()='Option 2']")).click();

// Select using Actions class
WebElement dropdown = driver.findElement(By.id("customDropdown"));
WebElement option = driver.findElement(By.xpath("//div[@data-value='option1']"));

Actions actions = new Actions(driver);
actions.moveToElement(dropdown).click().perform();
actions.moveToElement(option).click().perform();
```

### Auto-Suggest Dropdown

```java
// Type in search box
WebElement searchBox = driver.findElement(By.id("autoComplete"));
searchBox.sendKeys("Selenium");

// Wait for suggestions
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("suggestions")));

// Select from suggestions
List<WebElement> suggestions = driver.findElements(By.className("suggestion-item"));
for (WebElement suggestion : suggestions) {
    if (suggestion.getText().contains("Selenium WebDriver")) {
        suggestion.click();
        break;
    }
}
```

---

## 9. Checkbox Handling

### 📁 Location: `src/Checkbox/`

### Files
- **checkboxHandling.java** - Checkbox selection and verification

### Basic Checkbox Operations

```java
WebElement checkbox = driver.findElement(By.id("termsCheckbox"));

// Check if selected
if (!checkbox.isSelected()) {
    checkbox.click();  // Select checkbox
}

// Uncheck if selected
if (checkbox.isSelected()) {
    checkbox.click();  // Deselect checkbox
}

// Verify checkbox state
boolean isChecked = checkbox.isSelected();
System.out.println("Checkbox is selected: " + isChecked);
```

### Select Multiple Checkboxes

```java
// Get all checkboxes
List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

// Select all
for (WebElement checkbox : checkboxes) {
    if (!checkbox.isSelected()) {
        checkbox.click();
    }
}

// Select specific checkboxes
String[] optionsToSelect = {"Option1", "Option3", "Option5"};
for (String option : optionsToSelect) {
    driver.findElement(By.xpath("//input[@value='" + option + "']")).click();
}
```

### Radio Button Handling

```java
// Select radio button
WebElement radioButton = driver.findElement(By.id("male"));
if (!radioButton.isSelected()) {
    radioButton.click();
}

// Get selected radio button from group
List<WebElement> radioButtons = driver.findElements(By.name("gender"));
for (WebElement radio : radioButtons) {
    if (radio.isSelected()) {
        System.out.println("Selected: " + radio.getAttribute("value"));
    }
}
```

---

## 10. iframes - Frame Management

### 📁 Location: `src/iframes/`

### Files
- **iframes.java** - Basic frame switching
- **nestedIframe.java** - Nested frame navigation

### Understanding iframes

iframes (inline frames) are HTML elements that embed another HTML document within the current page. You must switch to an iframe before interacting with elements inside it.

### Switching to iframes

```java
// Method 1: By index (0-based)
driver.switchTo().frame(0);

// Method 2: By name or ID
driver.switchTo().frame("frameName");
driver.switchTo().frame("frameId");

// Method 3: By WebElement
WebElement iframe = driver.findElement(By.id("myFrame"));
driver.switchTo().frame(iframe);

// Interact with elements inside frame
driver.findElement(By.id("elementInFrame")).click();

// Switch back to main content
driver.switchTo().defaultContent();
```

### Nested iframes

```java
// Switch to parent iframe
driver.switchTo().frame("parentFrame");

// Switch to child iframe within parent
driver.switchTo().frame("childFrame");

// Interact with element
driver.findElement(By.id("elementInChildFrame")).sendKeys("text");

// Switch back to parent frame
driver.switchTo().parentFrame();

// Or switch back to main content
driver.switchTo().defaultContent();
```

### Check if Element is in iframe

```java
// Get number of iframes on page
List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
System.out.println("Number of iframes: " + iframes.size());

// Search for element in each iframe
for (int i = 0; i < iframes.size(); i++) {
    driver.switchTo().frame(i);
    
    try {
        driver.findElement(By.id("targetElement"));
        System.out.println("Element found in iframe " + i);
        break;
    } catch (NoSuchElementException e) {
        driver.switchTo().defaultContent();
    }
}
```

---

## 11. Browser Window Management

### 📁 Location: `src/BrowserWindow/`

### Files
- **browserWindow.java** - Window and tab handling

### Window Operations

```java
// Maximize window
driver.manage().window().maximize();

// Minimize window (Selenium 4)
driver.manage().window().minimize();

// Fullscreen mode
driver.manage().window().fullscreen();

// Get window size
Dimension size = driver.manage().window().getSize();
System.out.println("Width: " + size.getWidth());
System.out.println("Height: " + size.getHeight());

// Set window size
driver.manage().window().setSize(new Dimension(1024, 768));

// Get window position
Point position = driver.manage().window().getPosition();
System.out.println("X: " + position.getX());
System.out.println("Y: " + position.getY());

// Set window position
driver.manage().window().setPosition(new Point(100, 100));
```

### Multiple Window Handling

```java
// Get current window handle
String mainWindow = driver.getWindowHandle();

// Click link that opens new window
driver.findElement(By.linkText("Open New Window")).click();

// Get all window handles
Set<String> allWindows = driver.getWindowHandles();

// Switch to new window
for (String window : allWindows) {
    if (!window.equals(mainWindow)) {
        driver.switchTo().window(window);
        break;
    }
}

// Perform operations in new window
System.out.println("New window title: " + driver.getTitle());

// Close current window
driver.close();

// Switch back to main window
driver.switchTo().window(mainWindow);
```

### Handle Multiple Tabs

```java
// Open new tab (Selenium 4)
driver.switchTo().newWindow(WindowType.TAB);

// Open new window
driver.switchTo().newWindow(WindowType.WINDOW);

// Switch between tabs
ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
driver.switchTo().window(tabs.get(0));  // Switch to first tab
driver.switchTo().window(tabs.get(1));  // Switch to second tab

// Close all except main window
for (String window : driver.getWindowHandles()) {
    if (!window.equals(mainWindow)) {
        driver.switchTo().window(window);
        driver.close();
    }
}
driver.switchTo().window(mainWindow);
```

---

## 12. Tables - Data Extraction

### 📁 Location: `src/Table/`

### Files
- **StaticTable.java** - Fixed table data extraction
- **DynamicTable.java** - Dynamic table pagination handling

### Static Table Handling

```java
// Get table
WebElement table = driver.findElement(By.id("dataTable"));

// Get all rows
List<WebElement> rows = table.findElements(By.tagName("tr"));
System.out.println("Total rows: " + rows.size());

// Get all cells from first row
List<WebElement> cells = rows.get(0).findElements(By.tagName("td"));

// Get specific cell value
WebElement cell = driver.findElement(By.xpath("//table[@id='dataTable']//tr[2]//td[3]"));
System.out.println("Cell value: " + cell.getText());

// Iterate through table
for (int i = 1; i < rows.size(); i++) {  // Start from 1 to skip header
    List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
    
    for (WebElement col : cols) {
        System.out.print(col.getText() + "\t");
    }
    System.out.println();
}
```

### Dynamic Table with Pagination

```java
// Get total pages
String totalPages = driver.findElement(By.id("totalPages")).getText();
int pages = Integer.parseInt(totalPages);

// Iterate through all pages
for (int page = 1; page <= pages; page++) {
    // Extract data from current page
    List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dynamicTable']//tr"));
    
    for (WebElement row : rows) {
        System.out.println(row.getText());
    }
    
    // Click next page
    if (page < pages) {
        driver.findElement(By.linkText("Next")).click();
        Thread.sleep(1000);  // Wait for page load
    }
}
```

### Search in Table

```java
// Find row containing specific text
String searchText = "John Doe";
WebElement targetRow = driver.findElement(
    By.xpath("//table[@id='dataTable']//tr[contains(., '" + searchText + "')]")
);

// Get cell value from found row
String cellValue = targetRow.findElement(By.xpath(".//td[3]")).getText();

// Click button in specific row
driver.findElement(
    By.xpath("//table[@id='dataTable']//tr[contains(., 'John Doe')]//button[@class='edit']")
).click();
```

---

## 13. Links - Link Validation

### 📁 Location: `src/Links/`

### Files
- **links.java** - Link operations
- **brokenLinks.java** - Broken link detection

### Link Operations

```java
// Find link by text
WebElement link = driver.findElement(By.linkText("Click Here"));
link.click();

// Find link by partial text
WebElement partialLink = driver.findElement(By.partialLinkText("Click"));
partialLink.click();

// Get all links on page
List<WebElement> allLinks = driver.findElements(By.tagName("a"));
System.out.println("Total links: " + allLinks.size());

// Print all link texts and URLs
for (WebElement link : allLinks) {
    String url = link.getAttribute("href");
    String text = link.getText();
    System.out.println(text + " -> " + url);
}
```

### Broken Link Detection

```java
import java.net.HttpURLConnection;
import java.net.URL;

public void checkBrokenLinks() {
    List<WebElement> links = driver.findElements(By.tagName("a"));
    
    for (WebElement link : links) {
        String url = link.getAttribute("href");
        
        if (url == null || url.isEmpty()) {
            System.out.println("URL is empty");
            continue;
        }
        
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            
            int responseCode = connection.getResponseCode();
            
            if (responseCode >= 400) {
                System.out.println(url + " - Broken (Code: " + responseCode + ")");
            } else {
                System.out.println(url + " - Valid (Code: " + responseCode + ")");
            }
        } catch (Exception e) {
            System.out.println(url + " - Error: " + e.getMessage());
        }
    }
}
```

---

## 14. Cookies Management

### 📁 Location: `src/Cookies/`

### Files
- **Cookies.java** - Cookie operations

### Cookie Operations

```java
import org.openqa.selenium.Cookie;

// Get all cookies
Set<Cookie> cookies = driver.manage().getCookies();
System.out.println("Total cookies: " + cookies.size());

// Print all cookies
for (Cookie cookie : cookies) {
    System.out.println(cookie.getName() + " = " + cookie.getValue());
}

// Get specific cookie
Cookie cookie = driver.manage().getCookieNamed("sessionId");
if (cookie != null) {
    System.out.println("Session ID: " + cookie.getValue());
}

// Add new cookie
Cookie newCookie = new Cookie("username", "testuser");
driver.manage().addCookie(newCookie);

// Add cookie with more options
Cookie customCookie = new Cookie.Builder("token", "abc123")
    .domain("example.com")
    .path("/")
    .isSecure(true)
    .isHttpOnly(true)
    .build();
driver.manage().addCookie(customCookie);

// Delete specific cookie
driver.manage().deleteCookieNamed("sessionId");

// Delete cookie object
driver.manage().deleteCookie(cookie);

// Delete all cookies
driver.manage().deleteAllCookies();
```

---

## 15. Date Picker Automation

### 📁 Location: `src/DatePicker/`

### Files
- **DatePicker.java** - Calendar widget automation

### Date Picker Handling

```java
// Method 1: Direct input (if allowed)
WebElement dateField = driver.findElement(By.id("datepicker"));
dateField.clear();
dateField.sendKeys("12/25/2024");

// Method 2: Using JavaScript
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].value='2024-12-25'", dateField);

// Method 3: Click through calendar
driver.findElement(By.id("datepicker")).click();

// Select month
Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
month.selectByVisibleText("December");

// Select year
Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
year.selectByValue("2024");

// Select day
driver.findElement(By.xpath("//a[text()='25']")).click();
```

---

## 16. File Operations

### 📁 Location: `src/FileDownloadAndUpload/`

### Files
- **FileUpload.java** - Upload files to web forms
- **FileDownload.java** - Download file verification
- **PDFFileDownload.java** - PDF download handling
- **file-sample_100kB.doc** - Test file
- **file-sample_150kB.pdf** - Test file

### File Upload

```java
// Single file upload
WebElement uploadElement = driver.findElement(By.id("fileUpload"));
String filePath = System.getProperty("user.dir") + "\\src\\FileDownloadAndUpload\\file-sample_100kB.doc";
uploadElement.sendKeys(filePath);

// Click upload button
driver.findElement(By.id("uploadButton")).click();

// Verify upload success
WebElement successMessage = driver.findElement(By.id("uploadMessage"));
System.out.println(successMessage.getText());
```

### File Download

```java
// Set download directory
String downloadPath = System.getProperty("user.dir") + "\\downloads";

ChromeOptions options = new ChromeOptions();
Map<String, Object> prefs = new HashMap<>();
prefs.put("download.default_directory", downloadPath);
prefs.put("download.prompt_for_download", false);
options.setExperimentalOption("prefs", prefs);

WebDriver driver = new ChromeDriver(options);

// Click download link
driver.get("https://example.com/downloads");
driver.findElement(By.linkText("Download File")).click();

// Wait for download to complete
Thread.sleep(5000);

// Verify file exists
File downloadedFile = new File(downloadPath + "\\filename.pdf");
if (downloadedFile.exists()) {
    System.out.println("File downloaded successfully");
}
```

---

## 17. Excel Integration

### 📁 Location: `src/ExcelReadWrite/`

### Files
- **ExcelReader.java** - Read data from Excel
- **ExcelWriter.java** - Write data to Excel
- **XLUtilities.java** - Excel utility methods
- **testdata.xlsx** - Sample test data

### Reading from Excel

```java
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;

public class ExcelReader {
    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir") + "\\src\\ExcelReadWrite\\testdata.xlsx";
        FileInputStream fis = new FileInputStream(filePath);
        
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        
        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(0).getLastCellNum();
        
        // Read all data
        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            
            for (int c = 0; c < cols; c++) {
                XSSFCell cell = row.getCell(c);
                
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                }
            }
            System.out.println();
        }
        
        workbook.close();
        fis.close();
    }
}
```

### Writing to Excel

```java
import org.apache.poi.xssf.usermodel.*;
import java.io.FileOutputStream;

public class ExcelWriter {
    public static void main(String[] args) throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("TestResults");
        
        // Create header row
        XSSFRow headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Test Case");
        headerRow.createCell(1).setCellValue("Result");
        headerRow.createCell(2).setCellValue("Comments");
        
        // Add data
        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("Login Test");
        row1.createCell(1).setCellValue("Passed");
        row1.createCell(2).setCellValue("Login successful");
        
        // Save file
        String filePath = System.getProperty("user.dir") + "\\TestResults.xlsx";
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);
        
        workbook.close();
        fos.close();
        
        System.out.println("File written successfully");
    }
}
```

---

## 18. Data-Driven Testing

### 📁 Location: `src/DataDrivenTesting/`

### Files
- **FDCalculatorTest.java** - Complete DDT implementation
- **caldata.xlsx** - Test data file

### Data-Driven Framework

The FDCalculator test demonstrates a complete data-driven testing approach:

```java
// Read total rows from Excel
int rows = XLUtilities.getRowCount(file, "Sheet1");

// Iterate through each row
for (int r = 2; r <= rows; r++) {
    // Read test data
    String principal = XLUtilities.readData(file, "Sheet1", r, 1);
    String rate = XLUtilities.readData(file, "Sheet1", r, 2);
    
    // Enter data in application
    driver.findElement(By.id("principal")).sendKeys(principal);
    driver.findElement(By.id("interest")).sendKeys(rate);
    
    // Calculate
    driver.findElement(By.id("calculateBtn")).click();
    
    // Get actual result
    String actualResult = driver.findElement(By.id("result")).getText();
    
    // Get expected result from Excel
    String expectedResult = XLUtilities.readData(file, "Sheet1", r, 6);
    
    // Validation
    if (actualResult.equals(expectedResult)) {
        XLUtilities.writeData(file, "Sheet1", r, 8, "Passed");
        XLUtilities.fillGreen(file, "Sheet1", r, 8);
    } else {
        XLUtilities.writeData(file, "Sheet1", r, 8, "Failed");
        XLUtilities.fillRed(file, "Sheet1", r, 8);
    }
}
```

---

## 19. Screenshot Capture

### 📁 Location: `src/Screenshot/`

### Files
- **Screenshot.java** - Basic screenshot capture
- **ScreenshotElements.java** - Element-specific screenshots
- **ScreenshotAshot.java** - Full-page screenshots using AShot

### Full Page Screenshot

```java
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import java.io.File;

// Take screenshot
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
File destination = new File(System.getProperty("user.dir") + "\\screenshot.png");
FileUtils.copyFile(source, destination);
```

### Element Screenshot

```java
// Take screenshot of specific element
WebElement element = driver.findElement(By.id("logo"));
File source = element.getScreenshotAs(OutputType.FILE);
File destination = new File("element_screenshot.png");
FileUtils.copyFile(source, destination);
```

### Full Page Screenshot with AShot

```java
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import javax.imageio.ImageIO;

// Capture full page
Screenshot screenshot = new AShot()
    .shootingStrategy(ShootingStrategies.viewportPasting(1000))
    .takeScreenshot(driver);

// Save screenshot
ImageIO.write(
    screenshot.getImage(),
    "PNG",
    new File("fullpage_screenshot.png")
);
```

### Screenshot on Test Failure

```java
public void captureScreenshot(String testName) {
    try {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = testName + "_" + timestamp + ".png";
        File destination = new File("./screenshots/" + fileName);
        FileUtils.copyFile(source, destination);
        System.out.println("Screenshot saved: " + fileName);
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

---

## 20. Headless Testing

### 📁 Location: `src/HeadlessTesting/`

### Files
- **HeadlessTesting.java** - Headless browser execution

### Chrome Headless

```java
import org.openqa.selenium.chrome.ChromeOptions;

ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");
options.addArguments("--disable-gpu");
options.addArguments("--window-size=1920,1080");

WebDriver driver = new ChromeDriver(options);
driver.get("https://www.example.com");

System.out.println("Title: " + driver.getTitle());
driver.quit();
```

### Firefox Headless

```java
import org.openqa.selenium.firefox.FirefoxOptions;

FirefoxOptions options = new FirefoxOptions();
options.addArguments("--headless");

WebDriver driver = new FirefoxDriver(options);
```

### Why Use Headless Mode?

✅ **Faster execution** - No GUI rendering  
✅ **CI/CD integration** - Run on servers without display  
✅ **Resource efficient** - Lower memory and CPU usage  
✅ **Parallel execution** - Run multiple tests simultaneously  

---

## 21. Test Case Automation

### 📁 Location: `src/TestCaseAutomation/`

### Files
- **TestCaseAutomation.java** - Complete end-to-end test
- **NopCommerce_Login_Test_Case.png** - Test case documentation

This module demonstrates a complete real-world test scenario with:
- Page navigation
- Form filling
- Validation
- Error handling
- Reporting

---

## 🎓 Code Examples & Best Practices

### Page Object Model (POM) Pattern

```java
// LoginPage.java
public class LoginPage {
    WebDriver driver;
    
    // Locators
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginBtn");
    
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    // Actions
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
```

### Singleton WebDriver Manager

```java
public class DriverManager {
    private static WebDriver driver;
    
    private DriverManager() {}
    
    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        return driver;
    }
    
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
```

### Configuration Management

```java
// config.properties
browser=chrome
url=https://www.example.com
timeout=10

// ConfigReader.java
public class ConfigReader {
    private Properties prop;
    
    public ConfigReader() {
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            prop = new Properties();
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String getBrowser() {
        return prop.getProperty("browser");
    }
    
    public String getURL() {
        return prop.getProperty("url");
    }
}
```

---

## 🔧 Common Patterns & Solutions

### Handle Stale Element Exception

```java
public WebElement retryElement(By locator, int attempts) {
    WebElement element = null;
    for (int i = 0; i < attempts; i++) {
        try {
            element = driver.findElement(locator);
            return element;
        } catch (StaleElementReferenceException e) {
            System.out.println("Stale element, retrying... Attempt: " + (i + 1));
        }
    }
    throw new StaleElementReferenceException("Element is stale after " + attempts + " attempts");
}
```

### Dynamic Element Wait

```java
public WebElement waitForElementDynamic(By locator) {
    return new WebDriverWait(driver, Duration.ofSeconds(20))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class)
        .until(ExpectedConditions.presenceOfElementLocated(locator));
}
```

### JavaScript Executor Utilities

```java
public class JSExecutor {
    
    public static void clickJS(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
    
    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    
    public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }
    
    public static String getPageTitle(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.title;").toString();
    }
}
```

---

## 🐛 Troubleshooting Guide

### Common Issues & Solutions

| Issue | Solution |
|-------|----------|
| **ChromeDriver version mismatch** | Download matching ChromeDriver version or use WebDriverManager |
| **ElementNotInteractableException** | Use explicit wait, check if element is visible/enabled |
| **NoSuchElementException** | Verify locator, add wait, check if element is in iframe |
| **StaleElementReferenceException** | Re-find element after page refresh |
| **TimeoutException** | Increase wait time, verify element loads |
| **ElementClickInterceptedException** | Scroll to element, use JavaScript click |
| **SessionNotFoundException** | Driver instance closed, reinitialize driver |

### Debug Techniques

```java
// Highlight element before interaction
public void highlightAndClick(WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].style.border='3px solid red'", element);
    element.click();
}

// Take screenshot on failure
public void screenshotOnFailure(String testName) {
    if (testFailed) {
        captureScreenshot(testName);
    }
}

// Log element details
public void logElementInfo(WebElement element) {
    System.out.println("Tag: " + element.getTagName());
    System.out.println("Text: " + element.getText());
    System.out.println("Displayed: " + element.isDisplayed());
    System.out.println("Enabled: " + element.isEnabled());
}
```

---

## ⚡ Performance Optimization

### Best Practices for Fast Execution

```java
// Use CSS selectors over XPath (faster)
By.cssSelector("#id")  // ✅ Faster
By.xpath("//*[@id='id']")  // ❌ Slower

// Find elements once, reuse
WebElement parent = driver.findElement(By.id("parent"));
parent.findElement(By.className("child"));  // ✅
driver.findElement(By.cssSelector("#parent .child"));  // ❌

// Use implicit wait OR explicit wait, not both
// ✅ Choose one strategy
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Headless mode for faster execution
ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");

// Disable images for faster page load
Map<String, Object> prefs = new HashMap<>();
prefs.put("profile.managed_default_content_settings.images", 2);
options.setExperimentalOption("prefs", prefs);
```

---

## 🔄 CI/CD Integration

### Jenkins Integration

```groovy
pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/MohammadShuvoAli/SeleniumJava.git'
            }
        }
        
        stage('Run Tests') {
            steps {
                bat 'java -cp "lib/*;bin" TestCaseAutomation.TestCaseAutomation'
            }
        }
        
        stage('Generate Report') {
            steps {
                publishHTML([
                    reportDir: 'test-output',
                    reportFiles: 'index.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}
```

### GitHub Actions

```yaml
name: Selenium Tests

on: [push, pull_request]

jobs:
  test:
    runs-on: ubuntu-latest
    
    steps:
    - uses: actions/checkout@v2
    
    - name: Set up JDK 11
      uses: actions/setup-java@v2
      with:
        java-version: '11'
        
    - name: Install Chrome
      run: |
        wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | sudo apt-key add -
        sudo apt-get update
        sudo apt-get install google-chrome-stable
        
    - name: Run Tests
      run: |
        java -jar selenium-tests.jar
```

---

## 🤝 Contributing Guidelines

### How to Contribute

1. **Fork the repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/SeleniumJava.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/new-test-scenario
   ```

3. **Make your changes**
   - Follow existing code structure
   - Add comments
   - Include examples

4. **Test your changes**
   - Run existing tests
   - Verify new functionality

5. **Commit and push**
   ```bash
   git add .
   git commit -m "Add: New test scenario for XYZ"
   git push origin feature/new-test-scenario
   ```

6. **Create Pull Request**
   - Describe your changes
   - Reference related issues

### Code Standards

- ✅ Use meaningful variable names
- ✅ Add inline comments
- ✅ Follow Java naming conventions
- ✅ Include error handling
- ✅ Test before committing

---

## ❓ FAQ

### Q1: Which browser is best for Selenium?

**Answer:** Chrome is most commonly used due to excellent ChromeDriver support. Firefox and Edge also work well.

### Q2: Should I use implicit or explicit waits?

**Answer:** Use **explicit waits**. They're more flexible and don't cause conflicts. Avoid mixing both.

### Q3: How do I handle dynamic elements?

**Answer:** Use explicit waits with ExpectedConditions, or XPath/CSS with flexible selectors (contains, starts-with).

### Q4: Can I run tests in parallel?

**Answer:** Yes, use TestNG parallel execution or Selenium Grid for distributed testing.

### Q5: How do I run tests on different browsers?

**Answer:** Use browser options and parameter passing:
```java
WebDriver driver;
if (browser.equals("chrome")) {
    driver = new ChromeDriver();
} else if (browser.equals("firefox")) {
    driver = new FirefoxDriver();
}
```

### Q6: How do I handle CAPTCHA?

**Answer:** CAPTCHA is designed to prevent automation. Options:
- Disable CAPTCHA in test environment
- Use testing API keys
- Manual intervention for CAPTCHA

### Q7: What's the difference between findElement and findElements?

**Answer:**
- `findElement()` - Returns single element, throws exception if not found
- `findElements()` - Returns list of elements, returns empty list if none found

---

## 📚 Resources & References

### Official Documentation
- [Selenium Official Documentation](https://www.selenium.dev/documentation/)
- [Selenium Java API](https://www.selenium.dev/selenium/docs/api/java/)
- [W3C WebDriver Specification](https://www.w3.org/TR/webdriver/)

### Learning Resources
- [Selenium with Java Tutorial](https://www.selenium.dev/documentation/webdriver/)
- [Apache POI Documentation](https://poi.apache.org/)
- [TestNG Documentation](https://testng.org/doc/documentation-main.html)

### Tools & Libraries
- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
- [AShot Screenshot Library](https://github.com/pazone/ashot)
- [Apache POI for Excel](https://poi.apache.org/)

### Communities
- [Selenium Users Google Group](https://groups.google.com/g/selenium-users)
- [Stack Overflow - Selenium Tag](https://stackoverflow.com/questions/tagged/selenium)
- [Selenium Official Slack](https://selenium.dev/support/)

---

### Author

**Mohammad Shuvo Ali**

- 🌐 GitHub: [@MohammadShuvoAli](https://github.com/MohammadShuvoAli)
- 📧 Email: [Contact via GitHub](https://github.com/MohammadShuvoAli)
- 💼 LinkedIn: [Connect on LinkedIn](https://linkedin.com/in/MohammadShuvoAli)

### Project Links

- 📦 **Repository:** [https://github.com/MohammadShuvoAli/SeleniumJava](https://github.com/MohammadShuvoAli/SeleniumJava)
- 🐛 **Issues:** [Report Issues](https://github.com/MohammadShuvoAli/SeleniumJava/issues)
- ⭐ **Star this repo:** If you find it helpful!

<div align="center">

### 🚀 Happy Testing! 🚀

**Made with ❤️ by Mohammad Shuvo Ali**

[![GitHub followers](https://img.shields.io/github/followers/MohammadShuvoAli?style=social)](https://github.com/MohammadShuvoAli)
[![GitHub stars](https://img.shields.io/github/stars/MohammadShuvoAli/SeleniumJava?style=social)](https://github.com/MohammadShuvoAli/SeleniumJava/stargazers)

---

**[⬆ Back to Top](#-java-selenium-4-webdriver---complete-automation-framework)**

</div>