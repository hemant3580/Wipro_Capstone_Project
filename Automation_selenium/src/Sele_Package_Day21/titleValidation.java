package Sele_Package_Day21;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class titleValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello! This is first Script");
		//setup browser (Chrome deriver, firefox driver)
		WebDriver driver = new ChromeDriver();
		try{
			driver.get("https://www.selenium.dev");
			String expectedTitle = "Selenium";
			String actualTitle = driver.getTitle();
			
			System.out.println("Expected Title: "+expectedTitle);
			System.out.println("Actual Title: "+actualTitle);


			driver.manage().window().maximize();
			Thread.sleep(5000);
			if(expectedTitle.equals(actualTitle)) {
				System.out.println("Title matched ");
			}else {
				System.out.println("Title Mismatched ");
			}
			driver.close();
			System.out.println("Page loaded succesfully");
		}catch(Exception e) {
			System.out.println("Unable to Open URL");
			System.out.println(e);
		}
		
		//Create obj for browser
		//set webApplication URL
		
		
	}

}
