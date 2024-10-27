package Part_B_AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Demo.WebdriverMethod;

public class HandlingMultipleWebElements {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = 0;
		for (WebElement Links : allLinks) {
			//System.out.println(Links.getText());
			System.out.println(Links.getAttribute("href"));
			count++;
		}
	System.out.println("total number od Links : "+count );
	}

}
