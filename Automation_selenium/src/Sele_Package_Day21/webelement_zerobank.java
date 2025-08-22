package Sele_Package_Day21;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement_zerobank {

    // Static method to perform login (opens and closes browser for each test)
    public static void loginStep(String user1, String pass1, String submit) throws InterruptedException {
        
        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Open Zero Bank login page
        driver.get("http://zero.webappsecurity.com/login.html");
        driver.manage().window().maximize();
        System.out.println("Welcome to Zero Bank login page");

        // Create WebElements for username and password fields
        WebElement user = driver.findElement(By.id("user_login"));
        WebElement pass = driver.findElement(By.id("user_password"));

        // Enter Username
        user.click();
        user.sendKeys(user1);

        // Enter Password
        pass.click();
        pass.sendKeys(pass1);

        // Click on submit button by name
        driver.findElement(By.name(submit)).click();

        // Wait 
        Thread.sleep(2000);

        System.out.println("Login attempt with --> Username: " + user1 + " | Password: " + pass1);
        System.out.println("Login step completed\n");

        // Close the browser
        driver.close();
    }

    // Main method
    public static void main(String[] args) throws InterruptedException {

        // Valid credentials
        loginStep("username", "password", "submit");

        // Wrong password
        loginStep("username", "wrongpass", "submit");

        // Empty credentials
        loginStep("", "", "submit");

        // Special characters in username
        loginStep("user!@#", "password123", "submit");

        // Long username
        loginStep("ThisIsAVeryLongUsernameForTestingLoginStep", "password", "submit");
    }
}
