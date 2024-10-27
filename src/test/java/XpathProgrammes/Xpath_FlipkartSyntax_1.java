package XpathProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FlipkartSyntax_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		
		//xpath syntax-1 : xpath by attribute
		//htmltag[@AttributrName = 'AttributeValue']
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rebook");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println(driver.findElement(By.xpath("//a[@title='Epsilon Running Shoes For Men']")).getText());
		
		//xpath syntax-2 : xpath by text()
		//>visible text<   //htmltag[text()='AtrributeValue']
//		driver.findElement(By.xpath("//span[text()='Login']")).click();
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		System.out.println(driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']")).getText());
//		System.out.println(driver.findElement(By.xpath("//div[text()='₹66,699']")).getText());
		

	}

}
