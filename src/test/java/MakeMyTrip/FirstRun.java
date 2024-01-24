package MakeMyTrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstRun {
	static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launching MMT
		driver.navigate().to("https://www.makemytrip.com/");
		
		//Clicking on login button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@data-cy='LoginHeaderText']")).click();
		
		//entering Email in textbox
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("saraanshdwivedi@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='createMbAccount__btn flexOne appendLeft7']")).click();
		
		//entering password
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Always11@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='capText font16']")).click();
		
		//entering 
	}
}
