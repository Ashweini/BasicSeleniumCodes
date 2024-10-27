import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_FollowingSibling_Revision_10_08 {

	public static void main(String[] args) {


		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		
		String Play = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-play']/p[@class='count']")).getText();
	    System.out.println(Play);
	    
	    String Won = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-won']/p[@class='count']")).getText();
	    System.out.println(Won);
	    
	    String Lost = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-lost']/p[@class='count']")).getText();
	    System.out.println(Lost);
	    
	    String Draw = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-draw']/p[@class='count']")).getText();
	    System.out.println(Draw);
	}

}
