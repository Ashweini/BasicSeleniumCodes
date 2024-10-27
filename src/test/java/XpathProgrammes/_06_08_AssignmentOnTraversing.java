//search for puma and print product name and price 
package XpathProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_08_AssignmentOnTraversing {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.in/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
//			System.out.println(driver.findElement(By.xpath("//a[text()='Puma Humble IDP Running Shoes For Men']")).getText());
//			System.out.println(driver.findElement(By.xpath("//div[text()='₹3,234']")).getText());
			
			
			//approach -1 '
			//System.out.println(driver.findElement(By.xpath("//div[text()='Google Pixel 8 (Obsidian, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText());
			
			//Approach-2
			//System.out.println(driver.findElement(By.xpath("//div[text()='Google Pixel 8 (Obsidian, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText());
	}

}
