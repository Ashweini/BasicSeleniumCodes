package XpathProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_08_xpathUsingFollowinfSibling {

	public static void main(String[] args) {
		
//	    /---->Traversing from parent to immd child
			//   //---->Traversing from parent to any child
			//   /..--->Traversing from child to parent


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Approach 3 - using div
		//System.out.println(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']/div[1]/div[1]/div[@class='Nx9bqj _4b5DiR']")).getText());
		
		//Approach -3 - direct without div
		//System.out.println(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']/../following-sibling::div[@class='col col-5-12 BfVC2z']//div[@class='Nx9bqj _4b5DiR']")).getText());


	}

}
