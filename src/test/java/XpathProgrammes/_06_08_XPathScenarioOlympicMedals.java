package XpathProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_08_XPathScenarioOlympicMedals {

	public static void main(String[] args) throws InterruptedException {
		
//	    /---->Traversing from parent to immd child
			//   //---->Traversing from parent to any child
			//   /..--->Traversing from child to parent
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/paris-2024/medals");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();

//		String gold = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[1]")).getText();
//		System.out.println("Gold : "+gold);
//		
//		String Silver = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[2]")).getText();
//		System.out.println("Silver : "+Silver);
//		
//		String Bronze = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[3]")).getText();
//		System.out.println("Bronze : "+Bronze);
//		
//		String Total = driver.findElement(By.xpath("//span[text()='United States of America']/../following-sibling::span[4]")).getText();
//		System.out.println("Total : "+Total);
		
		String gold = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[1]")).getText();
		System.out.println("Gold : "+gold);
		
		String Silver = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[2]")).getText();
		System.out.println("Silver : "+Silver);
		
		String Bronze = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[3]")).getText();
		System.out.println("Bronze : "+Bronze);
		
		String Total = driver.findElement(By.xpath("//span[text()='Australia']/../following-sibling::span[4]")).getText();
		System.out.println("Total : "+Total);
		
		
	}

}
