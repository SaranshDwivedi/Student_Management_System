package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching_FBTest 
{
	static WebDriver driver;
	@Test
	public void FBTest() throws InterruptedException
	{
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to(url);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void InstagramTest() throws InterruptedException
	{
		String url = System.getProperty("url");
		String username = System.getProperty("username");
		String password = System.getProperty("password");
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to(url);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Phone number, username, or email']")).sendKeys(username);
		driver.findElement(By.xpath("//span[text()='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
