package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PE3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String curenturl=driver.getCurrentUrl();
		System.out.println(curenturl);
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.close();

	}

}
