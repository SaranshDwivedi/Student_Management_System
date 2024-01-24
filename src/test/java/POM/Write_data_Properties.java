package POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Write_data_Properties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\configs.properties");
		Properties prop = new Properties();
		prop.setProperty("browser", "edge");
		prop.setProperty("url", "http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		prop.setProperty("username", "admin@gmail.com");
		prop.setProperty("password", "12345");
		
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\configs.properties");
		prop.store(fos, "input creds to admin");
		prop.load(fis);
	}
}
