package XpathProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_08_assgn03_AmazonIphoneColor {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Green/dp/B09V4B6K53/ref=sr_1_6?dib=eyJ2IjoiMSJ9.OCoJgZ8ghdguKvc7Ozmt3KlC0a5KB5Cw1Z8vR-gHUKZpiRsfqUDXAr6MP3uGF_Ca9ymzuq44NMTc8W9X8MkBJn8EfzVQ-hqDdWSPh6cyYAsZTz4gX5q3JRiD5N0-8Jx_JsMny-ZF15lZaNlY6AjKAQAckNvO0nQgU6ls8myErzSKQ2EZFuZmB_t5oCv3DF1X8DlhUzs1tZ48UIxNJ36Kp6TrdRgC8vnCtYcm4US22iA.gbgDDkg-gFVNhLj6eb4REDPOyArfCgOgB9gZYVjWI2M&dib_tag=se&keywords=iphone+13&qid=1722663292&sr=8-6");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 13");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//
//		
//		List<WebElement> color = driver.findElements(By.xpath("//span[@class='s-color-swatch-inner-circle-border']"));	
//		
//		for (int i = 0; i < color.size(); i++) {
//			System.out.println(color.get(i).getText());
//		}
	}

}
//driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 15 (128 GB) - Blue')]")).click();