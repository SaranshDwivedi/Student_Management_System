package Assignment;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Broken_Links {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to("https://www.makemytrip.com/flights/");
		
		Thread.sleep(3000);
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(AllLinks.size());
		
		for(WebElement links : AllLinks)
		{
			String eachLink = links.getAttribute("href");
			
			int statusCode = 0;
			try {
				URL url = new URL(eachLink);
				
				HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
				statusCode = httpConn.getResponseCode();
				
				if(statusCode >= 400)
				{
					System.out.println(eachLink+" --> "+statusCode);
				}
			}
			catch (Exception e) 
			{
				System.out.println(eachLink+" --> "+statusCode);
			}
		}
	}

}
