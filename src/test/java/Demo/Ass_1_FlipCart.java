package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_1_FlipCart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		driver.findElement(By.className("_2puWtW _3a3qyb")).click();
		
		//locator4 -> LinkTest()
		//driver.findElement(By.linkText("Grocery")).click();
		
		//locator 5 -> partialLinkTest()
		driver.findElement(By.partialLinkText("Gro")).click();

	}

}
