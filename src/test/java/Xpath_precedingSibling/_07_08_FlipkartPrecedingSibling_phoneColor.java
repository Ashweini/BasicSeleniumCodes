package Xpath_precedingSibling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_08_FlipkartPrecedingSibling_phoneColor {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.flipkart.com/apple-iphone-15-plus-pink-128-gb/p/itmecb6209a78172?pid=MOBGTAGPXUWEXXWY&lid=LSTMOBGTAGPXUWEXXWYKVXCUT&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&srno=s_1_11&otracker=search&otracker1=search&fm=organic&iid=7d564741-a7b6-44bb-9108-a84d2fbdc785.MOBGTAGPXUWEXXWY.SEARCH&ppt=hp&ppn=homepage&ssid=4vw6rrlfw00000001723008111859&qH=0b3f45b266a97d70");
		driver.manage().window().maximize();
		
		//String color = driver.findElement(By.xpath("(//a[@class='GK7Ljp'])[1]")).getText();
		
		//System.out.println(color);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> colors = driver.findElements(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[2]/../../../..//div[@class='a-section a-spacing-none a-spacing-top-mini s-color-swatch-container-list-view']//a"));
		//div took parents of a attribute
		for (WebElement color : colors) {
			
			System.out.println(color.getAttribute("aria-label"));
			
		}
		
		


		

	}

}
