package Sele_Package_Day21;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class URLValidation {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello! This is first Script");

        WebDriver driver = new ChromeDriver();

        try {
           
            String expectedTitle = "Selenium";
            String expectedURL = "https://www.selenium.dev/";

            
            driver.get("https://www.selenium.dev");

           
            String actualTitle = driver.getTitle();
            String actualURL = driver.getCurrentUrl();

            
            System.out.println("Expected Title: " + expectedTitle);
            System.out.println("Actual Title: " + actualTitle);
            System.out.println("Expected URL: " + expectedURL);
            System.out.println("Actual URL: " + actualURL);

           
            driver.manage().window().maximize();
            Thread.sleep(3000);

            
            if (expectedTitle.equals(actualTitle)) {
                System.out.println("Title matched");
            } else {
                System.out.println("Title mismatched");
            }

            // URL validation
            if (expectedURL.equals(actualURL)) {
                System.out.println("URL matched");
            } else {
                System.out.println("URL mismatched");
            }

            driver.close();
            System.out.println("Page loaded successfully");

        } catch (Exception e) {
            System.out.println("Unable to Open URL");
            System.out.println(e);
        }
    }
}
