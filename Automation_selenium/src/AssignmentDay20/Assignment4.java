package AssignmentDay20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1. Drag and drop
        driver.get("https://demoqa.com/dragabble");
        Actions actions = new Actions(driver);
        WebElement dragEl = driver.findElement(By.id("dragBox"));
        actions.dragAndDropBy(dragEl, 150, 80).perform();
        Thread.sleep(1000);

        // 2. Multi-select dropdown
        driver.get("https://demoqa.com/select-menu");
        WebElement multiDropdown = driver.findElement(By.id("cars"));
        Select selectMulti = new Select(multiDropdown);
        selectMulti.selectByVisibleText("Green");
        selectMulti.selectByVisibleText("Black");

        System.out.print("Selected in combined: ");
        List<WebElement> selected = selectMulti.getAllSelectedOptions();
        for (WebElement el : selected) {
            System.out.print(el.getText() + " ");
        }
        System.out.println();

        // 3. Prompt alert
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        driver.switchTo().alert().sendKeys("DemoUser");
        driver.switchTo().alert().accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        System.out.println("Prompt result: " + promptResult.getText());

        driver.quit();
    }
}
