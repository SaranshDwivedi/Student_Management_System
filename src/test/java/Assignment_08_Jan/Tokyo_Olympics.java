package Assignment_08_Jan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Tokyo_Olympics {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		Thread.sleep(5000);
		List<WebElement> data = driver.findElements(By.xpath("//span[text()='Argentina']/ancestor::div[@class='Tablestyles__CommonGrid-sc-xjyvs9-1 Tablestyles__Content-sc-xjyvs9-3 knZfST eVgKXR']/child::div"));
		System.out.println(data);
	}
}