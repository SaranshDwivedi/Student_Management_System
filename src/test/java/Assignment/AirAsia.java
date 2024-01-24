package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AirAsia 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.airasia.com/en/gb");
		
		//handling popup
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[@class='RxNS-button-container']/descendant::div[.='No thanks']")).click();
		
		//clicking on the Departure date
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Depart']")).click();
		
		//clicking on 20 jan 2024
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='January 2024']/ancestor::div[@id='calendar-instance-0-2024']/descendant::div[@id='div-2024-0-20']")).click();
		
		//clicking on 20 Feb 2024
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='February 2024']/ancestor::div[@id='calendar-instance-1-2024']/descendant::div[@id='div-2024-1-11']")).click();
		
		//clicking on confirm button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Confirm']")).click();
		
		//clicking on Search button
		Thread.sleep(2000);
		driver.findElement(By.id("fsw-search-button-container")).click();
	}

}
