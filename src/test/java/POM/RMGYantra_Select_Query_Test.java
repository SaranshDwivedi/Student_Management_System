package POM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.mysql.cj.jdbc.Driver;

public class RMGYantra_Select_Query_Test 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, SQLException 
	{
		Connection con = null;
		String project_name = "SMS_SDET53";
		try {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.navigate().to("http://rmgtestingserver:8084/");
			Thread.sleep(2000);
			driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
			Thread.sleep(2000);
			driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Projects']")).click();
			Thread.sleep(1000);
			//		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
			//		Thread.sleep(1000);
			//		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys("SMS_SDET53");
			//		Thread.sleep(1000);
			//		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("Pavani");
			//		Thread.sleep(1000);
			//		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

			//connecting Data Base
			

			//register data base
			Driver drv = new Driver();
			DriverManager.registerDriver(drv);

			//connect
			con = DriverManager.getConnection("jdbc://rmgtestingserver:3333/projects", "root@%", "root");
			Statement state = con.createStatement();

			//3
			String query = "select * from project where lower(project_name) = '"+project_name+"');";

			ResultSet result = state.executeQuery(query);
			Boolean flag = false;

			while(result.next())
			{
				String actual = result.getString(1);
				if(actual.contains(project_name)) {
					System.out.println("----project created successfully----");
					flag = true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("----project not created successfully----");
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			con.close();
		}
	}
}
