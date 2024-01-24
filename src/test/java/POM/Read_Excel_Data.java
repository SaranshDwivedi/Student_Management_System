package POM;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Excel_Data {

	public static void main(String[] args) throws Exception {
		for(int i = 0; i < 4; i++)
		{
			FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			
			for(int j = i; j <= i; j++)
			{
				Sheet sh = wb.getSheet("Sheet1");
				Row r = sh.getRow(j);
				Cell c = r.getCell(1);
				String d1 = c.getStringCellValue();
				System.out.println(data+ " "+d1);
			}
		}
	}
}
