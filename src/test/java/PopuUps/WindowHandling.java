package PopuUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Demo.WebdriverMethod;

public class WindowHandling {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 15 (Black, 128 GB)\"]")).click();
		
		//2 approaches to handle windows 
		//1. windows id -> Can handle only 2 windows
		//2. windows title -> we can handle multiple windows 
		
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		for(String id : allId) {
			if(!mainWin.equals(id)) {
				driver.switchTo().window(id);
				System.out.println(driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText());
			}
		}
	}

}
