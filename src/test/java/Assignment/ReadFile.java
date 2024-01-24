package Assignment;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

import au.com.bytecode.opencsv.CSVReader;

public class ReadFile
{
	static WebDriver driver;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		WebDriverManager.edgedriver().setup();
//		driver = new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//		driver.navigate().to("");
		
		//Read File of CSV
//		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.csv");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sheet = wb.getSheet("IPL");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String data = cell.getStringCellValue();
//		System.out.println(data);
		
		CSVReader reader = new CSVReader(new FileReader("./src/test/resources/TestDatas.csv"));
		String[] cell;
		while((cell = reader.readNext()) != null)
		{
			for(int i = 0; i < 1; i++)
			{
				String name = cell[i];
				String email = cell[i+1];
				String message = cell[i+2];
				
				System.out.println(name);
				System.out.println(email);
				System.out.println(message);
			}
		}
	}
}
