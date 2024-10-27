package PopuUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFramesEx2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html ");

//Approach-1 : Switching Frame by Index	
//		driver.switchTo().frame(1);
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Qspider");
		
//Approach-2 : Switching Frame by Id Attribute	
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Helloo");
		
		//by using name
//		driver.switchTo().frame("SingleFrame");
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hai!!!");
		
//Approach 3: //by using webElement
		WebElement frame = driver.findElement(By.cssSelector("[id=\"singleframe\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hai!!!...Ashwini Ramappa");
	}

}
