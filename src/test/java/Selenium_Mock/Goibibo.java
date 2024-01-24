package Selenium_Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Goibibo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disable-arguments=*");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/flights/?utm_source=bing&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&utm_term=!SEM!DF!B!Brand!RSA!150035352!1211662109442708!!e!goibibo!c!&msclkid=86477f3acb8e1f0029201a94810a1ff5");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"logSprite icClose\"]")).click();
		
		Thread.sleep(2000);
		WebElement FromTextB = driver.findElement(By.xpath("//div[@class=\"sc-12foipm-16 wRKJm fswFld \" and @style='width: 260px;']"));

		FromTextB.click();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("bengaluru");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();

		Thread.sleep(2000);
		WebElement toTB = driver.findElement(By.xpath("//div[@class='sc-12foipm-38 dAUhfz']//input"));
		toTB.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("delhi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='New Delhi, India']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='26']/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Week']//div[@aria-label=\"Wed Jan 24 2024\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();	
		
		
	}
}
