package Demo;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Scenario1 {
//
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://flipkart.in/");
//		driver.manage().window().maximize();
//		
//		driver.findElement(By.cssSelector("[class='Pke_EE']")).sendKeys("reebok");
//		//driver.findElement(By.cssSelector("[d='M10.5 18C14.6421 18 18 14.6421 18 10.5C18 6.35786 14.6421 3 10.5 3C6.35786 3 3 6.35786 3 10.5C3 14.6421 6.35786 18 10.5 18Z']")).click();
//		driver.findElement(By.cssSelector("[xmlns='http://www.w3.org/2000/svg']")).click();
//		//Thread.sleep(2000);
//		//driver.findElement(By.cssSelector("[href='/mens-footwear/mens-sports-shoes/pr?sid=osp,cil,1cu&q=reebok&otracker=categorytree']")).getText();
//		driver.findElement(By.cssSelector("[title='Footwear']")).click();
//		String text =driver.findElement(By.linkText("Women's Footwear")).getText();
//		System.out.println(text);
//		
//	}
//
//}


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("reebok");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	//	driver.findElement(By.cssSelector("[title=\"Footwear\"]")).click();
        //String name = driver.findElement(By.cssSelector("[title=\"Men's Sports Shoes\"]")).getText();
		
//		List<WebElement> tabs= (List<WebElement>) driver.findElement(By.cssSelector("[class='uWfXeF']"));
//		WebElement q;
//		for(int i=0; i< tabs.size(); i++) {
//			q=tabs.get(i);
//			System.out.println();
//		}
		

}
}