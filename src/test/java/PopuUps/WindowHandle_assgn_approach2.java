package PopuUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_assgn_approach2 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		
		Set<String> allId = driver.getWindowHandles(); //win1, win2
		for (String id : allId) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Selenium"))
			{
				break;
			}
		}
			
		driver.findElement(By.linkText("Register now!")).click();

//-------------switchTo appium site		
		Set<String> allLink = driver.getWindowHandles();
		System.out.println(allLink);
		
		for (String id : allLink) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Appium"))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//span[text()='Appium Conf 2024 Pass']")).click();
		driver.close(); //closes a single window window currently in focus
		//driver.quit(); //closes all wndows
//------------------------------------------------------------------------------------------------------
		Set<String> allLink1 = driver.getWindowHandles();
		System.out.println(allLink);
		
		for (String id : allLink1) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Frames & windows"))
			{
				break;
			}
		}
	driver.close();
	}

}
