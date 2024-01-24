package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AirAsia_Next_Next_Month 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.spicejet.com/");
		
		//Click on Departure Date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Depart']")).click();
		
		//click on 
	}

}
