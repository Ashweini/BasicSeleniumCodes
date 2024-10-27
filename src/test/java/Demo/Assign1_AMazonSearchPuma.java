package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1_AMazonSearchPuma {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.name("field-keywords")).sendKeys("puma");
//		Thread.sleep(2000);
//		driver.findElement(By.id("nav-search-submit-button")).click();		
//		driver.findElement(By.linkText("Today's Deals")).click();
		
		//locator6 - Using cssSelector 
//		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("puma");
//		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		
		//or 
		
		//using sumbmit web element
		
//	WebElement textField = driver.findElement(By.cssSelector("[class='Pke_EE']"));
//	textField.sendKeys("puma");
//	textField.submit();
	
		//driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
		
		//using key class
		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("puma",Keys.ENTER);
		
		
		
	
	}

}
