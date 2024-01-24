package MakeMyTrip;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WO_LogIn {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement fromTB = driver.findElement(By.xpath("//input[@id='fromCity']"));
		act.click(fromTB).build().perform();
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		dd.sendKeys("bengaluru");
		Thread.sleep(3000);
		WebElement togo = driver.findElement(By.xpath("//p[.='Bangkok, Thailand']"));
		togo.click();
		Thread.sleep(2000);
		WebElement tocome = driver.findElement(By.xpath("//input[@id='toCity']"));
		tocome.click();
		driver.findElement(By.xpath("//p[.='Pune, India']")).click();
		
	}
}