package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Goibibo_Round_Trip {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.goibibo.com/");
		
		//close the Hidden division pop up
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		//clicking on Round Trip
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.='Round-trip']")).click();
		
		//clicking on Departure calander
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		//clicking on 11 jan
		driver.findElement(By.xpath("//div[.='January 2024']/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Body']/descendant::div[@aria-label='Thu Jan 11 2024']")).click();
		
		//clicking on 11 feb
		driver.findElement(By.xpath("//div[.='February 2024']/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Body']/descendant::div[@aria-label='Sun Feb 11 2024']")).click();
		
		//clicking on DONE
		driver.findElement(By.xpath("//span[.='Done']")).click();
	}

}
