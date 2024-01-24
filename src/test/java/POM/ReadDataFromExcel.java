package POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/ExcelData.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		
		int row=sheet.getPhysicalNumberOfRows();
		int cell=sheet.getRow(0).getPhysicalNumberOfCells();
		boolean flag=false;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<cell;j++) {
				String value=sheet.getRow(i).getCell(j).toString();
				
				if(value.contentEquals("Subham")) {
					value=sheet.getRow(i).getCell(j+1).toString();
					System.out.println(value);
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("Invalid data");
		}
	}
}
