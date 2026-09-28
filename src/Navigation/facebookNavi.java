package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookNavi {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String URL="https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F";
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgotten password?")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.close();

	}

}
