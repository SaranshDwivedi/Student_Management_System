package POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Data_Into_Excel_Sheet {

	public static void main(String[] args) throws Exception, Exception 
	{
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	Row row = sheet.createRow(6);
	Cell cell = row.createCell(6);
	cell.setCellValue("Company");
	
	FileOutputStream fos = new FileOutputStream(".\\src\\test\\\\resources\\TestData.xlsx");
	wb.write(fos);
	
	wb.close();
	}
}
