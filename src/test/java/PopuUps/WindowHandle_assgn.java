package PopuUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle_assgn {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		
		for(String id : allId) {
			if(!mainWin.equals(id)) {
				driver.switchTo().window(id);
				driver.findElement(By.xpath("//a[text()='Register now!']")).click();
			}
		}
		
	}

}
