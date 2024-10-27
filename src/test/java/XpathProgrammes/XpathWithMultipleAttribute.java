package XpathProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithMultipleAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//syntax -1 //httptag[@AttributeName='AttributeValue' And @AtrributrNAme='AttributeVale']
//		driver.findElement(By.xpath("//input[@type='text' and @name='field-keywords']")).sendKeys("puma");
		
		//syntax 2 //httptag[@AttributeName='AttributeValue' OR @AtrributrNAme='AttributeVale']
//		driver.findElement(By.xpath("//input[@value='Go' or @type='s']")).click();

		//syntax 3  //httptag[@AttributeName='AttributeValue' And text()='AttributeVale']
		//driver.findElement(By.xpath("//a[@class='nav-a  '  and  text()='Sell']")).click();
		
		//syntax 4 //httptag[text()='AttributeValue' or @AtrributrNAme='AttributeVale']
		//driver.findElement(By.xpath("//a[text()='Mobiles' or @data-csa-c-slot-id=\"\\nav_cs_4\\\"]")).click();
		
		//syntax -5  //httptag[contains(AttributeName,'AttributeValue') And/or contains(text(),'AttributeVale')]
		driver.findElement(By.xpath("//a[contains(data-csa-c-content-id,'n') or contains(text(),'El')]")).click();
	}

}
