package Screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {
		public static void main(String[] args) throws IOException, InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(1000);
			TakesScreenshot ts = (TakesScreenshot) driver;

			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\Public\\Pictures\\SS.png");
			FileUtils.copyFile(source, destination);
			Thread.sleep(2000);
			System.out.println("Screenshot taken successfully");
			
			driver.quit();
		}
	
}

