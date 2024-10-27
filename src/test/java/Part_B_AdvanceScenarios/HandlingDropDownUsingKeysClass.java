package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws InterruptedException  {


		//Handling using keyboard strokes -- Key class and Robot class 
		//Handiling dropdown using select classs
		//Handling dropdown using Webelement 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement dayList = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		dayList.click();
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		dayList.sendKeys(Keys.ARROW_DOWN);
		
		WebElement MonthList = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Thread.sleep(2000);
		MonthList.click();
		MonthList.sendKeys(Keys.ARROW_UP);
		MonthList.sendKeys(Keys.ARROW_UP);
		MonthList.sendKeys(Keys.ARROW_UP);
		
		WebElement YearList = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Thread.sleep(2000);
		YearList.click();
		YearList.sendKeys(Keys.ARROW_DOWN);
		YearList.sendKeys(Keys.ARROW_DOWN);
		YearList.sendKeys(Keys.ARROW_DOWN);
		YearList.sendKeys(Keys.ARROW_DOWN);
		YearList.sendKeys(Keys.ARROW_DOWN);
		YearList.click();
		
	}

}
