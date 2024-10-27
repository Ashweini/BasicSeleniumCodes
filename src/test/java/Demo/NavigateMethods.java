package Demo;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//lanching browser
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		//method-8 : navigate()
		//this is the alternale method to launch the web application
		//driver.navigate().to("https://www.makemytrip.com/");
		
		//Launch webapplication
		Thread.sleep(2000);
		//driver.get("https://www.makemytrip.com/");
		driver.get("https://qspiders.com/");
		
		Thread.sleep(2000);
		//navugate methiod to backward
		driver.navigate().back();
		
		Thread.sleep(2000);
		//navigate to forward
		driver.navigate().forward();
		
		Thread.sleep(2000);
		//refresh the page 
		driver.navigate().refresh();
		
		//closed all browser 
		driver.quit();
	}

}
