package Part_B_AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws InterruptedException {


		//select we use 3 approaches
		//1. Select by index  ----> index value starts from 0
		//2. select by value
		//3. select by visible Text
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement dayList = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		dayList.click();
		//we are progormming this with method overloading approach
		Select select = new Select(dayList);
		//select.selectByIndex(9);
		//select.selectByValue("8");
		select.selectByValue("8");
		
		WebElement MonthList = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		dayList.click();
		//we are progormming this with method overloading approach
		Select select1 = new Select(MonthList);
		//select1.selectByIndex(11);
		//select1.selectByValue("4");
		select1.selectByVisibleText("Apr");
		
		WebElement YearList = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		dayList.click();
		//we are progormming this with method overloading approach
		Select select2 = new Select(YearList);
		//select2.selectByIndex(24);
		//select2.selectByValue("1998");
		select2.selectByVisibleText("1998");

	}

}
