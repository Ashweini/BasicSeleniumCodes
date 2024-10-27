package XpathProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_08_AssignFlipKarrtiphone {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//List<WebElement> names = driver.findElements(By.xpath("//div[contains(text(),'Apple')]"));
		//List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
//		int count=0;
//		for(WebElement phname : names) {
//			System.out.println("Phone name : "+phname.getText());
//			count++;
//		}
//		System.out.println("Number of phones : "+count);
		
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));	
		List<WebElement> phprice = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).getText()+"----->"+phprice.get(i).getText());
		}

	}

}
