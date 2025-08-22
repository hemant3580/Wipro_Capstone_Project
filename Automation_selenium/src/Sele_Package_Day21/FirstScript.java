package Sele_Package_Day21;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello! This is first Script");
		//setup browser (Chrome deriver, firefox driver)
		WebDriver driver = new ChromeDriver();
		try{
			driver.get("https://www.selenium.dev");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
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
