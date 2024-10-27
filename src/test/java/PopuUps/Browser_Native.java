package PopuUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser_Native {

	public static void main(String[] args) {


		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--incognito");
//		
//		WebDriver driver=new ChromeDriver(opt);
//		driver.get("https://www.amazon.in");

	}

}
