package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
		username.sendKeys("standard_user");
		
		WebElement pass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		pass.sendKeys("secret_sauce");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button"))).click();
		
		driver.quit();

	}

}
