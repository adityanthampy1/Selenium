package Wait_Commands;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("ALERT TEXT: "+alert.getText());
		Thread.sleep(2000);
		alert.sendKeys("ADI");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
