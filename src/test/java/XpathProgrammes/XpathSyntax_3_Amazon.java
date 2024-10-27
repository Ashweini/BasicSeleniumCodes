package XpathProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSyntax_3_Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//syntax3 - //htmltag[contains(@attributeName,'value')]
//		driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("bluetooth");
//		driver.findElement(By.xpath("//input[contains(@id,'nav')]")).click();
		
		//syntax4 - //htmltag[contains(text(),AttributeValue")
		driver.findElement(By.xpath("//a[contains(text(),'Tod')]")).click();
	}

}
