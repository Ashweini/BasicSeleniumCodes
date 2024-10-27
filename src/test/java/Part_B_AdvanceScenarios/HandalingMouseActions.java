package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandalingMouseActions {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.saucedemo.com/v1/");
		
//		//mouseOver
//		WebElement ele = driver.findElement(By.linkText("Today's Deals"));
//		Actions act = new Actions(driver);
//		act.moveToElement(ele).perform();
		
		//right click
//		WebElement ele = driver.findElement(By.linkText("Mobiles"));
//		Actions act = new Actions(driver);
//		act.contextClick(ele).perform();
		
		//sendkeys(),perform()
//		WebElement userName = driver.findElement(By.id("user-name"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement login = driver.findElement(By.className("btn_action"));
		
		//Actions act = new Actions(driver);
//		act.sendKeys(userName, "standard_user").perform();
//		act.sendKeys(password,"secret_sauce").perform();
//		act.click(login).perform();
		
		//or
		
		//act.sendKeys(userName, "standard_user").sendKeys(password,"secret_sauce").click(login).perform();
		
		//using build().perform() - in some case if we are passing more 2 elements poerfoem won't weorks then we use bui;ld 
		//act.sendKeys(userName, "standard_user").sendKeys(password,"secret_sauce").click(login).build().perform();
		
		
		//drag and drop 
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html ");
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.id("droppable"));
//		Actions act = new Actions(driver);
//		//act.clickAndHold(draggable).release(droppable).perform();
//		
//		act.dragAndDrop(draggable, droppable).perform();
		
		//double click
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//		Actions act = new Actions(driver);
//		act.doubleClick(doubleclick).perform();
		
		//somewhere to click to remove popup
		driver.get("https://www.makemytrip.com");
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		

	}

}
