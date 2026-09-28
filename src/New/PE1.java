package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PE1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println();
		String curenturl=driver.getCurrentUrl();
		System.out.println(curenturl);
		System.out.println();
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		driver.quit();

	}

}
