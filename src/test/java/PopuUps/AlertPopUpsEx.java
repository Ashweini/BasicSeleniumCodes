package PopuUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpsEx {
	
	@Test
	public void AlertPopUpsEx() {
	//public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		
		//alert popup
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		Alert alrt = driver.switchTo().alert();
//		alrt.accept();
		//or
//		driver.switchTo().alert().accept();
		
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		
		//popup accept/Ok and dissmiss/Cancel
//		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
//		driver.switchTo().alert().accept();  //-->to OK button
//		//driver.switchTo().alert().dismiss();  //-->to click Cancel
//		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		//to send text on popup
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		driver.switchTo().alert().sendKeys("good");
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
	}

}
