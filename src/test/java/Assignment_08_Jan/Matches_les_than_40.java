package Assignment_08_Jan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Matches_les_than_40 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.icc-cricket.com/rankings/team-rankings/mens/test");
		Thread.sleep(5000);
		List<WebElement> matches = driver.findElements(By.xpath("//div[@class='si-table-data si-team']/following-sibling::div[1]/span[text()<40]"));
		for(WebElement wb : matches)
		{
			String val = wb.getText();
			System.out.println(val);
		}
	
	}
}