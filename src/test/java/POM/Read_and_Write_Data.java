package POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Read_and_Write_Data {
	static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config.properties");
		
		Properties prop = new Properties();
		
		//store the valuses
		prop.setProperty("browser", "edge");
		prop.setProperty("url", "http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		prop.setProperty("username", "admin@gmail.com");
		prop.setProperty("password", "12345");
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\config.properties");
		
		prop.store(fos, "write data");
		
		//FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\config.properties");
		prop.load(fis);
		
		String BROWSER = prop.getProperty("browser");
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		
		driver = new EdgeDriver();
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disabled-notifications=*");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.navigate().to(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);
		driver.findElement(By.id("btnSubmit")).click();
	}
}
