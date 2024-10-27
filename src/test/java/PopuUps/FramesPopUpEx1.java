package PopuUps;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUpEx1 {

	public static void main(String[] args) {

		//drag and drop
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//directly not possible bcz of frames
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Actions act = new Actions(driver);
//		act.dragAndDrop(draggable, droppable).perform();
		
		//Handling Frama
		//1. By using Frame
		//2. String
		//3. WebElement
		
		//switching to frame by using index - index value n-1
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();

	}

}
