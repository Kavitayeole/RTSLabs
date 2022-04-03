
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RTSLabsGoogleAssignment 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");	
		
		driver.findElement(By.name("q")).sendKeys("RTS Labs");
		
		Actions act = new Actions(driver);
	
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")).click();

	}

}
