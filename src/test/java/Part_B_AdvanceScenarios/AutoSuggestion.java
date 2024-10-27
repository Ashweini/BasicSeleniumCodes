package Part_B_AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestion {

	//public static void main(String[] args) throws Throwable {
	@Test
	public void autoSuggestion() throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		
//		driver.findElement(By.name("q")).sendKeys("puma");
//		
//		Thread.sleep(2000);
//		List<WebElement> AutoSUgg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
//		for (WebElement sugg : AutoSUgg) {
//			System.out.println(sugg.getText());
//			if(sugg.getText().contains("puma slippers men")) {
//				sugg.click();
//			}
//		}

		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bata");
		
		Thread.sleep(2000);
		//took direct instead of traversing back to parent
		List<WebElement> AutoSugg = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		for (WebElement sugg : AutoSugg) {
			System.out.println(sugg.getText());
			if(sugg.getText().contains("bata shoes for women")) {
				sugg.click();
			}
		}
	}

}
