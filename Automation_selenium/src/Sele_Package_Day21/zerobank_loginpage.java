package Sele_Package_Day21;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerobank_loginpage {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello! This is first Script");

        // Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open Zero Bank login page
            driver.get("http://zero.webappsecurity.com/login.html");
            driver.manage().window().maximize();
            System.out.println("Welcome to Zero Bank login page");

            // Enter Username directly
            driver.findElement(By.id("user_login")).click();
            driver.findElement(By.id("user_login")).sendKeys("username");

            // Enter Password directly
            driver.findElement(By.id("user_password")).click();
            driver.findElement(By.id("user_password")).sendKeys("password");

            // Click submit button by name
            driver.findElement(By.name("submit")).click();

            // Wait a bit to observe result (optional)
            Thread.sleep(3000);

            System.out.println("Login successful");

            driver.close();

        } catch (Exception e) {
            System.out.println("Unable to Open URL");
            System.out.println(e);
        }
    }
}
