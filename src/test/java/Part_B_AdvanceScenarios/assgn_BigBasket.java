package Part_B_AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assgn_BigBasket {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		//driver.get("https://www.bigbasket.com/?utm_source=google&utm_medium=cpc&utm_campaign=Brand-T1&gad_source=1&gclid=Cj0KCQjw5ea1BhC6ARIsAEOG5pxRoRMK7wIjLbWtT3ne6PpOJ0pHBpYAxY4svTSZNq55qLPs6cCYscoaAux9EALw_wcB");
				
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class=\"flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"]")).sendKeys("apples");
		//driver.findElement(By.className("\"flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"")).sendKeys("apple");
		driver.findElement(By.xpath("(//input[@class=\"flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"])[2]")).sendKeys("apple");
	
		Thread.sleep(2000);
		List<WebElement> allElements = driver.findElements(By.xpath("//span[@class=\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU\"]"));
	
		Thread.sleep(2000);
		for (WebElement ele : allElements) {
			System.out.println(ele.getText());
			if(ele.getText().contains("Apple - Red Delicious, Regular"))
			{
				Thread.sleep(2000);
				ele.click();
				break;
				
			}
		}
		Thread.sleep(2000);
		//getDomProperty
		WebElement color = driver.findElement(By.xpath("//h1[@class=\"Description___StyledH-sc-82a36a-2 bofYPK\"]"));
		System.out.println(color.getDomProperty("color"));
		
	}

}
