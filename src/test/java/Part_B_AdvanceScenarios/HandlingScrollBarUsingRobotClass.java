package Part_B_AdvanceScenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {


		//we have 2 approach
		//1. Robot Class
		//2. JavaScriptExecutor 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_PAGE_UP);
		rob.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(2000);
		rob.keyPress(KeyEvent.VK_PAGE_UP);
		rob.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
