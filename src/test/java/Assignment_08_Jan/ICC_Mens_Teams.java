package Assignment_08_Jan;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class ICC_Mens_Teams 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.prokabaddi.com/standings");
		Thread.sleep(5000);
		List<WebElement> data = driver.findElements(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div"));
		for(WebElement wb : data)
		{
			String val = wb.getText();
			System.out.println(val);
		}
	}

}

//matches less than 40
//div[@class="si-table-data si-pos"]/following-sibling::div[2]/span[text()<40]