package PopuUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FRames_Assgn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.linkText("Nested Frames")).click();
			
		
//driver.switchTo().frame(2); not recommended
		
		//switching to Parent frame top
//		WebElement topFrame = driver.findElement(By.cssSelector("[name=\"frame-top\"]"));
//		driver.switchTo().frame(topFrame);
//		
//		driver.switchTo().frame("frame-left");
//		//String leftFrame = driver.findElement(By.xpath(""))
		
		
		//switching to parent frame  //approach:3
		WebElement topFrame = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		driver.switchTo().frame(topFrame);
		
		//from parent to child frame   //approach:2
		driver.switchTo().frame("frame-left");
		String leftFrame = driver.findElement(By.xpath("//body[contains(text(),' LEFT')]")).getText();
		System.out.println(leftFrame);
		
//print middle frame 
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		////div[text()='MIDDLE']

//print buttom  now in middle->parent->top->main->buttom
//		driver.switchTo().parentFrame();
//		driver.switchTo().parentFrame();
		//or
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());
	}

}
