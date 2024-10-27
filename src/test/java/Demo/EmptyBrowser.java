package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {

		/*//case-1 selenium version 3.141.59
		String key="webdriver.chrome.drive";
		String value = "./src/main/resources/chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get(null);*/
		
		//case -2  selenium version = 3.141.59 browser=5.9.1
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		// Case -3 selenium version = 4.23.0  browser=5.9.1
		//4.9.1 > doesn't required any browser server
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		// Case -4 selenium version = 4.23.0  browser=5.9.1 without WebdriverManager
		//WebDriver driver = new EdgeDriver();
		
		
	}

}
