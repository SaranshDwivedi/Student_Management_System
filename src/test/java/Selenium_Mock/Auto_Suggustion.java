package Selenium_Mock;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Auto_Suggustion 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2000));
		driver.get("https://www.google.co.in/");
		WebElement text = driver.findElement(By.id("APjFqb"));
		text.sendKeys("sachin");
		//		text.sendKeys(Keys.ARROW_DOWN);for
		//		text.sendKeys(Keys.ENTER);
		//	driver.findElement("");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]//div[@class=\"eIPGRd\"]"));

//		for(WebElement ele : elements)
//		{
//			String a = ele.getText();
//			System.out.println(a);
//			Thread.sleep(300);
//		}

		for(WebElement el:elements)
		{
			System.out.println(el.getText());
			if(el.getText().trim().contains("sachin tendulkar wife"))
			{
				break;
			}
		}
	}
}
