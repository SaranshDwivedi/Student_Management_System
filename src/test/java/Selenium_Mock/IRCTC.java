package Selenium_Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class IRCTC 
{
	public static void main() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		//click on BUSSES
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		
		//depature
		Thread.sleep(2000);
		WebElement deprtTO = driver.findElement(By.xpath("//form[@class=\"ng-untouched ng-pristine ng-valid\"]//input[@id=\"departFrom\"]"));
		deprtTO.click();
		
		Thread.sleep(2000);
		WebElement departTOBanglore = driver.findElement(By.xpath("//div[@text()='Bangalore']"));
		Actions act = new Actions(driver);
		act.contextClick(departTOBanglore).build().perform();
		
		Thread.sleep(1000);
		WebElement departTo = driver.findElement(By.xpath("//form[@class=\"ng-untouched ng-pristine ng-valid\"]//input[@id=\"goingTo\"]"));
		deprtTO.click();
		
		//goa
		Thread.sleep(1000);
		WebElement departToGoa = driver.findElement(By.xpath("//div[@text()='Goa']"));
		act.contextClick(departToGoa).build().perform();
		
		//date
		Thread.sleep(1000);
		WebElement departureDate = driver.findElement(By.xpath("//form[@class=\"ng-untouched ng-pristine ng-valid\"]//input[@id=\"departDate\"]"));
		departureDate.click();
		
		//31 jan
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='31']")).click();
		
		//click on search button
		Thread.sleep(1000);
		WebElement searchBtn = driver.findElement(By.xpath("//button[text()='Search Bus ']"));
		
		//details
		
	}
}






















