package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Goibibo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.goibibo.com/");
		
		//close the Hidden division pop up
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		//clicking on departure calander
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		//clicking on 11 jan 24
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Body']/descendant::div[@aria-label='Thu Jan 11 2024']")).click();
	
		//clicking on DONE
		driver.findElement(By.xpath("//span[.='Done']")).click();
	}

}
